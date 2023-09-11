// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv_rpc.proto

package org.apache.bookkeeper.stream.proto.kv.rpc;

/**
 * Protobuf type {@code bookkeeper.proto.kv.rpc.TxnResponse}
 */
public final class TxnResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookkeeper.proto.kv.rpc.TxnResponse)
    TxnResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TxnResponse.newBuilder() to construct.
  private TxnResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TxnResponse() {
    responses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TxnResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_TxnResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_TxnResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse.class, org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader header_;
  /**
   * <code>.bookkeeper.proto.kv.rpc.ResponseHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.bookkeeper.proto.kv.rpc.ResponseHeader header = 1;</code>
   * @return The header.
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader getHeader() {
    return header_ == null ? org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.bookkeeper.proto.kv.rpc.ResponseHeader header = 1;</code>
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int SUCCEEDED_FIELD_NUMBER = 2;
  private boolean succeeded_;
  /**
   * <pre>
   * succeeded is set to true if the compare evaluated to true or false otherwise.
   * </pre>
   *
   * <code>bool succeeded = 2;</code>
   * @return The succeeded.
   */
  @java.lang.Override
  public boolean getSucceeded() {
    return succeeded_;
  }

  public static final int RESPONSES_FIELD_NUMBER = 3;
  private java.util.List<org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp> responses_;
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
   */
  @java.lang.Override
  public java.util.List<org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp> getResponsesList() {
    return responses_;
  }
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOpOrBuilder> 
      getResponsesOrBuilderList() {
    return responses_;
  }
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
   */
  @java.lang.Override
  public int getResponsesCount() {
    return responses_.size();
  }
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp getResponses(int index) {
    return responses_.get(index);
  }
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOpOrBuilder getResponsesOrBuilder(
      int index) {
    return responses_.get(index);
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (succeeded_ != false) {
      output.writeBool(2, succeeded_);
    }
    for (int i = 0; i < responses_.size(); i++) {
      output.writeMessage(3, responses_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (succeeded_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, succeeded_);
    }
    for (int i = 0; i < responses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, responses_.get(i));
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
    if (!(obj instanceof org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse)) {
      return super.equals(obj);
    }
    org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse other = (org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (getSucceeded()
        != other.getSucceeded()) return false;
    if (!getResponsesList()
        .equals(other.getResponsesList())) return false;
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (37 * hash) + SUCCEEDED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSucceeded());
    if (getResponsesCount() > 0) {
      hash = (37 * hash) + RESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + getResponsesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse parseFrom(
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
  public static Builder newBuilder(org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse prototype) {
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
   * Protobuf type {@code bookkeeper.proto.kv.rpc.TxnResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookkeeper.proto.kv.rpc.TxnResponse)
      org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_TxnResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_TxnResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse.class, org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse.Builder.class);
    }

    // Construct using org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      succeeded_ = false;

      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
      } else {
        responses_ = null;
        responsesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_TxnResponse_descriptor;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse getDefaultInstanceForType() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse build() {
      org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse buildPartial() {
      org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse result = new org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse(this);
      int from_bitField0_ = bitField0_;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.succeeded_ = succeeded_;
      if (responsesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          responses_ = java.util.Collections.unmodifiableList(responses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.responses_ = responses_;
      } else {
        result.responses_ = responsesBuilder_.build();
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
      if (other instanceof org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse) {
        return mergeFrom((org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse other) {
      if (other == org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.getSucceeded() != false) {
        setSucceeded(other.getSucceeded());
      }
      if (responsesBuilder_ == null) {
        if (!other.responses_.isEmpty()) {
          if (responses_.isEmpty()) {
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResponsesIsMutable();
            responses_.addAll(other.responses_);
          }
          onChanged();
        }
      } else {
        if (!other.responses_.isEmpty()) {
          if (responsesBuilder_.isEmpty()) {
            responsesBuilder_.dispose();
            responsesBuilder_ = null;
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            responsesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResponsesFieldBuilder() : null;
          } else {
            responsesBuilder_.addAllMessages(other.responses_);
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
            case 10: {
              input.readMessage(
                  getHeaderFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 16: {
              succeeded_ = input.readBool();

              break;
            } // case 16
            case 26: {
              org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp m =
                  input.readMessage(
                      org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp.parser(),
                      extensionRegistry);
              if (responsesBuilder_ == null) {
                ensureResponsesIsMutable();
                responses_.add(m);
              } else {
                responsesBuilder_.addMessage(m);
              }
              break;
            } // case 26
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

    private org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader.Builder, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.bookkeeper.proto.kv.rpc.ResponseHeader header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.bookkeeper.proto.kv.rpc.ResponseHeader header = 1;</code>
     * @return The header.
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.bookkeeper.proto.kv.rpc.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.bookkeeper.proto.kv.rpc.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(
        org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.bookkeeper.proto.kv.rpc.ResponseHeader header = 1;</code>
     */
    public Builder mergeHeader(org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.bookkeeper.proto.kv.rpc.ResponseHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.bookkeeper.proto.kv.rpc.ResponseHeader header = 1;</code>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.bookkeeper.proto.kv.rpc.ResponseHeader header = 1;</code>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.bookkeeper.proto.kv.rpc.ResponseHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader.Builder, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeader.Builder, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private boolean succeeded_ ;
    /**
     * <pre>
     * succeeded is set to true if the compare evaluated to true or false otherwise.
     * </pre>
     *
     * <code>bool succeeded = 2;</code>
     * @return The succeeded.
     */
    @java.lang.Override
    public boolean getSucceeded() {
      return succeeded_;
    }
    /**
     * <pre>
     * succeeded is set to true if the compare evaluated to true or false otherwise.
     * </pre>
     *
     * <code>bool succeeded = 2;</code>
     * @param value The succeeded to set.
     * @return This builder for chaining.
     */
    public Builder setSucceeded(boolean value) {
      
      succeeded_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * succeeded is set to true if the compare evaluated to true or false otherwise.
     * </pre>
     *
     * <code>bool succeeded = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSucceeded() {
      
      succeeded_ = false;
      onChanged();
      return this;
    }

    private java.util.List<org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp> responses_ =
      java.util.Collections.emptyList();
    private void ensureResponsesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        responses_ = new java.util.ArrayList<org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp>(responses_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp.Builder, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOpOrBuilder> responsesBuilder_;

    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public java.util.List<org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp> getResponsesList() {
      if (responsesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(responses_);
      } else {
        return responsesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public int getResponsesCount() {
      if (responsesBuilder_ == null) {
        return responses_.size();
      } else {
        return responsesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp getResponses(int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);
      } else {
        return responsesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public Builder setResponses(
        int index, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.set(index, value);
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public Builder setResponses(
        int index, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.set(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public Builder addResponses(org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public Builder addResponses(
        int index, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(index, value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public Builder addResponses(
        org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public Builder addResponses(
        int index, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public Builder addAllResponses(
        java.lang.Iterable<? extends org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp> values) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, responses_);
        onChanged();
      } else {
        responsesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public Builder clearResponses() {
      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        responsesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public Builder removeResponses(int index) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.remove(index);
        onChanged();
      } else {
        responsesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp.Builder getResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOpOrBuilder getResponsesOrBuilder(
        int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);  } else {
        return responsesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public java.util.List<? extends org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOpOrBuilder> 
         getResponsesOrBuilderList() {
      if (responsesBuilder_ != null) {
        return responsesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(responses_);
      }
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp.Builder addResponsesBuilder() {
      return getResponsesFieldBuilder().addBuilder(
          org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp.getDefaultInstance());
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp.Builder addResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder().addBuilder(
          index, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp.getDefaultInstance());
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .bookkeeper.proto.kv.rpc.ResponseOp responses = 3;</code>
     */
    public java.util.List<org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp.Builder> 
         getResponsesBuilderList() {
      return getResponsesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp.Builder, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOpOrBuilder> 
        getResponsesFieldBuilder() {
      if (responsesBuilder_ == null) {
        responsesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOp.Builder, org.apache.bookkeeper.stream.proto.kv.rpc.ResponseOpOrBuilder>(
                responses_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        responses_ = null;
      }
      return responsesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bookkeeper.proto.kv.rpc.TxnResponse)
  }

  // @@protoc_insertion_point(class_scope:bookkeeper.proto.kv.rpc.TxnResponse)
  private static final org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse();
  }

  public static org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TxnResponse>
      PARSER = new com.google.protobuf.AbstractParser<TxnResponse>() {
    @java.lang.Override
    public TxnResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<TxnResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TxnResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

