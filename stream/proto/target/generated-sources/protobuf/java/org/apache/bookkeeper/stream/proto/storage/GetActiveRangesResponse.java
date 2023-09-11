// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storage.proto

package org.apache.bookkeeper.stream.proto.storage;

/**
 * Protobuf type {@code bookkeeper.proto.storage.GetActiveRangesResponse}
 */
public final class GetActiveRangesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookkeeper.proto.storage.GetActiveRangesResponse)
    GetActiveRangesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetActiveRangesResponse.newBuilder() to construct.
  private GetActiveRangesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetActiveRangesResponse() {
    code_ = 0;
    ranges_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetActiveRangesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_GetActiveRangesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_GetActiveRangesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse.class, org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <code>.bookkeeper.proto.storage.StatusCode code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  @java.lang.Override public int getCodeValue() {
    return code_;
  }
  /**
   * <code>.bookkeeper.proto.storage.StatusCode code = 1;</code>
   * @return The code.
   */
  @java.lang.Override public org.apache.bookkeeper.stream.proto.storage.StatusCode getCode() {
    @SuppressWarnings("deprecation")
    org.apache.bookkeeper.stream.proto.storage.StatusCode result = org.apache.bookkeeper.stream.proto.storage.StatusCode.valueOf(code_);
    return result == null ? org.apache.bookkeeper.stream.proto.storage.StatusCode.UNRECOGNIZED : result;
  }

  public static final int RANGES_FIELD_NUMBER = 2;
  private java.util.List<org.apache.bookkeeper.stream.proto.storage.RelatedRanges> ranges_;
  /**
   * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.apache.bookkeeper.stream.proto.storage.RelatedRanges> getRangesList() {
    return ranges_;
  }
  /**
   * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.apache.bookkeeper.stream.proto.storage.RelatedRangesOrBuilder> 
      getRangesOrBuilderList() {
    return ranges_;
  }
  /**
   * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
   */
  @java.lang.Override
  public int getRangesCount() {
    return ranges_.size();
  }
  /**
   * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.storage.RelatedRanges getRanges(int index) {
    return ranges_.get(index);
  }
  /**
   * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.storage.RelatedRangesOrBuilder getRangesOrBuilder(
      int index) {
    return ranges_.get(index);
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
    if (code_ != org.apache.bookkeeper.stream.proto.storage.StatusCode.SUCCESS.getNumber()) {
      output.writeEnum(1, code_);
    }
    for (int i = 0; i < ranges_.size(); i++) {
      output.writeMessage(2, ranges_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != org.apache.bookkeeper.stream.proto.storage.StatusCode.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, code_);
    }
    for (int i = 0; i < ranges_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, ranges_.get(i));
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
    if (!(obj instanceof org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse)) {
      return super.equals(obj);
    }
    org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse other = (org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse) obj;

    if (code_ != other.code_) return false;
    if (!getRangesList()
        .equals(other.getRangesList())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    if (getRangesCount() > 0) {
      hash = (37 * hash) + RANGES_FIELD_NUMBER;
      hash = (53 * hash) + getRangesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse parseFrom(
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
  public static Builder newBuilder(org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse prototype) {
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
   * Protobuf type {@code bookkeeper.proto.storage.GetActiveRangesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookkeeper.proto.storage.GetActiveRangesResponse)
      org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_GetActiveRangesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_GetActiveRangesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse.class, org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse.Builder.class);
    }

    // Construct using org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      code_ = 0;

      if (rangesBuilder_ == null) {
        ranges_ = java.util.Collections.emptyList();
      } else {
        ranges_ = null;
        rangesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_GetActiveRangesResponse_descriptor;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse getDefaultInstanceForType() {
      return org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse build() {
      org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse buildPartial() {
      org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse result = new org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse(this);
      int from_bitField0_ = bitField0_;
      result.code_ = code_;
      if (rangesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ranges_ = java.util.Collections.unmodifiableList(ranges_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ranges_ = ranges_;
      } else {
        result.ranges_ = rangesBuilder_.build();
      }
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
      if (other instanceof org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse) {
        return mergeFrom((org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse other) {
      if (other == org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (rangesBuilder_ == null) {
        if (!other.ranges_.isEmpty()) {
          if (ranges_.isEmpty()) {
            ranges_ = other.ranges_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRangesIsMutable();
            ranges_.addAll(other.ranges_);
          }
          onChanged();
        }
      } else {
        if (!other.ranges_.isEmpty()) {
          if (rangesBuilder_.isEmpty()) {
            rangesBuilder_.dispose();
            rangesBuilder_ = null;
            ranges_ = other.ranges_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rangesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRangesFieldBuilder() : null;
          } else {
            rangesBuilder_.addAllMessages(other.ranges_);
          }
        }
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
              code_ = input.readEnum();

              break;
            } // case 8
            case 18: {
              org.apache.bookkeeper.stream.proto.storage.RelatedRanges m =
                  input.readMessage(
                      org.apache.bookkeeper.stream.proto.storage.RelatedRanges.parser(),
                      extensionRegistry);
              if (rangesBuilder_ == null) {
                ensureRangesIsMutable();
                ranges_.add(m);
              } else {
                rangesBuilder_.addMessage(m);
              }
              break;
            } // case 18
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
    private int bitField0_;

    private int code_ = 0;
    /**
     * <code>.bookkeeper.proto.storage.StatusCode code = 1;</code>
     * @return The enum numeric value on the wire for code.
     */
    @java.lang.Override public int getCodeValue() {
      return code_;
    }
    /**
     * <code>.bookkeeper.proto.storage.StatusCode code = 1;</code>
     * @param value The enum numeric value on the wire for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeValue(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.bookkeeper.proto.storage.StatusCode code = 1;</code>
     * @return The code.
     */
    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.storage.StatusCode getCode() {
      @SuppressWarnings("deprecation")
      org.apache.bookkeeper.stream.proto.storage.StatusCode result = org.apache.bookkeeper.stream.proto.storage.StatusCode.valueOf(code_);
      return result == null ? org.apache.bookkeeper.stream.proto.storage.StatusCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.bookkeeper.proto.storage.StatusCode code = 1;</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(org.apache.bookkeeper.stream.proto.storage.StatusCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.bookkeeper.proto.storage.StatusCode code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<org.apache.bookkeeper.stream.proto.storage.RelatedRanges> ranges_ =
      java.util.Collections.emptyList();
    private void ensureRangesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ranges_ = new java.util.ArrayList<org.apache.bookkeeper.stream.proto.storage.RelatedRanges>(ranges_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.storage.RelatedRanges, org.apache.bookkeeper.stream.proto.storage.RelatedRanges.Builder, org.apache.bookkeeper.stream.proto.storage.RelatedRangesOrBuilder> rangesBuilder_;

    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public java.util.List<org.apache.bookkeeper.stream.proto.storage.RelatedRanges> getRangesList() {
      if (rangesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ranges_);
      } else {
        return rangesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public int getRangesCount() {
      if (rangesBuilder_ == null) {
        return ranges_.size();
      } else {
        return rangesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public org.apache.bookkeeper.stream.proto.storage.RelatedRanges getRanges(int index) {
      if (rangesBuilder_ == null) {
        return ranges_.get(index);
      } else {
        return rangesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public Builder setRanges(
        int index, org.apache.bookkeeper.stream.proto.storage.RelatedRanges value) {
      if (rangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRangesIsMutable();
        ranges_.set(index, value);
        onChanged();
      } else {
        rangesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public Builder setRanges(
        int index, org.apache.bookkeeper.stream.proto.storage.RelatedRanges.Builder builderForValue) {
      if (rangesBuilder_ == null) {
        ensureRangesIsMutable();
        ranges_.set(index, builderForValue.build());
        onChanged();
      } else {
        rangesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public Builder addRanges(org.apache.bookkeeper.stream.proto.storage.RelatedRanges value) {
      if (rangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRangesIsMutable();
        ranges_.add(value);
        onChanged();
      } else {
        rangesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public Builder addRanges(
        int index, org.apache.bookkeeper.stream.proto.storage.RelatedRanges value) {
      if (rangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRangesIsMutable();
        ranges_.add(index, value);
        onChanged();
      } else {
        rangesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public Builder addRanges(
        org.apache.bookkeeper.stream.proto.storage.RelatedRanges.Builder builderForValue) {
      if (rangesBuilder_ == null) {
        ensureRangesIsMutable();
        ranges_.add(builderForValue.build());
        onChanged();
      } else {
        rangesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public Builder addRanges(
        int index, org.apache.bookkeeper.stream.proto.storage.RelatedRanges.Builder builderForValue) {
      if (rangesBuilder_ == null) {
        ensureRangesIsMutable();
        ranges_.add(index, builderForValue.build());
        onChanged();
      } else {
        rangesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public Builder addAllRanges(
        java.lang.Iterable<? extends org.apache.bookkeeper.stream.proto.storage.RelatedRanges> values) {
      if (rangesBuilder_ == null) {
        ensureRangesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ranges_);
        onChanged();
      } else {
        rangesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public Builder clearRanges() {
      if (rangesBuilder_ == null) {
        ranges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rangesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public Builder removeRanges(int index) {
      if (rangesBuilder_ == null) {
        ensureRangesIsMutable();
        ranges_.remove(index);
        onChanged();
      } else {
        rangesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public org.apache.bookkeeper.stream.proto.storage.RelatedRanges.Builder getRangesBuilder(
        int index) {
      return getRangesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public org.apache.bookkeeper.stream.proto.storage.RelatedRangesOrBuilder getRangesOrBuilder(
        int index) {
      if (rangesBuilder_ == null) {
        return ranges_.get(index);  } else {
        return rangesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public java.util.List<? extends org.apache.bookkeeper.stream.proto.storage.RelatedRangesOrBuilder> 
         getRangesOrBuilderList() {
      if (rangesBuilder_ != null) {
        return rangesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ranges_);
      }
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public org.apache.bookkeeper.stream.proto.storage.RelatedRanges.Builder addRangesBuilder() {
      return getRangesFieldBuilder().addBuilder(
          org.apache.bookkeeper.stream.proto.storage.RelatedRanges.getDefaultInstance());
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public org.apache.bookkeeper.stream.proto.storage.RelatedRanges.Builder addRangesBuilder(
        int index) {
      return getRangesFieldBuilder().addBuilder(
          index, org.apache.bookkeeper.stream.proto.storage.RelatedRanges.getDefaultInstance());
    }
    /**
     * <code>repeated .bookkeeper.proto.storage.RelatedRanges ranges = 2;</code>
     */
    public java.util.List<org.apache.bookkeeper.stream.proto.storage.RelatedRanges.Builder> 
         getRangesBuilderList() {
      return getRangesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.storage.RelatedRanges, org.apache.bookkeeper.stream.proto.storage.RelatedRanges.Builder, org.apache.bookkeeper.stream.proto.storage.RelatedRangesOrBuilder> 
        getRangesFieldBuilder() {
      if (rangesBuilder_ == null) {
        rangesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.bookkeeper.stream.proto.storage.RelatedRanges, org.apache.bookkeeper.stream.proto.storage.RelatedRanges.Builder, org.apache.bookkeeper.stream.proto.storage.RelatedRangesOrBuilder>(
                ranges_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ranges_ = null;
      }
      return rangesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bookkeeper.proto.storage.GetActiveRangesResponse)
  }

  // @@protoc_insertion_point(class_scope:bookkeeper.proto.storage.GetActiveRangesResponse)
  private static final org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse();
  }

  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetActiveRangesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetActiveRangesResponse>() {
    @java.lang.Override
    public GetActiveRangesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetActiveRangesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetActiveRangesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

