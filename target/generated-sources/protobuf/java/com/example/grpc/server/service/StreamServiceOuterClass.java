// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/StreamService.proto

package com.example.grpc.server.service;

public final class StreamServiceOuterClass {
  private StreamServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033service/StreamService.proto\022\037com.examp" +
      "le.grpc.server.service\032\"message/stream/S" +
      "treamMessage.proto2\236\003\n\rStreamService\022}\n\014" +
      "serverStream\0224.com.example.grpc.server.m" +
      "essage.ServerStreamRequest\0325.com.example" +
      ".grpc.server.message.ServerStreamRespons" +
      "e0\001\022}\n\014clientStream\0224.com.example.grpc.s" +
      "erver.message.ClientStreamRequest\0325.com." +
      "example.grpc.server.message.ClientStream" +
      "Response(\001\022\216\001\n\021bidirectionStream\0229.com.e" +
      "xample.grpc.server.message.BidirectionSt" +
      "reamRequest\032:.com.example.grpc.server.me" +
      "ssage.BidirectionStreamResponse(\0010\001b\006pro" +
      "to3"
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
          com.example.grpc.server.message.StreamMessage.getDescriptor(),
        }, assigner);
    com.example.grpc.server.message.StreamMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}