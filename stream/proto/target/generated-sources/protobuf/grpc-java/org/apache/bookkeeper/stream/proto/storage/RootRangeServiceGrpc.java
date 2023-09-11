package org.apache.bookkeeper.stream.proto.storage;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * public service for metadata services
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: storage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RootRangeServiceGrpc {

  private RootRangeServiceGrpc() {}

  public static final String SERVICE_NAME = "bookkeeper.proto.storage.RootRangeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> getCreateNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNamespace",
      requestType = org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest.class,
      responseType = org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> getCreateNamespaceMethod() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest, org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> getCreateNamespaceMethod;
    if ((getCreateNamespaceMethod = RootRangeServiceGrpc.getCreateNamespaceMethod) == null) {
      synchronized (RootRangeServiceGrpc.class) {
        if ((getCreateNamespaceMethod = RootRangeServiceGrpc.getCreateNamespaceMethod) == null) {
          RootRangeServiceGrpc.getCreateNamespaceMethod = getCreateNamespaceMethod =
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest, org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RootRangeServiceMethodDescriptorSupplier("CreateNamespace"))
              .build();
        }
      }
    }
    return getCreateNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> getDeleteNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNamespace",
      requestType = org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest.class,
      responseType = org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> getDeleteNamespaceMethod() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest, org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> getDeleteNamespaceMethod;
    if ((getDeleteNamespaceMethod = RootRangeServiceGrpc.getDeleteNamespaceMethod) == null) {
      synchronized (RootRangeServiceGrpc.class) {
        if ((getDeleteNamespaceMethod = RootRangeServiceGrpc.getDeleteNamespaceMethod) == null) {
          RootRangeServiceGrpc.getDeleteNamespaceMethod = getDeleteNamespaceMethod =
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest, org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RootRangeServiceMethodDescriptorSupplier("DeleteNamespace"))
              .build();
        }
      }
    }
    return getDeleteNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> getGetNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNamespace",
      requestType = org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest.class,
      responseType = org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> getGetNamespaceMethod() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest, org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> getGetNamespaceMethod;
    if ((getGetNamespaceMethod = RootRangeServiceGrpc.getGetNamespaceMethod) == null) {
      synchronized (RootRangeServiceGrpc.class) {
        if ((getGetNamespaceMethod = RootRangeServiceGrpc.getGetNamespaceMethod) == null) {
          RootRangeServiceGrpc.getGetNamespaceMethod = getGetNamespaceMethod =
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest, org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RootRangeServiceMethodDescriptorSupplier("GetNamespace"))
              .build();
        }
      }
    }
    return getGetNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> getCreateStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStream",
      requestType = org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest.class,
      responseType = org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> getCreateStreamMethod() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest, org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> getCreateStreamMethod;
    if ((getCreateStreamMethod = RootRangeServiceGrpc.getCreateStreamMethod) == null) {
      synchronized (RootRangeServiceGrpc.class) {
        if ((getCreateStreamMethod = RootRangeServiceGrpc.getCreateStreamMethod) == null) {
          RootRangeServiceGrpc.getCreateStreamMethod = getCreateStreamMethod =
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest, org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RootRangeServiceMethodDescriptorSupplier("CreateStream"))
              .build();
        }
      }
    }
    return getCreateStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> getDeleteStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStream",
      requestType = org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest.class,
      responseType = org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> getDeleteStreamMethod() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest, org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> getDeleteStreamMethod;
    if ((getDeleteStreamMethod = RootRangeServiceGrpc.getDeleteStreamMethod) == null) {
      synchronized (RootRangeServiceGrpc.class) {
        if ((getDeleteStreamMethod = RootRangeServiceGrpc.getDeleteStreamMethod) == null) {
          RootRangeServiceGrpc.getDeleteStreamMethod = getDeleteStreamMethod =
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest, org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RootRangeServiceMethodDescriptorSupplier("DeleteStream"))
              .build();
        }
      }
    }
    return getDeleteStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> getGetStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStream",
      requestType = org.apache.bookkeeper.stream.proto.storage.GetStreamRequest.class,
      responseType = org.apache.bookkeeper.stream.proto.storage.GetStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> getGetStreamMethod() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStreamRequest, org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> getGetStreamMethod;
    if ((getGetStreamMethod = RootRangeServiceGrpc.getGetStreamMethod) == null) {
      synchronized (RootRangeServiceGrpc.class) {
        if ((getGetStreamMethod = RootRangeServiceGrpc.getGetStreamMethod) == null) {
          RootRangeServiceGrpc.getGetStreamMethod = getGetStreamMethod =
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.GetStreamRequest, org.apache.bookkeeper.stream.proto.storage.GetStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RootRangeServiceMethodDescriptorSupplier("GetStream"))
              .build();
        }
      }
    }
    return getGetStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RootRangeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RootRangeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RootRangeServiceStub>() {
        @java.lang.Override
        public RootRangeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RootRangeServiceStub(channel, callOptions);
        }
      };
    return RootRangeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RootRangeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RootRangeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RootRangeServiceBlockingStub>() {
        @java.lang.Override
        public RootRangeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RootRangeServiceBlockingStub(channel, callOptions);
        }
      };
    return RootRangeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RootRangeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RootRangeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RootRangeServiceFutureStub>() {
        @java.lang.Override
        public RootRangeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RootRangeServiceFutureStub(channel, callOptions);
        }
      };
    return RootRangeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * public service for metadata services
   * </pre>
   */
  public static abstract class RootRangeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Namespace Methods
     * </pre>
     */
    public void createNamespace(org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNamespaceMethod(), responseObserver);
    }

    /**
     */
    public void deleteNamespace(org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNamespaceMethod(), responseObserver);
    }

    /**
     */
    public void getNamespace(org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNamespaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream Methods
     * </pre>
     */
    public void createStream(org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStreamMethod(), responseObserver);
    }

    /**
     */
    public void deleteStream(org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStreamMethod(), responseObserver);
    }

    /**
     */
    public void getStream(org.apache.bookkeeper.stream.proto.storage.GetStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest,
                org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse>(
                  this, METHODID_CREATE_NAMESPACE)))
          .addMethod(
            getDeleteNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest,
                org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse>(
                  this, METHODID_DELETE_NAMESPACE)))
          .addMethod(
            getGetNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest,
                org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse>(
                  this, METHODID_GET_NAMESPACE)))
          .addMethod(
            getCreateStreamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest,
                org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse>(
                  this, METHODID_CREATE_STREAM)))
          .addMethod(
            getDeleteStreamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest,
                org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse>(
                  this, METHODID_DELETE_STREAM)))
          .addMethod(
            getGetStreamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.GetStreamRequest,
                org.apache.bookkeeper.stream.proto.storage.GetStreamResponse>(
                  this, METHODID_GET_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * public service for metadata services
   * </pre>
   */
  public static final class RootRangeServiceStub extends io.grpc.stub.AbstractAsyncStub<RootRangeServiceStub> {
    private RootRangeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RootRangeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RootRangeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Namespace Methods
     * </pre>
     */
    public void createNamespace(org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNamespace(org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNamespace(org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream Methods
     * </pre>
     */
    public void createStream(org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteStream(org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStream(org.apache.bookkeeper.stream.proto.storage.GetStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * public service for metadata services
   * </pre>
   */
  public static final class RootRangeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RootRangeServiceBlockingStub> {
    private RootRangeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RootRangeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RootRangeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Namespace Methods
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse createNamespace(org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNamespaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse deleteNamespace(org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNamespaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse getNamespace(org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNamespaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stream Methods
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse createStream(org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse deleteStream(org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.bookkeeper.stream.proto.storage.GetStreamResponse getStream(org.apache.bookkeeper.stream.proto.storage.GetStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * public service for metadata services
   * </pre>
   */
  public static final class RootRangeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RootRangeServiceFutureStub> {
    private RootRangeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RootRangeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RootRangeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Namespace Methods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> createNamespace(
        org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNamespaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> deleteNamespace(
        org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNamespaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> getNamespace(
        org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNamespaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stream Methods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> createStream(
        org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStreamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> deleteStream(
        org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStreamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> getStream(
        org.apache.bookkeeper.stream.proto.storage.GetStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStreamMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NAMESPACE = 0;
  private static final int METHODID_DELETE_NAMESPACE = 1;
  private static final int METHODID_GET_NAMESPACE = 2;
  private static final int METHODID_CREATE_STREAM = 3;
  private static final int METHODID_DELETE_STREAM = 4;
  private static final int METHODID_GET_STREAM = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RootRangeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RootRangeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_NAMESPACE:
          serviceImpl.createNamespace((org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse>) responseObserver);
          break;
        case METHODID_DELETE_NAMESPACE:
          serviceImpl.deleteNamespace((org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse>) responseObserver);
          break;
        case METHODID_GET_NAMESPACE:
          serviceImpl.getNamespace((org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse>) responseObserver);
          break;
        case METHODID_CREATE_STREAM:
          serviceImpl.createStream((org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse>) responseObserver);
          break;
        case METHODID_DELETE_STREAM:
          serviceImpl.deleteStream((org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM:
          serviceImpl.getStream((org.apache.bookkeeper.stream.proto.storage.GetStreamRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetStreamResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RootRangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RootRangeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RootRangeService");
    }
  }

  private static final class RootRangeServiceFileDescriptorSupplier
      extends RootRangeServiceBaseDescriptorSupplier {
    RootRangeServiceFileDescriptorSupplier() {}
  }

  private static final class RootRangeServiceMethodDescriptorSupplier
      extends RootRangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RootRangeServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RootRangeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RootRangeServiceFileDescriptorSupplier())
              .addMethod(getCreateNamespaceMethod())
              .addMethod(getDeleteNamespaceMethod())
              .addMethod(getGetNamespaceMethod())
              .addMethod(getCreateStreamMethod())
              .addMethod(getDeleteStreamMethod())
              .addMethod(getGetStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
