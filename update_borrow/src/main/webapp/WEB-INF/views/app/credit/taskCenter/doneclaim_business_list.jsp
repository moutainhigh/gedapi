<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>待分配任务列表</title>
<meta name="decorator" content="default" />
<script type="text/javascript">
	function page(n, s) {
		$("#pageNo").val(n);
		$("#pageSize").val(s);
		if ($("#pageNo")[0].value.length > 10) {
			top.$.jBox.tip('当前页码大小长度不能大于10位！');
			return true;
		}
		if ($("#pageSize")[0].value.length > 10) {
			top.$.jBox.tip('每页条数大小的长度不能大于10位！');
			return true
		}
		loading();
		$("#searchForm").submit();
		return false;
	}

	function fromReset() {
		$("#cusName").val('');
		$("#idNum").val('');
		$("#applyNo").val('');
		$("#createStartTime").val('');
		$("#createEndTime").val('');
		page();//查询
	}
	//全选
	function selectAll() {
		if ($('[name=all]:checkbox').attr("checked") == "checked") {
			$('[name=pcheck]:checkbox').attr("checked", true);
		} else {
			$('[name=pcheck]:checkbox').attr("checked", false);
		}
	}
	//单选
	function selectSingle() {
		$("[name=pcheck]:checkbox").each(function() {
			$(this).click(function() {
				if ($(this).attr("checked")) {
					$("[name=pcheck]:checkbox").removeAttr("checked");
					$(this).attr("checked", "checked");
				}
			});
		});
	}

	function timeJudge() {
		if ($("#createStartTime").val() != '' & $("#createEndTime").val() != '') {
			if ($("#createStartTime").val() > $("#createEndTime").val()) {
				alertx("开始时间应小于结束时间！");
				return;
			} else {
				loading();
				$("#searchForm").submit();
				return;
			}
		}
		loading();
		$("#searchForm").submit();
	}
	//获取复选框的val
	function getCheckBoxVal() {
		var str = "";
		$("input[name=pcheck]:checked").each(function() {
			if ($(this).attr("checked")) {
				str += $(this).val() + ",";
			}
		});
		return str;
	}
	//获取PROCDEF
	function getProcHiddenVal() {
		var str = "";
		$("input[name=pcheck]:checked").each(function() {
			if ($(this).attr("checked")) {
				str = $(this).next("input[name=pHiddenPro]:hidden").val();
			}
		});
		return str;
	}
	//获取EXEC
	function getExecHiddenVal() {
		var str = "";
		$("input[name=pcheck]:checked").each(function() {
			if ($(this).attr("checked")) {
				str = $(this).next("input[name=pHiddenPro]:hidden").next("input[name=pHiddenExe]:hidden").val();
			}
		});
		return str;
	}

	//获取taskId
	function getTaskHiddenVal() {
		var str = "";
		$("input[name=pcheck]:checked").each(function() {
			if ($(this).attr("checked")) {
				str = $(this).next("input[name=pHiddenPro]:hidden").next("input[name=pHiddenExe]:hidden").next("input[name=pHiddenTak]:hidden").val();
			}
		});
		return str;
	}
	//获取Id
	function getIdHiddenVal() {
		var str = "";
		$("input[name=pcheck]:checked").each(function() {
			if ($(this).attr("checked")) {
				str = $(this).next("input[name=pHiddenPro]:hidden").next("input[name=pHiddenExe]:hidden").next("input[name=pHiddenTak]:hidden").next("input[name=pHiddenid]:hidden").val();
			}
		});
		return str;
	}

	//获取applyCode
	function getApplyCodeVal() {
		var str = "";
		$("input[name=pcheck]:checked").each(function() {
			if ($(this).attr("checked")) {
				str = $(this).parent().next().next().next().next().next().text();
			}
		});
		return str;
	}
	var width = $(window).width() - 300;
	var height = $(window).height() - 200;
	//流程轨迹
	function processTrack() {
		var str = getCheckBoxVal();
		if (str != "") {
			if (str.indexOf(",") != str.length - 1) {
				alertx("请不要选择多条对应的流程任务");
			} else {
				var taskDefKey = $("#taskDefKey").val();
				str = str.substring(0, str.length - 1);
				var url = "${ctx}/credit/taskCenter/processTrack?procInstId=" + str + " &taskDefKey= " + taskDefKey;
				openJBox("box_processTrack", url, "流程轨迹", $(document).width() - 100, $(document).height() - 100);
			}
		} else {
			alertx("请选择对应的流程任务");
		}
	}

	//流程图
	function tracePhoto() {
		var str = getCheckBoxVal();
		if (str != "") {
			if (str.indexOf(",") != str.length - 1) {
				alertx("请不要选择多条对应的流程任务");
			} else {
				str = str.substring(0, str.length - 1);
				var procDefId = getProcHiddenVal();
				var execId = getExecHiddenVal();
				var url = "${ctx}/credit/taskCenter/trace/photo/" + procDefId + "/" + execId;
				openJBox("box_tracePhoto", url, "流程图", $(document).width() - 100, $(document).height() - 100);
			}
		} else {
			alertx("请选择对应的流程任务");
		}
	}

	function showBusiness() {
		var str = getCheckBoxVal();
		if (str != "") {
			if (str.indexOf(",") != str.length - 1) {
				alertx("请不要选择多条对应的流程任务");
			} else {
				$("input[name=pcheck]:checked").each(function() {
					if ($(this).attr("checked")) {
						var checkboxId = $(this).attr("id");
						$("#" + checkboxId + "_alink").click();
					}
				});
			}
		} else {
			alertx("请选择对应的流程任务");
		}
	}

	//任务详情
	function showSignBusiness(procDefId, execId, taskDefKey, id, title, taskId, procInstId) {
		var url = "${ctx}/credit/taskCenter/loadTaskAddr/" + procDefId + "/" + execId + "/" + taskDefKey + "?taskId=" + taskId;
		$.ajax({
		type : "post",
		url : url,
		dataType : "json",
		success : function(data) {
			if (data.flag == "fail") {
				alertx("任务查询失败！无法获取任务地址信息！");
			} else {
				//url
				var location = data.location;
				var canRedo = data.canRedo;
				//flag表示未办理0已办理1
				var flag = "1";
				var newUrl = "${ctx}" + location + "?procDefId=" + procDefId + "&taskDefKey=" + taskDefKey + "&applyNo=" + id + "&execId=" + execId + "&status=" + flag + "&title=" + title + "&taskId=" + taskId + "&procInstId=" + procInstId + "&canRedo=" + canRedo+"&headUrl=${headUrl}";
				//openJBox("box_" + execId, newUrl, title, width, height);
				goToPage(newUrl,'doneclaimListSkipId');
			}
		},
		error : function(msg) {
			alertx("任务查询失败！无法获取任务地址信息！");
		}
		});
	}
