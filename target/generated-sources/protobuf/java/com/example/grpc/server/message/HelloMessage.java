// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message/hello/HelloMessage.proto

package com.example.grpc.server.message;

public final class HelloMessage {
  private HelloMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_message_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_message_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_message_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_message_HelloResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_message_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_message_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n message/hello/HelloMessage.proto\022\037com." +
      "example.grpc.server.message\"3\n\014HelloRequ" +
      "est\022\021\n\tfirstName\030\001 \001(\t\022\020\n\010lastName\030\002 \001(\t" +
      "\"<\n\rHelloResponse\022\020\n\010greeting\030\001 \001(\t\022\014\n\004d" +
      "ate\030\002 \001(\t\022\013\n\003age\030\003 \001(\005\"\344\001\n\006Person\022\021\n\tfir" +
      "stName\030\001 \001(\t\022\020\n\010lastName\030\002 \001(\t\022\013\n\003age\030\003 " +
      "\001(\005\022\017\n\007address\030\004 \001(\t\022\017\n\007country\030\005 \001(\t\022\014\n" +
      "\004city\030\006 \001(\t\022\025\n\rwifeFirstName\030\007 \001(\t\022\024\n\014wi" +
      "feLastName\030\010 \001(\t\022\017\n\007wifeAge\030\t \001(\005\022\023\n\013wif" +
      "eAddress\030\n \001(\t\022\023\n\013wifeCountry\030\013 \001(\t\022\020\n\010w" +
      "ifeCity\030\014 \001(\tB\002P\001b\006proto3"
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
    internal_static_com_example_grpc_server_message_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_server_message_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_message_HelloRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_com_example_grpc_server_message_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_server_message_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_message_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", "Date", "Age", });
    internal_static_com_example_grpc_server_message_Person_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_grpc_server_message_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_message_Person_descriptor,
        new java.lang.String[] { "FirstName", "LastName", "Age", "Address", "Country", "City", "WifeFirstName", "WifeLastName", "WifeAge", "WifeAddress", "WifeCountry", "WifeCity", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
