// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/critical_section.proto

package org.tensorflow.framework;

public interface CriticalSectionExecutionDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.CriticalSectionExecutionDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the critical section handle.
   * </pre>
   *
   * <code>string execute_in_critical_section_name = 1;</code>
   */
  java.lang.String getExecuteInCriticalSectionName();
  /**
   * <pre>
   * Name of the critical section handle.
   * </pre>
   *
   * <code>string execute_in_critical_section_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getExecuteInCriticalSectionNameBytes();

  /**
   * <pre>
   * Whether this operation requires exclusive access to its resources,
   * (i.e., no other CriticalSections may request the same resources).
   * </pre>
   *
   * <code>bool exclusive_resource_access = 2;</code>
   */
  boolean getExclusiveResourceAccess();
}