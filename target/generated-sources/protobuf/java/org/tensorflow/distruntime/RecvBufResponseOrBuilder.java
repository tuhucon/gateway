// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

public interface RecvBufResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.RecvBufResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Address of source field on server.
   * </pre>
   *
   * <code>fixed64 buf_ptr = 1;</code>
   */
  long getBufPtr();

  /**
   * <pre>
   * Byte length of buf_ptr field, if set.
   * </pre>
   *
   * <code>int64 num_bytes = 2;</code>
   */
  long getNumBytes();

  /**
   * <pre>
   * True if value is 'dead' like a tensor.
   * </pre>
   *
   * <code>bool is_dead = 3;</code>
   */
  boolean getIsDead();

  /**
   * <pre>
   * Optional, implementation-specific data.
   * </pre>
   *
   * <code>.google.protobuf.Any transport_options = 4;</code>
   */
  boolean hasTransportOptions();
  /**
   * <pre>
   * Optional, implementation-specific data.
   * </pre>
   *
   * <code>.google.protobuf.Any transport_options = 4;</code>
   */
  com.google.protobuf.Any getTransportOptions();
  /**
   * <pre>
   * Optional, implementation-specific data.
   * </pre>
   *
   * <code>.google.protobuf.Any transport_options = 4;</code>
   */
  com.google.protobuf.AnyOrBuilder getTransportOptionsOrBuilder();

  /**
   * <pre>
   * Optional, for timeline.
   * </pre>
   *
   * <code>int64 send_start_micros = 5;</code>
   */
  long getSendStartMicros();
}
