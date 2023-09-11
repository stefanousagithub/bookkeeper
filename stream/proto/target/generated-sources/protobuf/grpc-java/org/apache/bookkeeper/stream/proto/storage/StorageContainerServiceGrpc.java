package org.apache.bookkeeper.stream.proto.storage;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A general range server service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: storage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StorageContainerServiceGrpc {

  private StorageContainerServiceGrpc() {}

  public static final String SERVICE_NAME = "bookkeeper.proto.storage.StorageContainerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest,
      org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> getGetStorageContainerEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStorageContainerEndpoint",
      requestType = org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest.class,
      responseType = org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest,
      org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> getGetStorageContainerEndpointMethod() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest, org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> getGetStorageContainerEndpointMethod;
    if ((getGetStorageContainerEndpointMethod = StorageContainerServiceGrpc.getGetStorageContainerEndpointMethod) == null) {
      synchronized (StorageContainerServiceGrpc.class) {
        if ((getGetStorageContainerEndpointMethod = StorageContainerServiceGrpc.getGetStorageContainerEndpointMethod) == null) {
          StorageContainerServiceGrpc.getGetStorageContainerEndpointMethod = getGetStorageContainerEndpointMethod =
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest, org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStorageContainerEndpoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageContainerServiceMethodDescriptorSupplier("GetStorageContainerEndpoint"))
              .build();
        }
      }
    }
    return getGetStorageContainerEndpointMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageContainerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageContainerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageContainerServiceStub>() {
        @java.lang.Override
        public StorageContainerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageContainerServiceStub(channel, callOptions);
        }
      };
    return StorageContainerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageContainerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageContainerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageContainerServiceBlockingStub>() {
        @java.lang.Override
        public StorageContainerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageContainerServiceBlockingStub(channel, callOptions);
        }
      };
    return StorageContainerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageContainerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageContainerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageContainerServiceFutureStub>() {
        @java.lang.Override
        public StorageContainerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageContainerServiceFutureStub(channel, callOptions);
        }
      };
    return StorageContainerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A general range server service
   * </pre>
   */
  public static abstract class StorageContainerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get the storage container endpoints
     * </pre>
     */
    public void getStorageContainerEndpoint(org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStorageContainerEndpointMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStorageContainerEndpointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest,
                org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse>(
                  this, METHODID_GET_STORAGE_CONTAINER_ENDPOINT)))
          .build();
    }
  }

  /**
   * <pre>
   * A general range server service
   * </pre>
   */
  public static final class StorageContainerServiceStub extends io.grpc.stub.AbstractAsyncStub<StorageContainerServiceStub> {
    private StorageContainerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageContainerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageContainerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the storage container endpoints
     * </pre>
     */
    public void getStorageContainerEndpoint(org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStorageContainerEndpointMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A general range server service
   * </pre>
   */
  public static final class StorageContainerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StorageContainerServiceBlockingStub> {
    private StorageContainerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageContainerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageContainerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the storage container endpoints
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse getStorageContainerEndpoint(org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStorageContainerEndpointMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A general range server service
   * </pre>
   */
  public static final class StorageContainerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StorageContainerServiceFutureStub> {
    private StorageContainerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageContainerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageContainerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the storage container endpoints
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> getStorageContainerEndpoint(
        org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStorageContainerEndpointMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STORAGE_CONTAINER_ENDPOINT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StorageContainerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StorageContainerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STORAGE_CONTAINER_ENDPOINT:
          serviceImpl.getStorageContainerEndpoint((org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse>) responseObserver);
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

  private static abstract class StorageContainerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageContainerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorageContainerService");
    }
  }

  private static final class StorageContainerServiceFileDescriptorSupplier
      extends StorageContainerServiceBaseDescriptorSupplier {
    StorageContainerServiceFileDescriptorSupplier() {}
  }

  private static final class StorageContainerServiceMethodDescriptorSupplier
      extends StorageContainerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageContainerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StorageContainerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageContainerServiceFileDescriptorSupplier())
              .addMethod(getGetStorageContainerEndpointMethod())
              .build();
        }
      }
    }
    return result;
  }
}
