package com.example.grpc.server.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: service/StreamService.proto")
public final class StreamServiceGrpc {

  private StreamServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.server.service.StreamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.server.message.ServerStreamRequest,
      com.example.grpc.server.message.ServerStreamResponse> getServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverStream",
      requestType = com.example.grpc.server.message.ServerStreamRequest.class,
      responseType = com.example.grpc.server.message.ServerStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.server.message.ServerStreamRequest,
      com.example.grpc.server.message.ServerStreamResponse> getServerStreamMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.server.message.ServerStreamRequest, com.example.grpc.server.message.ServerStreamResponse> getServerStreamMethod;
    if ((getServerStreamMethod = StreamServiceGrpc.getServerStreamMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getServerStreamMethod = StreamServiceGrpc.getServerStreamMethod) == null) {
          StreamServiceGrpc.getServerStreamMethod = getServerStreamMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.server.message.ServerStreamRequest, com.example.grpc.server.message.ServerStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.server.service.StreamService", "serverStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.server.message.ServerStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.server.message.ServerStreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("serverStream"))
                  .build();
          }
        }
     }
     return getServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.server.message.ClientStreamRequest,
      com.example.grpc.server.message.ClientStreamResponse> getClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientStream",
      requestType = com.example.grpc.server.message.ClientStreamRequest.class,
      responseType = com.example.grpc.server.message.ClientStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.server.message.ClientStreamRequest,
      com.example.grpc.server.message.ClientStreamResponse> getClientStreamMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.server.message.ClientStreamRequest, com.example.grpc.server.message.ClientStreamResponse> getClientStreamMethod;
    if ((getClientStreamMethod = StreamServiceGrpc.getClientStreamMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getClientStreamMethod = StreamServiceGrpc.getClientStreamMethod) == null) {
          StreamServiceGrpc.getClientStreamMethod = getClientStreamMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.server.message.ClientStreamRequest, com.example.grpc.server.message.ClientStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.server.service.StreamService", "clientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.server.message.ClientStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.server.message.ClientStreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("clientStream"))
                  .build();
          }
        }
     }
     return getClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.server.message.BidirectionStreamRequest,
      com.example.grpc.server.message.BidirectionStreamResponse> getBidirectionStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bidirectionStream",
      requestType = com.example.grpc.server.message.BidirectionStreamRequest.class,
      responseType = com.example.grpc.server.message.BidirectionStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.server.message.BidirectionStreamRequest,
      com.example.grpc.server.message.BidirectionStreamResponse> getBidirectionStreamMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.server.message.BidirectionStreamRequest, com.example.grpc.server.message.BidirectionStreamResponse> getBidirectionStreamMethod;
    if ((getBidirectionStreamMethod = StreamServiceGrpc.getBidirectionStreamMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getBidirectionStreamMethod = StreamServiceGrpc.getBidirectionStreamMethod) == null) {
          StreamServiceGrpc.getBidirectionStreamMethod = getBidirectionStreamMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.server.message.BidirectionStreamRequest, com.example.grpc.server.message.BidirectionStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.server.service.StreamService", "bidirectionStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.server.message.BidirectionStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.server.message.BidirectionStreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("bidirectionStream"))
                  .build();
          }
        }
     }
     return getBidirectionStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamServiceStub newStub(io.grpc.Channel channel) {
    return new StreamServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StreamServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StreamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StreamServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StreamServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void serverStream(com.example.grpc.server.message.ServerStreamRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.server.message.ServerStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getServerStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.server.message.ClientStreamRequest> clientStream(
        io.grpc.stub.StreamObserver<com.example.grpc.server.message.ClientStreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getClientStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.server.message.BidirectionStreamRequest> bidirectionStream(
        io.grpc.stub.StreamObserver<com.example.grpc.server.message.BidirectionStreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBidirectionStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getServerStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.grpc.server.message.ServerStreamRequest,
                com.example.grpc.server.message.ServerStreamResponse>(
                  this, METHODID_SERVER_STREAM)))
          .addMethod(
            getClientStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.example.grpc.server.message.ClientStreamRequest,
                com.example.grpc.server.message.ClientStreamResponse>(
                  this, METHODID_CLIENT_STREAM)))
          .addMethod(
            getBidirectionStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.grpc.server.message.BidirectionStreamRequest,
                com.example.grpc.server.message.BidirectionStreamResponse>(
                  this, METHODID_BIDIRECTION_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class StreamServiceStub extends io.grpc.stub.AbstractStub<StreamServiceStub> {
    private StreamServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamServiceStub(channel, callOptions);
    }

    /**
     */
    public void serverStream(com.example.grpc.server.message.ServerStreamRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.server.message.ServerStreamResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.server.message.ClientStreamRequest> clientStream(
        io.grpc.stub.StreamObserver<com.example.grpc.server.message.ClientStreamResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.server.message.BidirectionStreamRequest> bidirectionStream(
        io.grpc.stub.StreamObserver<com.example.grpc.server.message.BidirectionStreamResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBidirectionStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StreamServiceBlockingStub extends io.grpc.stub.AbstractStub<StreamServiceBlockingStub> {
    private StreamServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.example.grpc.server.message.ServerStreamResponse> serverStream(
        com.example.grpc.server.message.ServerStreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StreamServiceFutureStub extends io.grpc.stub.AbstractStub<StreamServiceFutureStub> {
    private StreamServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SERVER_STREAM = 0;
  private static final int METHODID_CLIENT_STREAM = 1;
  private static final int METHODID_BIDIRECTION_STREAM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StreamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SERVER_STREAM:
          serviceImpl.serverStream((com.example.grpc.server.message.ServerStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.server.message.ServerStreamResponse>) responseObserver);
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
        case METHODID_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStream(
              (io.grpc.stub.StreamObserver<com.example.grpc.server.message.ClientStreamResponse>) responseObserver);
        case METHODID_BIDIRECTION_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidirectionStream(
              (io.grpc.stub.StreamObserver<com.example.grpc.server.message.BidirectionStreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.server.service.StreamServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StreamService");
    }
  }

  private static final class StreamServiceFileDescriptorSupplier
      extends StreamServiceBaseDescriptorSupplier {
    StreamServiceFileDescriptorSupplier() {}
  }

  private static final class StreamServiceMethodDescriptorSupplier
      extends StreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StreamServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreamServiceFileDescriptorSupplier())
              .addMethod(getServerStreamMethod())
              .addMethod(getClientStreamMethod())
              .addMethod(getBidirectionStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
