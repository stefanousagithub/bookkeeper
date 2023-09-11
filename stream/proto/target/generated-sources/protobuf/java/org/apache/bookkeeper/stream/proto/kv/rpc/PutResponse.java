// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv_rpc.proto

package org.apache.bookkeeper.stream.proto.kv.rpc;

/**
 * Protobuf type {@code bookkeeper.proto.kv.rpc.PutResponse}
 */
public final class PutResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookkeeper.proto.kv.rpc.PutResponse)
    PutResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PutResponse.newBuilder() to construct.
  private PutResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PutResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PutResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_PutResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_PutResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse.class, org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse.Builder.class);
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

  public static final int PREV_KV_FIELD_NUMBER = 2;
  private org.apache.bookkeeper.stream.proto.kv.KeyValue prevKv_;
  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pair will be returned.
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.KeyValue prev_kv = 2;</code>
   * @return Whether the prevKv field is set.
   */
  @java.lang.Override
  public boolean hasPrevKv() {
    return prevKv_ != null;
  }
  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pair will be returned.
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.KeyValue prev_kv = 2;</code>
   * @return The prevKv.
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.kv.KeyValue getPrevKv() {
    return prevKv_ == null ? org.apache.bookkeeper.stream.proto.kv.KeyValue.getDefaultInstance() : prevKv_;
  }
  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pair will be returned.
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.KeyValue prev_kv = 2;</code>
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.kv.KeyValueOrBuilder getPrevKvOrBuilder() {
    return getPrevKv();
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
    if (prevKv_ != null) {
      output.writeMessage(2, getPrevKv());
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
    if (prevKv_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPrevKv());
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
    if (!(obj instanceof org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse)) {
      return super.equals(obj);
    }
    org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse other = (org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (hasPrevKv() != other.hasPrevKv()) return false;
    if (hasPrevKv()) {
      if (!getPrevKv()
          .equals(other.getPrevKv())) return false;
    }
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
    if (hasPrevKv()) {
      hash = (37 * hash) + PREV_KV_FIELD_NUMBER;
      hash = (53 * hash) + getPrevKv().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse parseFrom(
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
  public static Builder newBuilder(org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse prototype) {
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
   * Protobuf type {@code bookkeeper.proto.kv.rpc.PutResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookkeeper.proto.kv.rpc.PutResponse)
      org.apache.bookkeeper.stream.proto.kv.rpc.PutResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_PutResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_PutResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse.class, org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse.Builder.class);
    }

    // Construct using org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse.newBuilder()
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
      if (prevKvBuilder_ == null) {
        prevKv_ = null;
      } else {
        prevKv_ = null;
        prevKvBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_PutResponse_descriptor;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse getDefaultInstanceForType() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse build() {
      org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse buildPartial() {
      org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse result = new org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (prevKvBuilder_ == null) {
        result.prevKv_ = prevKv_;
      } else {
        result.prevKv_ = prevKvBuilder_.build();
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
      if (other instanceof org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse) {
        return mergeFrom((org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse other) {
      if (other == org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasPrevKv()) {
        mergePrevKv(other.getPrevKv());
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
            case 18: {
              input.readMessage(
                  getPrevKvFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private org.apache.bookkeeper.stream.proto.kv.KeyValue prevKv_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.kv.KeyValue, org.apache.bookkeeper.stream.proto.kv.KeyValue.Builder, org.apache.bookkeeper.stream.proto.kv.KeyValueOrBuilder> prevKvBuilder_;
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.KeyValue prev_kv = 2;</code>
     * @return Whether the prevKv field is set.
     */
    public boolean hasPrevKv() {
      return prevKvBuilder_ != null || prevKv_ != null;
    }
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.KeyValue prev_kv = 2;</code>
     * @return The prevKv.
     */
    public org.apache.bookkeeper.stream.proto.kv.KeyValue getPrevKv() {
      if (prevKvBuilder_ == null) {
        return prevKv_ == null ? org.apache.bookkeeper.stream.proto.kv.KeyValue.getDefaultInstance() : prevKv_;
      } else {
        return prevKvBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.KeyValue prev_kv = 2;</code>
     */
    public Builder setPrevKv(org.apache.bookkeeper.stream.proto.kv.KeyValue value) {
      if (prevKvBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prevKv_ = value;
        onChanged();
      } else {
        prevKvBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.KeyValue prev_kv = 2;</code>
     */
    public Builder setPrevKv(
        org.apache.bookkeeper.stream.proto.kv.KeyValue.Builder builderForValue) {
      if (prevKvBuilder_ == null) {
        prevKv_ = builderForValue.build();
        onChanged();
      } else {
        prevKvBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.KeyValue prev_kv = 2;</code>
     */
    public Builder mergePrevKv(org.apache.bookkeeper.stream.proto.kv.KeyValue value) {
      if (prevKvBuilder_ == null) {
        if (prevKv_ != null) {
          prevKv_ =
            org.apache.bookkeeper.stream.proto.kv.KeyValue.newBuilder(prevKv_).mergeFrom(value).buildPartial();
        } else {
          prevKv_ = value;
        }
        onChanged();
      } else {
        prevKvBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.KeyValue prev_kv = 2;</code>
     */
    public Builder clearPrevKv() {
      if (prevKvBuilder_ == null) {
        prevKv_ = null;
        onChanged();
      } else {
        prevKv_ = null;
        prevKvBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.KeyValue prev_kv = 2;</code>
     */
    public org.apache.bookkeeper.stream.proto.kv.KeyValue.Builder getPrevKvBuilder() {
      
      onChanged();
      return getPrevKvFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.KeyValue prev_kv = 2;</code>
     */
    public org.apache.bookkeeper.stream.proto.kv.KeyValueOrBuilder getPrevKvOrBuilder() {
      if (prevKvBuilder_ != null) {
        return prevKvBuilder_.getMessageOrBuilder();
      } else {
        return prevKv_ == null ?
            org.apache.bookkeeper.stream.proto.kv.KeyValue.getDefaultInstance() : prevKv_;
      }
    }
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.KeyValue prev_kv = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.kv.KeyValue, org.apache.bookkeeper.stream.proto.kv.KeyValue.Builder, org.apache.bookkeeper.stream.proto.kv.KeyValueOrBuilder> 
        getPrevKvFieldBuilder() {
      if (prevKvBuilder_ == null) {
        prevKvBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.bookkeeper.stream.proto.kv.KeyValue, org.apache.bookkeeper.stream.proto.kv.KeyValue.Builder, org.apache.bookkeeper.stream.proto.kv.KeyValueOrBuilder>(
                getPrevKv(),
                getParentForChildren(),
                isClean());
        prevKv_ = null;
      }
      return prevKvBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bookkeeper.proto.kv.rpc.PutResponse)
  }

  // @@protoc_insertion_point(class_scope:bookkeeper.proto.kv.rpc.PutResponse)
  private static final org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse();
  }

  public static org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PutResponse>
      PARSER = new com.google.protobuf.AbstractParser<PutResponse>() {
    @java.lang.Override
    public PutResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<PutResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PutResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

