// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message/stream/StreamMessage.proto

package com.example.grpc.server.message;

public final class StreamMessage {
  private StreamMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_message_ServerStreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_message_ServerStreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_message_ServerStreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_message_ServerStreamResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_message_ClientStreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_message_ClientStreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_message_ClientStreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_message_ClientStreamResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_message_BidirectionStreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_message_BidirectionStreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_message_BidirectionStreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_message_BidirectionStreamResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"message/stream/StreamMessage.proto\022\037co" +
      "m.example.grpc.server.message\"$\n\023ServerS" +
      "treamRequest\022\r\n\005start\030\001 \001(\005\"$\n\024ServerStr" +
      "eamResponse\022\014\n\004next\030\001 \001(\005\"#\n\023ClientStrea" +
      "mRequest\022\014\n\004next\030\001 \001(\005\"%\n\024ClientStreamRe" +
      "sponse\022\r\n\005count\030\001 \001(\005\"\'\n\030BidirectionStre" +
      "amRequest\022\013\n\003msg\030\001 \001(\t\"(\n\031BidirectionStr" +
      "eamResponse\022\013\n\003msg\030\001 \001(\tB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_grpc_server_message_ServerStreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_server_message_ServerStreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_message_ServerStreamRequest_descriptor,
        new java.lang.String[] { "Start", });
    internal_static_com_example_grpc_server_message_ServerStreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_server_message_ServerStreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_message_ServerStreamResponse_descriptor,
        new java.lang.String[] { "Next", });
    internal_static_com_example_grpc_server_message_ClientStreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_grpc_server_message_ClientStreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_message_ClientStreamRequest_descriptor,
        new java.lang.String[] { "Next", });
    internal_static_com_example_grpc_server_message_ClientStreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_grpc_server_message_ClientStreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_message_ClientStreamResponse_descriptor,
        new java.lang.String[] { "Count", });
    internal_static_com_example_grpc_server_message_BidirectionStreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_grpc_server_message_BidirectionStreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_message_BidirectionStreamRequest_descriptor,
        new java.lang.String[] { "Msg", });
    internal_static_com_example_grpc_server_message_BidirectionStreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_example_grpc_server_message_BidirectionStreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_message_BidirectionStreamResponse_descriptor,
        new java.lang.String[] { "Msg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
