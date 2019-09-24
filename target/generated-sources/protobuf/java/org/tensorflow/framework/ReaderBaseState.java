// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/reader_base.proto

package org.tensorflow.framework;

/**
 * <pre>
 * For serializing and restoring the state of ReaderBase, see
 * reader_base.h for details.
 * </pre>
 *
 * Protobuf type {@code tensorflow.ReaderBaseState}
 */
public  final class ReaderBaseState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.ReaderBaseState)
    ReaderBaseStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReaderBaseState.newBuilder() to construct.
  private ReaderBaseState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReaderBaseState() {
    currentWork_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReaderBaseState(
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

            workStarted_ = input.readInt64();
            break;
          }
          case 16: {

            workFinished_ = input.readInt64();
            break;
          }
          case 24: {

            numRecordsProduced_ = input.readInt64();
            break;
          }
          case 34: {

            currentWork_ = input.readBytes();
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
    return org.tensorflow.framework.ReaderBaseProtos.internal_static_tensorflow_ReaderBaseState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.ReaderBaseProtos.internal_static_tensorflow_ReaderBaseState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.ReaderBaseState.class, org.tensorflow.framework.ReaderBaseState.Builder.class);
  }

  public static final int WORK_STARTED_FIELD_NUMBER = 1;
  private long workStarted_;
  /**
   * <code>int64 work_started = 1;</code>
   */
  public long getWorkStarted() {
    return workStarted_;
  }

  public static final int WORK_FINISHED_FIELD_NUMBER = 2;
  private long workFinished_;
  /**
   * <code>int64 work_finished = 2;</code>
   */
  public long getWorkFinished() {
    return workFinished_;
  }

  public static final int NUM_RECORDS_PRODUCED_FIELD_NUMBER = 3;
  private long numRecordsProduced_;
  /**
   * <code>int64 num_records_produced = 3;</code>
   */
  public long getNumRecordsProduced() {
    return numRecordsProduced_;
  }

  public static final int CURRENT_WORK_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString currentWork_;
  /**
   * <code>bytes current_work = 4;</code>
   */
  public com.google.protobuf.ByteString getCurrentWork() {
    return currentWork_;
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
    if (workStarted_ != 0L) {
      output.writeInt64(1, workStarted_);
    }
    if (workFinished_ != 0L) {
      output.writeInt64(2, workFinished_);
    }
    if (numRecordsProduced_ != 0L) {
      output.writeInt64(3, numRecordsProduced_);
    }
    if (!currentWork_.isEmpty()) {
      output.writeBytes(4, currentWork_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workStarted_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, workStarted_);
    }
    if (workFinished_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, workFinished_);
    }
    if (numRecordsProduced_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, numRecordsProduced_);
    }
    if (!currentWork_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, currentWork_);
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
    if (!(obj instanceof org.tensorflow.framework.ReaderBaseState)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.ReaderBaseState other = (org.tensorflow.framework.ReaderBaseState) obj;

    if (getWorkStarted()
        != other.getWorkStarted()) return false;
    if (getWorkFinished()
        != other.getWorkFinished()) return false;
    if (getNumRecordsProduced()
        != other.getNumRecordsProduced()) return false;
    if (!getCurrentWork()
        .equals(other.getCurrentWork())) return false;
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
    hash = (37 * hash) + WORK_STARTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWorkStarted());
    hash = (37 * hash) + WORK_FINISHED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWorkFinished());
    hash = (37 * hash) + NUM_RECORDS_PRODUCED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumRecordsProduced());
    hash = (37 * hash) + CURRENT_WORK_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentWork().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.ReaderBaseState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.ReaderBaseState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.ReaderBaseState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.ReaderBaseState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.ReaderBaseState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.ReaderBaseState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.ReaderBaseState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.ReaderBaseState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.ReaderBaseState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.ReaderBaseState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.ReaderBaseState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.ReaderBaseState parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.ReaderBaseState prototype) {
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
   * <pre>
   * For serializing and restoring the state of ReaderBase, see
   * reader_base.h for details.
   * </pre>
   *
   * Protobuf type {@code tensorflow.ReaderBaseState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.ReaderBaseState)
      org.tensorflow.framework.ReaderBaseStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.ReaderBaseProtos.internal_static_tensorflow_ReaderBaseState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.ReaderBaseProtos.internal_static_tensorflow_ReaderBaseState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.ReaderBaseState.class, org.tensorflow.framework.ReaderBaseState.Builder.class);
    }

    // Construct using org.tensorflow.framework.ReaderBaseState.newBuilder()
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
      workStarted_ = 0L;

      workFinished_ = 0L;

      numRecordsProduced_ = 0L;

      currentWork_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.ReaderBaseProtos.internal_static_tensorflow_ReaderBaseState_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.ReaderBaseState getDefaultInstanceForType() {
      return org.tensorflow.framework.ReaderBaseState.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.ReaderBaseState build() {
      org.tensorflow.framework.ReaderBaseState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.ReaderBaseState buildPartial() {
      org.tensorflow.framework.ReaderBaseState result = new org.tensorflow.framework.ReaderBaseState(this);
      result.workStarted_ = workStarted_;
      result.workFinished_ = workFinished_;
      result.numRecordsProduced_ = numRecordsProduced_;
      result.currentWork_ = currentWork_;
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
      if (other instanceof org.tensorflow.framework.ReaderBaseState) {
        return mergeFrom((org.tensorflow.framework.ReaderBaseState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.ReaderBaseState other) {
      if (other == org.tensorflow.framework.ReaderBaseState.getDefaultInstance()) return this;
      if (other.getWorkStarted() != 0L) {
        setWorkStarted(other.getWorkStarted());
      }
      if (other.getWorkFinished() != 0L) {
        setWorkFinished(other.getWorkFinished());
      }
      if (other.getNumRecordsProduced() != 0L) {
        setNumRecordsProduced(other.getNumRecordsProduced());
      }
      if (other.getCurrentWork() != com.google.protobuf.ByteString.EMPTY) {
        setCurrentWork(other.getCurrentWork());
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
      org.tensorflow.framework.ReaderBaseState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.ReaderBaseState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long workStarted_ ;
    /**
     * <code>int64 work_started = 1;</code>
     */
    public long getWorkStarted() {
      return workStarted_;
    }
    /**
     * <code>int64 work_started = 1;</code>
     */
    public Builder setWorkStarted(long value) {
      
      workStarted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 work_started = 1;</code>
     */
    public Builder clearWorkStarted() {
      
      workStarted_ = 0L;
      onChanged();
      return this;
    }

    private long workFinished_ ;
    /**
     * <code>int64 work_finished = 2;</code>
     */
    public long getWorkFinished() {
      return workFinished_;
    }
    /**
     * <code>int64 work_finished = 2;</code>
     */
    public Builder setWorkFinished(long value) {
      
      workFinished_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 work_finished = 2;</code>
     */
    public Builder clearWorkFinished() {
      
      workFinished_ = 0L;
      onChanged();
      return this;
    }

    private long numRecordsProduced_ ;
    /**
     * <code>int64 num_records_produced = 3;</code>
     */
    public long getNumRecordsProduced() {
      return numRecordsProduced_;
    }
    /**
     * <code>int64 num_records_produced = 3;</code>
     */
    public Builder setNumRecordsProduced(long value) {
      
      numRecordsProduced_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 num_records_produced = 3;</code>
     */
    public Builder clearNumRecordsProduced() {
      
      numRecordsProduced_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString currentWork_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes current_work = 4;</code>
     */
    public com.google.protobuf.ByteString getCurrentWork() {
      return currentWork_;
    }
    /**
     * <code>bytes current_work = 4;</code>
     */
    public Builder setCurrentWork(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currentWork_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes current_work = 4;</code>
     */
    public Builder clearCurrentWork() {
      
      currentWork_ = getDefaultInstance().getCurrentWork();
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.ReaderBaseState)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.ReaderBaseState)
  private static final org.tensorflow.framework.ReaderBaseState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.ReaderBaseState();
  }

  public static org.tensorflow.framework.ReaderBaseState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReaderBaseState>
      PARSER = new com.google.protobuf.AbstractParser<ReaderBaseState>() {
    @java.lang.Override
    public ReaderBaseState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReaderBaseState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReaderBaseState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReaderBaseState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.ReaderBaseState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

