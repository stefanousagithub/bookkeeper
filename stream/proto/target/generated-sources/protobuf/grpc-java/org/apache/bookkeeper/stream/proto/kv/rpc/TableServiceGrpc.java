package org.apache.bookkeeper.stream.proto.kv.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: kv_rpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TableServiceGrpc {

  private TableServiceGrpc() {}

  public static final String SERVICE_NAME = "bookkeeper.proto.kv.rpc.TableService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> getRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Range",
      requestType = org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest.class,
      responseType = org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> getRangeMethod() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest, org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> getRangeMethod;
    if ((getRangeMethod = TableServiceGrpc.getRangeMethod) == null) {
      synchronized (TableServiceGrpc.class) {
        if ((getRangeMethod = TableServiceGrpc.getRangeMethod) == null) {
          TableServiceGrpc.getRangeMethod = getRangeMethod =
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest, org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Range"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TableServiceMethodDescriptorSupplier("Range"))
              .build();
        }
      }
    }
    return getRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest.class,
      responseType = org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest, org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> getPutMethod;
    if ((getPutMethod = TableServiceGrpc.getPutMethod) == null) {
      synchronized (TableServiceGrpc.class) {
        if ((getPutMethod = TableServiceGrpc.getPutMethod) == null) {
          TableServiceGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest, org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TableServiceMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest.class,
      responseType = org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest, org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> getDeleteMethod;
    if ((getDeleteMethod = TableServiceGrpc.getDeleteMethod) == null) {
      synchronized (TableServiceGrpc.class) {
        if ((getDeleteMethod = TableServiceGrpc.getDeleteMethod) == null) {
          TableServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest, org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TableServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> getTxnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Txn",
      requestType = org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest.class,
      responseType = org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> getTxnMethod() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest, org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> getTxnMethod;
    if ((getTxnMethod = TableServiceGrpc.getTxnMethod) == null) {
      synchronized (TableServiceGrpc.class) {
        if ((getTxnMethod = TableServiceGrpc.getTxnMethod) == null) {
          TableServiceGrpc.getTxnMethod = getTxnMethod =
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest, org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Txn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TableServiceMethodDescriptorSupplier("Txn"))
              .build();
        }
      }
    }
    return getTxnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> getIncrementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Increment",
      requestType = org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest.class,
      responseType = org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> getIncrementMethod() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest, org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> getIncrementMethod;
    if ((getIncrementMethod = TableServiceGrpc.getIncrementMethod) == null) {
      synchronized (TableServiceGrpc.class) {
        if ((getIncrementMethod = TableServiceGrpc.getIncrementMethod) == null) {
          TableServiceGrpc.getIncrementMethod = getIncrementMethod =
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest, org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Increment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TableServiceMethodDescriptorSupplier("Increment"))
              .build();
        }
      }
    }
    return getIncrementMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TableServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TableServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TableServiceStub>() {
        @java.lang.Override
        public TableServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TableServiceStub(channel, callOptions);
        }
      };
    return TableServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TableServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TableServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TableServiceBlockingStub>() {
        @java.lang.Override
        public TableServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TableServiceBlockingStub(channel, callOptions);
        }
      };
    return TableServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TableServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TableServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TableServiceFutureStub>() {
        @java.lang.Override
        public TableServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TableServiceFutureStub(channel, callOptions);
        }
      };
    return TableServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TableServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * NOT supported yet.
     * </pre>
     */
    public void range(org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public void put(org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public void delete(org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public void txn(org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTxnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Increment increments the amount associated with the keys
     * </pre>
     */
    public void increment(org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncrementMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRangeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest,
                org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse>(
                  this, METHODID_RANGE)))
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest,
                org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest,
                org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getTxnMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest,
                org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse>(
                  this, METHODID_TXN)))
          .addMethod(
            getIncrementMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest,
                org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse>(
                  this, METHODID_INCREMENT)))
          .build();
    }
  }

  /**
   */
  public static final class TableServiceStub extends io.grpc.stub.AbstractAsyncStub<TableServiceStub> {
    private TableServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TableServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * NOT supported yet.
     * </pre>
     */
    public void range(org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public void put(org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public void delete(org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public void txn(org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTxnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Increment increments the amount associated with the keys
     * </pre>
     */
    public void increment(org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncrementMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TableServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TableServiceBlockingStub> {
    private TableServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TableServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * NOT supported yet.
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse range(org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse put(org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse delete(org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse txn(org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTxnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Increment increments the amount associated with the keys
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse increment(org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncrementMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TableServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TableServiceFutureStub> {
    private TableServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TableServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * NOT supported yet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> range(
        org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> put(
        org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> delete(
        org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> txn(
        org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTxnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Increment increments the amount associated with the keys
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> increment(
        org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncrementMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RANGE = 0;
  private static final int METHODID_PUT = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_TXN = 3;
  private static final int METHODID_INCREMENT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TableServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TableServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RANGE:
          serviceImpl.range((org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse>) responseObserver);
          break;
        case METHODID_TXN:
          serviceImpl.txn((org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse>) responseObserver);
          break;
        case METHODID_INCREMENT:
          serviceImpl.increment((org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse>) responseObserver);
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

  private static abstract class TableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TableServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TableService");
    }
  }

  private static final class TableServiceFileDescriptorSupplier
      extends TableServiceBaseDescriptorSupplier {
    TableServiceFileDescriptorSupplier() {}
  }

  private static final class TableServiceMethodDescriptorSupplier
      extends TableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TableServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TableServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TableServiceFileDescriptorSupplier())
              .addMethod(getRangeMethod())
              .addMethod(getPutMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getTxnMethod())
              .addMethod(getIncrementMethod())
              .build();
        }
      }
    }
    return result;
  }
}