</script>
</head>
<body>
	<div class="wrapper">
		<div class="searchInfo">
			<h3 class="searchTitle">查询条件</h3>
			<div class="searchCon">
				<form:form id="searchForm" modelAttribute="customer" action="${ctx}/credit/taskCenter/doneClaimlist" method="post">
					<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}" />
					<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}" />
					<input id="taskDefKey" name="taskDefKey" type="hidden" value="${taskDefKey}" />
					<div class="filter">
						<table class="searchTable">
							<tr>
								<td class="ft_label">客户名称：</td>
								<td class="ft_content">
									<input id="cusName" name="cusName" type="text" maxlength="50" class="input-medium" value="${customer.cusName }" />
								</td>
								<td class="ft_label">证件号码：</td>
								<td class="ft_content">
									<input id="idNum" name="idNum" type="text" maxlength="50" class="input-medium" value="${customer.idNum }" />
								</td>
							</tr>
							<tr>
								<td class="ft_label">申请编号：</td>
								<td class="ft_content">
									<input id="applyNo" name="applyNo" type="text" maxlength="50" class="input-medium" value="${customer.applyNo }" />
								</td>
								<td class="ft_label">创建时间：</td>
								<td class="ft_content">
									<input id="createStartTime" name="createStartTime" type="text" readonly="readonly" maxlength="20" class="input-mini Wdate" value="<fmt:formatDate value="${customer.createStartTime }" pattern="yyyy-MM-dd"/>" onclick="WdatePicker({onpicked:dateWhite(this),dateFmt:'yyyy-MM-dd',isShowClear:true});" />
									<label>&nbsp;--&nbsp;</label>
									<input id="createEndTime" name="createEndTime" type="text" readonly="readonly" maxlength="20" class="input-mini Wdate" value="<fmt:formatDate value="${customer.createEndTime }" pattern="yyyy-MM-dd"/>" onclick="WdatePicker({onpicked:dateWhite(this),dateFmt:'yyyy-MM-dd',isShowClear:true});" />
								</td>
							</tr>
						</table>
						<div class="searchButton">
							<input id="btnSubmit" class="btn btn-primary" type="button" value="查询" onclick="timeJudge();" />
							&nbsp;
							<input id="btnReset" class="btn btn-primary" type="button" value="重置" onclick="return fromReset();" />
						</div>
					</div>
				</form:form>
			</div>
		</div>
		<sys:message content="${message}" />
		<div class="ribbon">
			<ul class="layout">
				<li class="mcp_info">
					<a href="#" id="processDo" onclick="showBusiness()">
						<span>
							<b></b>
							详情
						</span>
					</a>
				</li>
				<li class="mcp_pic">
					<a href="#" id="processPicture" onclick="tracePhoto()">
						<span>
							<b></b>
							流程图
						</span>
					</a>
				</li>
				<li class="mcp_change">
					<a href="#" id="processTrack" onclick="processTrack()">
						<span>
							<b></b>
							流程轨迹
						</span>
					</a>
				</li>
			</ul>
		</div>
		<div class="tableList">
			<h3 class="tableTitle">数据列表</h3>
			<div id="tableDataId" style="max-height:400px;overflow:auto;">
				<table cellpadding="0" cellspacing="0" border="0" width="100%">
					<tr>
						<th width="4%">
							<input type="checkbox" onclick="selectAll()" name="all" id="all" />
						</th>
						<th width="11%">任务名称</th>
						<th width="11%">客户名称</th>
						<th width="11%">证件类型</th>
						<th width="15%">证件号</th>
						<th width="15%">申请编号</th>
						<th width="11%">分配对象</th>
						<th width="11%">登记门店</th>
						<th width="11%">创建时间</th>
					</tr>
					<c:forEach items="${page.list}" var="process" varStatus="index">
						<c:if test="${0 == index.count%2}">
							<tr class="doubleRow">
						</c:if>
						<c:if test="${1 == index.count%2}">
							<tr>
						</c:if>
						<td width="20px">
							<input type="checkbox" value="${process.PROC_INS_ID}" name="pcheck" onclick="selectSingle()" id="c_${index.count}" taskId="${process.ID }">
							<input type="hidden" value="${process.procDefId }" name="pHiddenPro">
							<input type="hidden" value="${process.execId }" name="pHiddenExe">
							<input type="hidden" value="${process.taskDefKey }" name="pHiddenTak">
							<input type="hidden" value="${process.applyNo }" name="pHiddenid">
							<input type="hidden" value="${process.ID }" name="pHiddenid">
						</td>
						<td class="title">
							<a href="javascript:void(0)" id="c_${index.count}_alink" onclick="showSignBusiness('${process.procDefId }','${process.execId }','${process.taskDefKey }','${process.applyNo }','${process.processName}','${process.ID }','${process.PROC_INS_ID}')">${process.processName}</a>
						</td>
						<a id="doneclaimListSkipId" ></a>
						<td style="word-break:break-all;word-wrap:break-word;">${process.CUST_NAME}</td>
						<td class="title">${fns:getDictLabel(process.ID_TYPE, 'CUSTOMER_P_ID_TYPE', '')}</td>
						<td class="title">${process.ID_NUM}</td>
						<td class="title">${process.applyNo}</td>
						<td class="title">${process.allocator}</td>
						<td class="title">${process.ORG_ID}</td>
						<td class="title">
							<fmt:formatDate value="${process.CREATETIME }" type="both" pattern="yyyy-MM-dd HH:mm:ss" />
						</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<div class="pagination">${page}</div>
		</div>
	</div>
</body>
</html>