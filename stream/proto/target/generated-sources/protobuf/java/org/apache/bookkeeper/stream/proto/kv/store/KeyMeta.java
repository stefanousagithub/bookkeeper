// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv_store.proto

package org.apache.bookkeeper.stream.proto.kv.store;

/**
 * <pre>
 * KeyRecord holds mvcc metadata for a given key
 * </pre>
 *
 * Protobuf type {@code bookkeeper.proto.kv.store.KeyMeta}
 */
public final class KeyMeta extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookkeeper.proto.kv.store.KeyMeta)
    KeyMetaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeyMeta.newBuilder() to construct.
  private KeyMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeyMeta() {
    valueType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeyMeta();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.bookkeeper.stream.proto.kv.store.KvStore.internal_static_bookkeeper_proto_kv_store_KeyMeta_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.bookkeeper.stream.proto.kv.store.KvStore.internal_static_bookkeeper_proto_kv_store_KeyMeta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.bookkeeper.stream.proto.kv.store.KeyMeta.class, org.apache.bookkeeper.stream.proto.kv.store.KeyMeta.Builder.class);
  }

  public static final int CREATE_REVISION_FIELD_NUMBER = 1;
  private long createRevision_;
  /**
   * <pre>
   * create_revision is the revision of the last creation on the key
   * </pre>
   *
   * <code>int64 create_revision = 1;</code>
   * @return The createRevision.
   */
  @java.lang.Override
  public long getCreateRevision() {
    return createRevision_;
  }

  public static final int MOD_REVISION_FIELD_NUMBER = 2;
  private long modRevision_;
  /**
   * <pre>
   * mod_revision is the revision of the last modification on the key
   * </pre>
   *
   * <code>int64 mod_revision = 2;</code>
   * @return The modRevision.
   */
  @java.lang.Override
  public long getModRevision() {
    return modRevision_;
  }

  public static final int VERSION_FIELD_NUMBER = 3;
  private long version_;
  /**
   * <pre>
   * version is the version of the most recent value
   * </pre>
   *
   * <code>int64 version = 3;</code>
   * @return The version.
   */
  @java.lang.Override
  public long getVersion() {
    return version_;
  }

  public static final int VALUE_TYPE_FIELD_NUMBER = 4;
  private int valueType_;
  /**
   * <pre>
   * value type
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.store.ValueType value_type = 4;</code>
   * @return The enum numeric value on the wire for valueType.
   */
  @java.lang.Override public int getValueTypeValue() {
    return valueType_;
  }
  /**
   * <pre>
   * value type
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.store.ValueType value_type = 4;</code>
   * @return The valueType.
   */
  @java.lang.Override public org.apache.bookkeeper.stream.proto.kv.store.ValueType getValueType() {
    @SuppressWarnings("deprecation")
    org.apache.bookkeeper.stream.proto.kv.store.ValueType result = org.apache.bookkeeper.stream.proto.kv.store.ValueType.valueOf(valueType_);
    return result == null ? org.apache.bookkeeper.stream.proto.kv.store.ValueType.UNRECOGNIZED : result;
  }

  public static final int EXPIRETIME_FIELD_NUMBER = 5;
  private long expireTime_;
  /**
   * <pre>
   * time in milliseconds when the record expires (0 for none)
   * </pre>
   *
   * <code>int64 expireTime = 5;</code>
   * @return The expireTime.
   */
  @java.lang.Override
  public long getExpireTime() {
    return expireTime_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (createRevision_ != 0L) {
      output.writeInt64(1, createRevision_);
    }
    if (modRevision_ != 0L) {
      output.writeInt64(2, modRevision_);
    }
    if (version_ != 0L) {
      output.writeInt64(3, version_);
    }
    if (valueType_ != org.apache.bookkeeper.stream.proto.kv.store.ValueType.BYTES.getNumber()) {
      output.writeEnum(4, valueType_);
    }
    if (expireTime_ != 0L) {
      output.writeInt64(5, expireTime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (createRevision_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, createRevision_);
    }
    if (modRevision_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, modRevision_);
    }
    if (version_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, version_);
    }
    if (valueType_ != org.apache.bookkeeper.stream.proto.kv.store.ValueType.BYTES.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, valueType_);
    }
    if (expireTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, expireTime_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.bookkeeper.stream.proto.kv.store.KeyMeta)) {
      return super.equals(obj);
    }
    org.apache.bookkeeper.stream.proto.kv.store.KeyMeta other = (org.apache.bookkeeper.stream.proto.kv.store.KeyMeta) obj;

    if (getCreateRevision()
        != other.getCreateRevision()) return false;
    if (getModRevision()
        != other.getModRevision()) return false;
    if (getVersion()
        != other.getVersion()) return false;
    if (valueType_ != other.valueType_) return false;
    if (getExpireTime()
        != other.getExpireTime()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CREATE_REVISION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreateRevision());
    hash = (37 * hash) + MOD_REVISION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getModRevision());
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVersion());
    hash = (37 * hash) + VALUE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + valueType_;
    hash = (37 * hash) + EXPIRETIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpireTime());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.bookkeeper.stream.proto.kv.store.KeyMeta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.store.KeyMeta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.store.KeyMeta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.store.KeyMeta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.store.KeyMeta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.store.KeyMeta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.store.KeyMeta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.store.KeyMeta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.store.KeyMeta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.store.KeyMeta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.store.KeyMeta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.store.KeyMeta parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.bookkeeper.stream.proto.kv.store.KeyMeta prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * KeyRecord holds mvcc metadata for a given key
   * </pre>
   *
   * Protobuf type {@code bookkeeper.proto.kv.store.KeyMeta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookkeeper.proto.kv.store.KeyMeta)
      org.apache.bookkeeper.stream.proto.kv.store.KeyMetaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.bookkeeper.stream.proto.kv.store.KvStore.internal_static_bookkeeper_proto_kv_store_KeyMeta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.bookkeeper.stream.proto.kv.store.KvStore.internal_static_bookkeeper_proto_kv_store_KeyMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.bookkeeper.stream.proto.kv.store.KeyMeta.class, org.apache.bookkeeper.stream.proto.kv.store.KeyMeta.Builder.class);
    }

    // Construct using org.apache.bookkeeper.stream.proto.kv.store.KeyMeta.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      createRevision_ = 0L;

      modRevision_ = 0L;

      version_ = 0L;

      valueType_ = 0;

      expireTime_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.bookkeeper.stream.proto.kv.store.KvStore.internal_static_bookkeeper_proto_kv_store_KeyMeta_descriptor;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.store.KeyMeta getDefaultInstanceForType() {
      return org.apache.bookkeeper.stream.proto.kv.store.KeyMeta.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.store.KeyMeta build() {
      org.apache.bookkeeper.stream.proto.kv.store.KeyMeta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.store.KeyMeta buildPartial() {
      org.apache.bookkeeper.stream.proto.kv.store.KeyMeta result = new org.apache.bookkeeper.stream.proto.kv.store.KeyMeta(this);
      result.createRevision_ = createRevision_;
      result.modRevision_ = modRevision_;
      result.version_ = version_;
      result.valueType_ = valueType_;
      result.expireTime_ = expireTime_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.bookkeeper.stream.proto.kv.store.KeyMeta) {
        return mergeFrom((org.apache.bookkeeper.stream.proto.kv.store.KeyMeta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.bookkeeper.stream.proto.kv.store.KeyMeta other) {
      if (other == org.apache.bookkeeper.stream.proto.kv.store.KeyMeta.getDefaultInstance()) return this;
      if (other.getCreateRevision() != 0L) {
        setCreateRevision(other.getCreateRevision());
      }
      if (other.getModRevision() != 0L) {
        setModRevision(other.getModRevision());
      }
      if (other.getVersion() != 0L) {
        setVersion(other.getVersion());
      }
      if (other.valueType_ != 0) {
        setValueTypeValue(other.getValueTypeValue());
      }
      if (other.getExpireTime() != 0L) {
        setExpireTime(other.getExpireTime());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              createRevision_ = input.readInt64();

              break;
            } // case 8
            case 16: {
              modRevision_ = input.readInt64();

              break;
            } // case 16
            case 24: {
              version_ = input.readInt64();

              break;
            } // case 24
            case 32: {
              valueType_ = input.readEnum();

              break;
            } // case 32
            case 40: {
              expireTime_ = input.readInt64();

              break;
            } // case 40
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private long createRevision_ ;
    /**
     * <pre>
     * create_revision is the revision of the last creation on the key
     * </pre>
     *
     * <code>int64 create_revision = 1;</code>
     * @return The createRevision.
     */
    @java.lang.Override
    public long getCreateRevision() {
      return createRevision_;
    }
    /**
     * <pre>
     * create_revision is the revision of the last creation on the key
     * </pre>
     *
     * <code>int64 create_revision = 1;</code>
     * @param value The createRevision to set.
     * @return This builder for chaining.
     */
    public Builder setCreateRevision(long value) {
      
      createRevision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * create_revision is the revision of the last creation on the key
     * </pre>
     *
     * <code>int64 create_revision = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreateRevision() {
      
      createRevision_ = 0L;
      onChanged();
      return this;
    }

    private long modRevision_ ;
    /**
     * <pre>
     * mod_revision is the revision of the last modification on the key
     * </pre>
     *
     * <code>int64 mod_revision = 2;</code>
     * @return The modRevision.
     */
    @java.lang.Override
    public long getModRevision() {
      return modRevision_;
    }
    /**
     * <pre>
     * mod_revision is the revision of the last modification on the key
     * </pre>
     *
     * <code>int64 mod_revision = 2;</code>
     * @param value The modRevision to set.
     * @return This builder for chaining.
     */
    public Builder setModRevision(long value) {
      
      modRevision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * mod_revision is the revision of the last modification on the key
     * </pre>
     *
     * <code>int64 mod_revision = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearModRevision() {
      
      modRevision_ = 0L;
      onChanged();
      return this;
    }

    private long version_ ;
    /**
     * <pre>
     * version is the version of the most recent value
     * </pre>
     *
     * <code>int64 version = 3;</code>
     * @return The version.
     */
    @java.lang.Override
    public long getVersion() {
      return version_;
    }
    /**
     * <pre>
     * version is the version of the most recent value
     * </pre>
     *
     * <code>int64 version = 3;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(long value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * version is the version of the most recent value
     * </pre>
     *
     * <code>int64 version = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = 0L;
      onChanged();
      return this;
    }

    private int valueType_ = 0;
    /**
     * <pre>
     * value type
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.store.ValueType value_type = 4;</code>
     * @return The enum numeric value on the wire for valueType.
     */
    @java.lang.Override public int getValueTypeValue() {
      return valueType_;
    }
    /**
     * <pre>
     * value type
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.store.ValueType value_type = 4;</code>
     * @param value The enum numeric value on the wire for valueType to set.
     * @return This builder for chaining.
     */
    public Builder setValueTypeValue(int value) {
      
      valueType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * value type
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.store.ValueType value_type = 4;</code>
     * @return The valueType.
     */
    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.store.ValueType getValueType() {
      @SuppressWarnings("deprecation")
      org.apache.bookkeeper.stream.proto.kv.store.ValueType result = org.apache.bookkeeper.stream.proto.kv.store.ValueType.valueOf(valueType_);
      return result == null ? org.apache.bookkeeper.stream.proto.kv.store.ValueType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * value type
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.store.ValueType value_type = 4;</code>
     * @param value The valueType to set.
     * @return This builder for chaining.
     */
    public Builder setValueType(org.apache.bookkeeper.stream.proto.kv.store.ValueType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      valueType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * value type
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.store.ValueType value_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearValueType() {
      
      valueType_ = 0;
      onChanged();
      return this;
    }

    private long expireTime_ ;
    /**
     * <pre>
     * time in milliseconds when the record expires (0 for none)
     * </pre>
     *
     * <code>int64 expireTime = 5;</code>
     * @return The expireTime.
     */
    @java.lang.Override
    public long getExpireTime() {
      return expireTime_;
    }
    /**
     * <pre>
     * time in milliseconds when the record expires (0 for none)
     * </pre>
     *
     * <code>int64 expireTime = 5;</code>
     * @param value The expireTime to set.
     * @return This builder for chaining.
     */
    public Builder setExpireTime(long value) {
      
      expireTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time in milliseconds when the record expires (0 for none)
     * </pre>
     *
     * <code>int64 expireTime = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpireTime() {
      
      expireTime_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bookkeeper.proto.kv.store.KeyMeta)
  }

  // @@protoc_insertion_point(class_scope:bookkeeper.proto.kv.store.KeyMeta)
  private static final org.apache.bookkeeper.stream.proto.kv.store.KeyMeta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.bookkeeper.stream.proto.kv.store.KeyMeta();
  }

  public static org.apache.bookkeeper.stream.proto.kv.store.KeyMeta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeyMeta>
      PARSER = new com.google.protobuf.AbstractParser<KeyMeta>() {
    @java.lang.Override
    public KeyMeta parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<KeyMeta> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeyMeta> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.kv.store.KeyMeta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

