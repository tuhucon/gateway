// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

/**
 * Protobuf type {@code tensorflow.LabeledStepStats}
 */
public  final class LabeledStepStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.LabeledStepStats)
    LabeledStepStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LabeledStepStats.newBuilder() to construct.
  private LabeledStepStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LabeledStepStats() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LabeledStepStats(
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
          case 8: {

            stepId_ = input.readInt64();
            break;
          }
          case 18: {
            org.tensorflow.framework.StepStats.Builder subBuilder = null;
            if (stepStats_ != null) {
              subBuilder = stepStats_.toBuilder();
            }
            stepStats_ = input.readMessage(org.tensorflow.framework.StepStats.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stepStats_);
              stepStats_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LabeledStepStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LabeledStepStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.LabeledStepStats.class, org.tensorflow.distruntime.LabeledStepStats.Builder.class);
  }

  public static final int STEP_ID_FIELD_NUMBER = 1;
  private long stepId_;
  /**
   * <code>int64 step_id = 1;</code>
   */
  public long getStepId() {
    return stepId_;
  }

  public static final int STEP_STATS_FIELD_NUMBER = 2;
  private org.tensorflow.framework.StepStats stepStats_;
  /**
   * <code>.tensorflow.StepStats step_stats = 2;</code>
   */
  public boolean hasStepStats() {
    return stepStats_ != null;
  }
  /**
   * <code>.tensorflow.StepStats step_stats = 2;</code>
   */
  public org.tensorflow.framework.StepStats getStepStats() {
    return stepStats_ == null ? org.tensorflow.framework.StepStats.getDefaultInstance() : stepStats_;
  }
  /**
   * <code>.tensorflow.StepStats step_stats = 2;</code>
   */
  public org.tensorflow.framework.StepStatsOrBuilder getStepStatsOrBuilder() {
    return getStepStats();
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
    if (stepId_ != 0L) {
      output.writeInt64(1, stepId_);
    }
    if (stepStats_ != null) {
      output.writeMessage(2, getStepStats());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stepId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, stepId_);
    }
    if (stepStats_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStepStats());
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
    if (!(obj instanceof org.tensorflow.distruntime.LabeledStepStats)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.LabeledStepStats other = (org.tensorflow.distruntime.LabeledStepStats) obj;

    if (getStepId()
        != other.getStepId()) return false;
    if (hasStepStats() != other.hasStepStats()) return false;
    if (hasStepStats()) {
      if (!getStepStats()
          .equals(other.getStepStats())) return false;
    }
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
    hash = (37 * hash) + STEP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStepId());
    if (hasStepStats()) {
      hash = (37 * hash) + STEP_STATS_FIELD_NUMBER;
      hash = (53 * hash) + getStepStats().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.LabeledStepStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.LabeledStepStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LabeledStepStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.LabeledStepStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LabeledStepStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.LabeledStepStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LabeledStepStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.LabeledStepStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LabeledStepStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.LabeledStepStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LabeledStepStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.LabeledStepStats parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.LabeledStepStats prototype) {
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
   * Protobuf type {@code tensorflow.LabeledStepStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.LabeledStepStats)
      org.tensorflow.distruntime.LabeledStepStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LabeledStepStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LabeledStepStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.LabeledStepStats.class, org.tensorflow.distruntime.LabeledStepStats.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.LabeledStepStats.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      stepId_ = 0L;

      if (stepStatsBuilder_ == null) {
        stepStats_ = null;
      } else {
        stepStats_ = null;
        stepStatsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LabeledStepStats_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.LabeledStepStats getDefaultInstanceForType() {
      return org.tensorflow.distruntime.LabeledStepStats.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.LabeledStepStats build() {
      org.tensorflow.distruntime.LabeledStepStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.LabeledStepStats buildPartial() {
      org.tensorflow.distruntime.LabeledStepStats result = new org.tensorflow.distruntime.LabeledStepStats(this);
      result.stepId_ = stepId_;
      if (stepStatsBuilder_ == null) {
        result.stepStats_ = stepStats_;
      } else {
        result.stepStats_ = stepStatsBuilder_.build();
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
      if (other instanceof org.tensorflow.distruntime.LabeledStepStats) {
        return mergeFrom((org.tensorflow.distruntime.LabeledStepStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.LabeledStepStats other) {
      if (other == org.tensorflow.distruntime.LabeledStepStats.getDefaultInstance()) return this;
      if (other.getStepId() != 0L) {
        setStepId(other.getStepId());
      }
      if (other.hasStepStats()) {
        mergeStepStats(other.getStepStats());
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
      org.tensorflow.distruntime.LabeledStepStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.LabeledStepStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long stepId_ ;
    /**
     * <code>int64 step_id = 1;</code>
     */
    public long getStepId() {
      return stepId_;
    }
    /**
     * <code>int64 step_id = 1;</code>
     */
    public Builder setStepId(long value) {
      
      stepId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 step_id = 1;</code>
     */
    public Builder clearStepId() {
      
      stepId_ = 0L;
      onChanged();
      return this;
    }

    private org.tensorflow.framework.StepStats stepStats_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.StepStats, org.tensorflow.framework.StepStats.Builder, org.tensorflow.framework.StepStatsOrBuilder> stepStatsBuilder_;
    /**
     * <code>.tensorflow.StepStats step_stats = 2;</code>
     */
    public boolean hasStepStats() {
      return stepStatsBuilder_ != null || stepStats_ != null;
    }
    /**
     * <code>.tensorflow.StepStats step_stats = 2;</code>
     */
    public org.tensorflow.framework.StepStats getStepStats() {
      if (stepStatsBuilder_ == null) {
        return stepStats_ == null ? org.tensorflow.framework.StepStats.getDefaultInstance() : stepStats_;
      } else {
        return stepStatsBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.StepStats step_stats = 2;</code>
     */
    public Builder setStepStats(org.tensorflow.framework.StepStats value) {
      if (stepStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stepStats_ = value;
        onChanged();
      } else {
        stepStatsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.StepStats step_stats = 2;</code>
     */
    public Builder setStepStats(
        org.tensorflow.framework.StepStats.Builder builderForValue) {
      if (stepStatsBuilder_ == null) {
        stepStats_ = builderForValue.build();
        onChanged();
      } else {
        stepStatsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.StepStats step_stats = 2;</code>
     */
    public Builder mergeStepStats(org.tensorflow.framework.StepStats value) {
      if (stepStatsBuilder_ == null) {
        if (stepStats_ != null) {
          stepStats_ =
            org.tensorflow.framework.StepStats.newBuilder(stepStats_).mergeFrom(value).buildPartial();
        } else {
          stepStats_ = value;
        }
        onChanged();
      } else {
        stepStatsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.StepStats step_stats = 2;</code>
     */
    public Builder clearStepStats() {
      if (stepStatsBuilder_ == null) {
        stepStats_ = null;
        onChanged();
      } else {
        stepStats_ = null;
        stepStatsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.StepStats step_stats = 2;</code>
     */
    public org.tensorflow.framework.StepStats.Builder getStepStatsBuilder() {
      
      onChanged();
      return getStepStatsFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.StepStats step_stats = 2;</code>
     */
    public org.tensorflow.framework.StepStatsOrBuilder getStepStatsOrBuilder() {
      if (stepStatsBuilder_ != null) {
        return stepStatsBuilder_.getMessageOrBuilder();
      } else {
        return stepStats_ == null ?
            org.tensorflow.framework.StepStats.getDefaultInstance() : stepStats_;
      }
    }
    /**
     * <code>.tensorflow.StepStats step_stats = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.StepStats, org.tensorflow.framework.StepStats.Builder, org.tensorflow.framework.StepStatsOrBuilder> 
        getStepStatsFieldBuilder() {
      if (stepStatsBuilder_ == null) {
        stepStatsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.StepStats, org.tensorflow.framework.StepStats.Builder, org.tensorflow.framework.StepStatsOrBuilder>(
                getStepStats(),
                getParentForChildren(),
                isClean());
        stepStats_ = null;
      }
      return stepStatsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.LabeledStepStats)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.LabeledStepStats)
  private static final org.tensorflow.distruntime.LabeledStepStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.LabeledStepStats();
  }

  public static org.tensorflow.distruntime.LabeledStepStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabeledStepStats>
      PARSER = new com.google.protobuf.AbstractParser<LabeledStepStats>() {
    @java.lang.Override
    public LabeledStepStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LabeledStepStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LabeledStepStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabeledStepStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.LabeledStepStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

