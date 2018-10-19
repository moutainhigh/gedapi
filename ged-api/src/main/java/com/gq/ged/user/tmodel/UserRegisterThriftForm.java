/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.gq.ged.user.tmodel;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-02-07")
public class UserRegisterThriftForm implements org.apache.thrift.TBase<UserRegisterThriftForm, UserRegisterThriftForm._Fields>, java.io.Serializable, Cloneable, Comparable<UserRegisterThriftForm> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserRegisterThriftForm");

  private static final org.apache.thrift.protocol.TField MOBILE_FIELD_DESC = new org.apache.thrift.protocol.TField("mobile", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField RECOMMEND_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("recommendCode", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserRegisterThriftFormStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserRegisterThriftFormTupleSchemeFactory();

  public String mobile; // required
  public String password; // required
  public String code; // required
  public String recommendCode; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MOBILE((short)1, "mobile"),
    PASSWORD((short)2, "password"),
    CODE((short)3, "code"),
    RECOMMEND_CODE((short)4, "recommendCode");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MOBILE
          return MOBILE;
        case 2: // PASSWORD
          return PASSWORD;
        case 3: // CODE
          return CODE;
        case 4: // RECOMMEND_CODE
          return RECOMMEND_CODE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) {
          throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      }
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MOBILE, new org.apache.thrift.meta_data.FieldMetaData("mobile", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RECOMMEND_CODE, new org.apache.thrift.meta_data.FieldMetaData("recommendCode", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserRegisterThriftForm.class, metaDataMap);
  }

  public UserRegisterThriftForm() {
  }

  public UserRegisterThriftForm(
    String mobile,
    String password,
    String code,
    String recommendCode)
  {
    this();
    this.mobile = mobile;
    this.password = password;
    this.code = code;
    this.recommendCode = recommendCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserRegisterThriftForm(UserRegisterThriftForm other) {
    if (other.isSetMobile()) {
      this.mobile = other.mobile;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetRecommendCode()) {
      this.recommendCode = other.recommendCode;
    }
  }

  @Override
  public UserRegisterThriftForm deepCopy() {
    return new UserRegisterThriftForm(this);
  }

  @Override
  public void clear() {
    this.mobile = null;
    this.password = null;
    this.code = null;
    this.recommendCode = null;
  }

  public String getMobile() {
    return this.mobile;
  }

  public UserRegisterThriftForm setMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public void unsetMobile() {
    this.mobile = null;
  }

  /** Returns true if field mobile is set (has been assigned a value) and false otherwise */
  public boolean isSetMobile() {
    return this.mobile != null;
  }

  public void setMobileIsSet(boolean value) {
    if (!value) {
      this.mobile = null;
    }
  }

  public String getPassword() {
    return this.password;
  }

  public UserRegisterThriftForm setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public String getCode() {
    return this.code;
  }

  public UserRegisterThriftForm setCode(String code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public String getRecommendCode() {
    return this.recommendCode;
  }

  public UserRegisterThriftForm setRecommendCode(String recommendCode) {
    this.recommendCode = recommendCode;
    return this;
  }

  public void unsetRecommendCode() {
    this.recommendCode = null;
  }

  /** Returns true if field recommendCode is set (has been assigned a value) and false otherwise */
  public boolean isSetRecommendCode() {
    return this.recommendCode != null;
  }

  public void setRecommendCodeIsSet(boolean value) {
    if (!value) {
      this.recommendCode = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MOBILE:
      if (value == null) {
        unsetMobile();
      } else {
        setMobile((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((String)value);
      }
      break;

    case RECOMMEND_CODE:
      if (value == null) {
        unsetRecommendCode();
      } else {
        setRecommendCode((String)value);
      }
      break;

    }
  }

  @Override
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MOBILE:
      return getMobile();

    case PASSWORD:
      return getPassword();

    case CODE:
      return getCode();

    case RECOMMEND_CODE:
      return getRecommendCode();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MOBILE:
      return isSetMobile();
    case PASSWORD:
      return isSetPassword();
    case CODE:
      return isSetCode();
    case RECOMMEND_CODE:
      return isSetRecommendCode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null) {
        return false;
    }
    if (that instanceof UserRegisterThriftForm) {
        return this.equals((UserRegisterThriftForm)that);
    }
    return false;
  }

  public boolean equals(UserRegisterThriftForm that) {
    if (that == null) {
        return false;
    }
    if (this == that) {
        return true;
    }

    boolean this_present_mobile = true && this.isSetMobile();
    boolean that_present_mobile = true && that.isSetMobile();
    if (this_present_mobile || that_present_mobile) {
      if (!(this_present_mobile && that_present_mobile)) {
          return false;
      }
      if (!this.mobile.equals(that.mobile)) {
          return false;
      }
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password)) {
          return false;
      }
      if (!this.password.equals(that.password)) {
          return false;
      }
    }

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code)) {
          return false;
      }
      if (!this.code.equals(that.code)) {
          return false;
      }
    }

    boolean this_present_recommendCode = true && this.isSetRecommendCode();
    boolean that_present_recommendCode = true && that.isSetRecommendCode();
    if (this_present_recommendCode || that_present_recommendCode) {
      if (!(this_present_recommendCode && that_present_recommendCode)) {
          return false;
      }
      if (!this.recommendCode.equals(that.recommendCode)) {
          return false;
      }
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMobile()) ? 131071 : 524287);
    if (isSetMobile()) {
        hashCode = hashCode * 8191 + mobile.hashCode();
    }

    hashCode = hashCode * 8191 + ((isSetPassword()) ? 131071 : 524287);
    if (isSetPassword()) {
        hashCode = hashCode * 8191 + password.hashCode();
    }

    hashCode = hashCode * 8191 + ((isSetCode()) ? 131071 : 524287);
    if (isSetCode()) {
        hashCode = hashCode * 8191 + code.hashCode();
    }

    hashCode = hashCode * 8191 + ((isSetRecommendCode()) ? 131071 : 524287);
    if (isSetRecommendCode()) {
        hashCode = hashCode * 8191 + recommendCode.hashCode();
    }

    return hashCode;
  }

  @Override
  public int compareTo(UserRegisterThriftForm other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMobile()).compareTo(other.isSetMobile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobile, other.mobile);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecommendCode()).compareTo(other.isSetRecommendCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecommendCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recommendCode, other.recommendCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UserRegisterThriftForm(");
    boolean first = true;

    sb.append("mobile:");
    if (this.mobile == null) {
      sb.append("null");
    } else {
      sb.append(this.mobile);
    }
    first = false;
    if (!first) {
        sb.append(", ");
    }
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
    }
    first = false;
    if (!first) {
        sb.append(", ");
    }
    sb.append("code:");
    if (this.code == null) {
      sb.append("null");
    } else {
      sb.append(this.code);
    }
    first = false;
    if (!first) {
        sb.append(", ");
    }
    sb.append("recommendCode:");
    if (this.recommendCode == null) {
      sb.append("null");
    } else {
      sb.append(this.recommendCode);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserRegisterThriftFormStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public UserRegisterThriftFormStandardScheme getScheme() {
      return new UserRegisterThriftFormStandardScheme();
    }
  }

  private static class UserRegisterThriftFormStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserRegisterThriftForm> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, UserRegisterThriftForm struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MOBILE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mobile = iprot.readString();
              struct.setMobileIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RECOMMEND_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.recommendCode = iprot.readString();
              struct.setRecommendCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, UserRegisterThriftForm struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mobile != null) {
        oprot.writeFieldBegin(MOBILE_FIELD_DESC);
        oprot.writeString(struct.mobile);
        oprot.writeFieldEnd();
      }
      if (struct.password != null) {
        oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
        oprot.writeString(struct.password);
        oprot.writeFieldEnd();
      }
      if (struct.code != null) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeString(struct.code);
        oprot.writeFieldEnd();
      }
      if (struct.recommendCode != null) {
        oprot.writeFieldBegin(RECOMMEND_CODE_FIELD_DESC);
        oprot.writeString(struct.recommendCode);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserRegisterThriftFormTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public UserRegisterThriftFormTupleScheme getScheme() {
      return new UserRegisterThriftFormTupleScheme();
    }
  }

  private static class UserRegisterThriftFormTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserRegisterThriftForm> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserRegisterThriftForm struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMobile()) {
        optionals.set(0);
      }
      if (struct.isSetPassword()) {
        optionals.set(1);
      }
      if (struct.isSetCode()) {
        optionals.set(2);
      }
      if (struct.isSetRecommendCode()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetMobile()) {
        oprot.writeString(struct.mobile);
      }
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
      if (struct.isSetCode()) {
        oprot.writeString(struct.code);
      }
      if (struct.isSetRecommendCode()) {
        oprot.writeString(struct.recommendCode);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserRegisterThriftForm struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.mobile = iprot.readString();
        struct.setMobileIsSet(true);
      }
      if (incoming.get(1)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
      if (incoming.get(2)) {
        struct.code = iprot.readString();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.recommendCode = iprot.readString();
        struct.setRecommendCodeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

