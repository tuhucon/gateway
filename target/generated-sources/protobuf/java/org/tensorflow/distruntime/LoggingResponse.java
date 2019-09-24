// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

/**
 * Protobuf type {@code tensorflow.LoggingResponse}
 */
public  final class LoggingResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.LoggingResponse)
    LoggingResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoggingResponse.newBuilder() to construct.
  private LoggingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoggingResponse() {
    step_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LoggingResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              step_ = new java.util.ArrayList<org.tensorflow.distruntime.LabeledStepStats>();
              mutable_bitField0_ |= 0x00000001;
            }
            step_.add(
                input.readMessage(org.tensorflow.distruntime.LabeledStepStats.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        step_ = java.util.Collections.unmodifiableList(step_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LoggingResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LoggingResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.LoggingResponse.class, org.tensorflow.distruntime.LoggingResponse.Builder.class);
  }

  public static final int STEP_FIELD_NUMBER = 1;
  private java.util.List<org.tensorflow.distruntime.LabeledStepStats> step_;
  /**
   * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
   */
  public java.util.List<org.tensorflow.distruntime.LabeledStepStats> getStepList() {
    return step_;
  }
  /**
   * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
   */
  public java.util.List<? extends org.tensorflow.distruntime.LabeledStepStatsOrBuilder> 
      getStepOrBuilderList() {
    return step_;
  }
  /**
   * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
   */
  public int getStepCount() {
    return step_.size();
  }
  /**
   * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
   */
  public org.tensorflow.distruntime.LabeledStepStats getStep(int index) {
    return step_.get(index);
  }
  /**
   * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
   */
  public org.tensorflow.distruntime.LabeledStepStatsOrBuilder getStepOrBuilder(
      int index) {
    return step_.get(index);
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
    for (int i = 0; i < step_.size(); i++) {
      output.writeMessage(1, step_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < step_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, step_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.distruntime.LoggingResponse)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.LoggingResponse other = (org.tensorflow.distruntime.LoggingResponse) obj;

    if (!getStepList()
        .equals(other.getStepList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStepCount() > 0) {
      hash = (37 * hash) + STEP_FIELD_NUMBER;
      hash = (53 * hash) + getStepList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.LoggingResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.LoggingResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LoggingResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.LoggingResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LoggingResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.LoggingResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LoggingResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.LoggingResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LoggingResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.LoggingResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LoggingResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.LoggingResponse parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.LoggingResponse prototype) {
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
   * Protobuf type {@code tensorflow.LoggingResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.LoggingResponse)
      org.tensorflow.distruntime.LoggingResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LoggingResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LoggingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.LoggingResponse.class, org.tensorflow.distruntime.LoggingResponse.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.LoggingResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getStepFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (stepBuilder_ == null) {
        step_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        stepBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LoggingResponse_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.LoggingResponse getDefaultInstanceForType() {
      return org.tensorflow.distruntime.LoggingResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.LoggingResponse build() {
      org.tensorflow.distruntime.LoggingResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.LoggingResponse buildPartial() {
      org.tensorflow.distruntime.LoggingResponse result = new org.tensorflow.distruntime.LoggingResponse(this);
      int from_bitField0_ = bitField0_;
      if (stepBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          step_ = java.util.Collections.unmodifiableList(step_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.step_ = step_;
      } else {
        result.step_ = stepBuilder_.build();
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
      if (other instanceof org.tensorflow.distruntime.LoggingResponse) {
        return mergeFrom((org.tensorflow.distruntime.LoggingResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.LoggingResponse other) {
      if (other == org.tensorflow.distruntime.LoggingResponse.getDefaultInstance()) return this;
      if (stepBuilder_ == null) {
        if (!other.step_.isEmpty()) {
          if (step_.isEmpty()) {
            step_ = other.step_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStepIsMutable();
            step_.addAll(other.step_);
          }
          onChanged();
        }
      } else {
        if (!other.step_.isEmpty()) {
          if (stepBuilder_.isEmpty()) {
            stepBuilder_.dispose();
            stepBuilder_ = null;
            step_ = other.step_;
            bitField0_ = (bitField0_ & ~0x00000001);
            stepBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStepFieldBuilder() : null;
          } else {
            stepBuilder_.addAllMessages(other.step_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      org.tensorflow.distruntime.LoggingResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.LoggingResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.tensorflow.distruntime.LabeledStepStats> step_ =
      java.util.Collections.emptyList();
    private void ensureStepIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        step_ = new java.util.ArrayList<org.tensorflow.distruntime.LabeledStepStats>(step_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.distruntime.LabeledStepStats, org.tensorflow.distruntime.LabeledStepStats.Builder, org.tensorflow.distruntime.LabeledStepStatsOrBuilder> stepBuilder_;

    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public java.util.List<org.tensorflow.distruntime.LabeledStepStats> getStepList() {
      if (stepBuilder_ == null) {
        return java.util.Collections.unmodifiableList(step_);
      } else {
        return stepBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public int getStepCount() {
      if (stepBuilder_ == null) {
        return step_.size();
      } else {
        return stepBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public org.tensorflow.distruntime.LabeledStepStats getStep(int index) {
      if (stepBuilder_ == null) {
        return step_.get(index);
      } else {
        return stepBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public Builder setStep(
        int index, org.tensorflow.distruntime.LabeledStepStats value) {
      if (stepBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStepIsMutable();
        step_.set(index, value);
        onChanged();
      } else {
        stepBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public Builder setStep(
        int index, org.tensorflow.distruntime.LabeledStepStats.Builder builderForValue) {
      if (stepBuilder_ == null) {
        ensureStepIsMutable();
        step_.set(index, builderForValue.build());
        onChanged();
      } else {
        stepBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public Builder addStep(org.tensorflow.distruntime.LabeledStepStats value) {
      if (stepBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStepIsMutable();
        step_.add(value);
        onChanged();
      } else {
        stepBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public Builder addStep(
        int index, org.tensorflow.distruntime.LabeledStepStats value) {
      if (stepBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStepIsMutable();
        step_.add(index, value);
        onChanged();
      } else {
        stepBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public Builder addStep(
        org.tensorflow.distruntime.LabeledStepStats.Builder builderForValue) {
      if (stepBuilder_ == null) {
        ensureStepIsMutable();
        step_.add(builderForValue.build());
        onChanged();
      } else {
        stepBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public Builder addStep(
        int index, org.tensorflow.distruntime.LabeledStepStats.Builder builderForValue) {
      if (stepBuilder_ == null) {
        ensureStepIsMutable();
        step_.add(index, builderForValue.build());
        onChanged();
      } else {
        stepBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public Builder addAllStep(
        java.lang.Iterable<? extends org.tensorflow.distruntime.LabeledStepStats> values) {
      if (stepBuilder_ == null) {
        ensureStepIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, step_);
        onChanged();
      } else {
        stepBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public Builder clearStep() {
      if (stepBuilder_ == null) {
        step_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        stepBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public Builder removeStep(int index) {
      if (stepBuilder_ == null) {
        ensureStepIsMutable();
        step_.remove(index);
        onChanged();
      } else {
        stepBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public org.tensorflow.distruntime.LabeledStepStats.Builder getStepBuilder(
        int index) {
      return getStepFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public org.tensorflow.distruntime.LabeledStepStatsOrBuilder getStepOrBuilder(
        int index) {
      if (stepBuilder_ == null) {
        return step_.get(index);  } else {
        return stepBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public java.util.List<? extends org.tensorflow.distruntime.LabeledStepStatsOrBuilder> 
         getStepOrBuilderList() {
      if (stepBuilder_ != null) {
        return stepBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(step_);
      }
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public org.tensorflow.distruntime.LabeledStepStats.Builder addStepBuilder() {
      return getStepFieldBuilder().addBuilder(
          org.tensorflow.distruntime.LabeledStepStats.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public org.tensorflow.distruntime.LabeledStepStats.Builder addStepBuilder(
        int index) {
      return getStepFieldBuilder().addBuilder(
          index, org.tensorflow.distruntime.LabeledStepStats.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.LabeledStepStats step = 1;</code>
     */
    public java.util.List<org.tensorflow.distruntime.LabeledStepStats.Builder> 
         getStepBuilderList() {
      return getStepFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.distruntime.LabeledStepStats, org.tensorflow.distruntime.LabeledStepStats.Builder, org.tensorflow.distruntime.LabeledStepStatsOrBuilder> 
        getStepFieldBuilder() {
      if (stepBuilder_ == null) {
        stepBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.distruntime.LabeledStepStats, org.tensorflow.distruntime.LabeledStepStats.Builder, org.tensorflow.distruntime.LabeledStepStatsOrBuilder>(
                step_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        step_ = null;
      }
      return stepBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.LoggingResponse)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.LoggingResponse)
  private static final org.tensorflow.distruntime.LoggingResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.LoggingResponse();
  }

  public static org.tensorflow.distruntime.LoggingResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoggingResponse>
      PARSER = new com.google.protobuf.AbstractParser<LoggingResponse>() {
    @java.lang.Override
    public LoggingResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoggingResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoggingResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoggingResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.LoggingResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

