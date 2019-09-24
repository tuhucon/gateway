// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/example/feature.proto

package org.tensorflow.example;

/**
 * <pre>
 * Containers for non-sequential data.
 * </pre>
 *
 * Protobuf type {@code tensorflow.Feature}
 */
public  final class Feature extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.Feature)
    FeatureOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Feature.newBuilder() to construct.
  private Feature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Feature() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Feature(
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
            org.tensorflow.example.BytesList.Builder subBuilder = null;
            if (kindCase_ == 1) {
              subBuilder = ((org.tensorflow.example.BytesList) kind_).toBuilder();
            }
            kind_ =
                input.readMessage(org.tensorflow.example.BytesList.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.tensorflow.example.BytesList) kind_);
              kind_ = subBuilder.buildPartial();
            }
            kindCase_ = 1;
            break;
          }
          case 18: {
            org.tensorflow.example.FloatList.Builder subBuilder = null;
            if (kindCase_ == 2) {
              subBuilder = ((org.tensorflow.example.FloatList) kind_).toBuilder();
            }
            kind_ =
                input.readMessage(org.tensorflow.example.FloatList.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.tensorflow.example.FloatList) kind_);
              kind_ = subBuilder.buildPartial();
            }
            kindCase_ = 2;
            break;
          }
          case 26: {
            org.tensorflow.example.Int64List.Builder subBuilder = null;
            if (kindCase_ == 3) {
              subBuilder = ((org.tensorflow.example.Int64List) kind_).toBuilder();
            }
            kind_ =
                input.readMessage(org.tensorflow.example.Int64List.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.tensorflow.example.Int64List) kind_);
              kind_ = subBuilder.buildPartial();
            }
            kindCase_ = 3;
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
    return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Feature_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Feature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.example.Feature.class, org.tensorflow.example.Feature.Builder.class);
  }

  private int kindCase_ = 0;
  private java.lang.Object kind_;
  public enum KindCase
      implements com.google.protobuf.Internal.EnumLite {
    BYTES_LIST(1),
    FLOAT_LIST(2),
    INT64_LIST(3),
    KIND_NOT_SET(0);
    private final int value;
    private KindCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static KindCase valueOf(int value) {
      return forNumber(value);
    }

    public static KindCase forNumber(int value) {
      switch (value) {
        case 1: return BYTES_LIST;
        case 2: return FLOAT_LIST;
        case 3: return INT64_LIST;
        case 0: return KIND_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public KindCase
  getKindCase() {
    return KindCase.forNumber(
        kindCase_);
  }

  public static final int BYTES_LIST_FIELD_NUMBER = 1;
  /**
   * <code>.tensorflow.BytesList bytes_list = 1;</code>
   */
  public boolean hasBytesList() {
    return kindCase_ == 1;
  }
  /**
   * <code>.tensorflow.BytesList bytes_list = 1;</code>
   */
  public org.tensorflow.example.BytesList getBytesList() {
    if (kindCase_ == 1) {
       return (org.tensorflow.example.BytesList) kind_;
    }
    return org.tensorflow.example.BytesList.getDefaultInstance();
  }
  /**
   * <code>.tensorflow.BytesList bytes_list = 1;</code>
   */
  public org.tensorflow.example.BytesListOrBuilder getBytesListOrBuilder() {
    if (kindCase_ == 1) {
       return (org.tensorflow.example.BytesList) kind_;
    }
    return org.tensorflow.example.BytesList.getDefaultInstance();
  }

  public static final int FLOAT_LIST_FIELD_NUMBER = 2;
  /**
   * <code>.tensorflow.FloatList float_list = 2;</code>
   */
  public boolean hasFloatList() {
    return kindCase_ == 2;
  }
  /**
   * <code>.tensorflow.FloatList float_list = 2;</code>
   */
  public org.tensorflow.example.FloatList getFloatList() {
    if (kindCase_ == 2) {
       return (org.tensorflow.example.FloatList) kind_;
    }
    return org.tensorflow.example.FloatList.getDefaultInstance();
  }
  /**
   * <code>.tensorflow.FloatList float_list = 2;</code>
   */
  public org.tensorflow.example.FloatListOrBuilder getFloatListOrBuilder() {
    if (kindCase_ == 2) {
       return (org.tensorflow.example.FloatList) kind_;
    }
    return org.tensorflow.example.FloatList.getDefaultInstance();
  }

  public static final int INT64_LIST_FIELD_NUMBER = 3;
  /**
   * <code>.tensorflow.Int64List int64_list = 3;</code>
   */
  public boolean hasInt64List() {
    return kindCase_ == 3;
  }
  /**
   * <code>.tensorflow.Int64List int64_list = 3;</code>
   */
  public org.tensorflow.example.Int64List getInt64List() {
    if (kindCase_ == 3) {
       return (org.tensorflow.example.Int64List) kind_;
    }
    return org.tensorflow.example.Int64List.getDefaultInstance();
  }
  /**
   * <code>.tensorflow.Int64List int64_list = 3;</code>
   */
  public org.tensorflow.example.Int64ListOrBuilder getInt64ListOrBuilder() {
    if (kindCase_ == 3) {
       return (org.tensorflow.example.Int64List) kind_;
    }
    return org.tensorflow.example.Int64List.getDefaultInstance();
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
    if (kindCase_ == 1) {
      output.writeMessage(1, (org.tensorflow.example.BytesList) kind_);
    }
    if (kindCase_ == 2) {
      output.writeMessage(2, (org.tensorflow.example.FloatList) kind_);
    }
    if (kindCase_ == 3) {
      output.writeMessage(3, (org.tensorflow.example.Int64List) kind_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kindCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.tensorflow.example.BytesList) kind_);
    }
    if (kindCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.tensorflow.example.FloatList) kind_);
    }
    if (kindCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (org.tensorflow.example.Int64List) kind_);
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
    if (!(obj instanceof org.tensorflow.example.Feature)) {
      return super.equals(obj);
    }
    org.tensorflow.example.Feature other = (org.tensorflow.example.Feature) obj;

    if (!getKindCase().equals(other.getKindCase())) return false;
    switch (kindCase_) {
      case 1:
        if (!getBytesList()
            .equals(other.getBytesList())) return false;
        break;
      case 2:
        if (!getFloatList()
            .equals(other.getFloatList())) return false;
        break;
      case 3:
        if (!getInt64List()
            .equals(other.getInt64List())) return false;
        break;
      case 0:
      default:
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
    switch (kindCase_) {
      case 1:
        hash = (37 * hash) + BYTES_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBytesList().hashCode();
        break;
      case 2:
        hash = (37 * hash) + FLOAT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFloatList().hashCode();
        break;
      case 3:
        hash = (37 * hash) + INT64_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getInt64List().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.example.Feature parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.Feature parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.Feature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.Feature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.Feature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.Feature parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.Feature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.Feature parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.Feature parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.Feature parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.Feature parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.Feature parseFrom(
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
  public static Builder newBuilder(org.tensorflow.example.Feature prototype) {
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
   * Containers for non-sequential data.
   * </pre>
   *
   * Protobuf type {@code tensorflow.Feature}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.Feature)
      org.tensorflow.example.FeatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Feature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Feature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.example.Feature.class, org.tensorflow.example.Feature.Builder.class);
    }

    // Construct using org.tensorflow.example.Feature.newBuilder()
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
      kindCase_ = 0;
      kind_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Feature_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.example.Feature getDefaultInstanceForType() {
      return org.tensorflow.example.Feature.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.example.Feature build() {
      org.tensorflow.example.Feature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.example.Feature buildPartial() {
      org.tensorflow.example.Feature result = new org.tensorflow.example.Feature(this);
      if (kindCase_ == 1) {
        if (bytesListBuilder_ == null) {
          result.kind_ = kind_;
        } else {
          result.kind_ = bytesListBuilder_.build();
        }
      }
      if (kindCase_ == 2) {
        if (floatListBuilder_ == null) {
          result.kind_ = kind_;
        } else {
          result.kind_ = floatListBuilder_.build();
        }
      }
      if (kindCase_ == 3) {
        if (int64ListBuilder_ == null) {
          result.kind_ = kind_;
        } else {
          result.kind_ = int64ListBuilder_.build();
        }
      }
      result.kindCase_ = kindCase_;
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
      if (other instanceof org.tensorflow.example.Feature) {
        return mergeFrom((org.tensorflow.example.Feature)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.example.Feature other) {
      if (other == org.tensorflow.example.Feature.getDefaultInstance()) return this;
      switch (other.getKindCase()) {
        case BYTES_LIST: {
          mergeBytesList(other.getBytesList());
          break;
        }
        case FLOAT_LIST: {
          mergeFloatList(other.getFloatList());
          break;
        }
        case INT64_LIST: {
          mergeInt64List(other.getInt64List());
          break;
        }
        case KIND_NOT_SET: {
          break;
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
      org.tensorflow.example.Feature parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.example.Feature) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int kindCase_ = 0;
    private java.lang.Object kind_;
    public KindCase
        getKindCase() {
      return KindCase.forNumber(
          kindCase_);
    }

    public Builder clearKind() {
      kindCase_ = 0;
      kind_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.BytesList, org.tensorflow.example.BytesList.Builder, org.tensorflow.example.BytesListOrBuilder> bytesListBuilder_;
    /**
     * <code>.tensorflow.BytesList bytes_list = 1;</code>
     */
    public boolean hasBytesList() {
      return kindCase_ == 1;
    }
    /**
     * <code>.tensorflow.BytesList bytes_list = 1;</code>
     */
    public org.tensorflow.example.BytesList getBytesList() {
      if (bytesListBuilder_ == null) {
        if (kindCase_ == 1) {
          return (org.tensorflow.example.BytesList) kind_;
        }
        return org.tensorflow.example.BytesList.getDefaultInstance();
      } else {
        if (kindCase_ == 1) {
          return bytesListBuilder_.getMessage();
        }
        return org.tensorflow.example.BytesList.getDefaultInstance();
      }
    }
    /**
     * <code>.tensorflow.BytesList bytes_list = 1;</code>
     */
    public Builder setBytesList(org.tensorflow.example.BytesList value) {
      if (bytesListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kind_ = value;
        onChanged();
      } else {
        bytesListBuilder_.setMessage(value);
      }
      kindCase_ = 1;
      return this;
    }
    /**
     * <code>.tensorflow.BytesList bytes_list = 1;</code>
     */
    public Builder setBytesList(
        org.tensorflow.example.BytesList.Builder builderForValue) {
      if (bytesListBuilder_ == null) {
        kind_ = builderForValue.build();
        onChanged();
      } else {
        bytesListBuilder_.setMessage(builderForValue.build());
      }
      kindCase_ = 1;
      return this;
    }
    /**
     * <code>.tensorflow.BytesList bytes_list = 1;</code>
     */
    public Builder mergeBytesList(org.tensorflow.example.BytesList value) {
      if (bytesListBuilder_ == null) {
        if (kindCase_ == 1 &&
            kind_ != org.tensorflow.example.BytesList.getDefaultInstance()) {
          kind_ = org.tensorflow.example.BytesList.newBuilder((org.tensorflow.example.BytesList) kind_)
              .mergeFrom(value).buildPartial();
        } else {
          kind_ = value;
        }
        onChanged();
      } else {
        if (kindCase_ == 1) {
          bytesListBuilder_.mergeFrom(value);
        }
        bytesListBuilder_.setMessage(value);
      }
      kindCase_ = 1;
      return this;
    }
    /**
     * <code>.tensorflow.BytesList bytes_list = 1;</code>
     */
    public Builder clearBytesList() {
      if (bytesListBuilder_ == null) {
        if (kindCase_ == 1) {
          kindCase_ = 0;
          kind_ = null;
          onChanged();
        }
      } else {
        if (kindCase_ == 1) {
          kindCase_ = 0;
          kind_ = null;
        }
        bytesListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.tensorflow.BytesList bytes_list = 1;</code>
     */
    public org.tensorflow.example.BytesList.Builder getBytesListBuilder() {
      return getBytesListFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.BytesList bytes_list = 1;</code>
     */
    public org.tensorflow.example.BytesListOrBuilder getBytesListOrBuilder() {
      if ((kindCase_ == 1) && (bytesListBuilder_ != null)) {
        return bytesListBuilder_.getMessageOrBuilder();
      } else {
        if (kindCase_ == 1) {
          return (org.tensorflow.example.BytesList) kind_;
        }
        return org.tensorflow.example.BytesList.getDefaultInstance();
      }
    }
    /**
     * <code>.tensorflow.BytesList bytes_list = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.BytesList, org.tensorflow.example.BytesList.Builder, org.tensorflow.example.BytesListOrBuilder> 
        getBytesListFieldBuilder() {
      if (bytesListBuilder_ == null) {
        if (!(kindCase_ == 1)) {
          kind_ = org.tensorflow.example.BytesList.getDefaultInstance();
        }
        bytesListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.example.BytesList, org.tensorflow.example.BytesList.Builder, org.tensorflow.example.BytesListOrBuilder>(
                (org.tensorflow.example.BytesList) kind_,
                getParentForChildren(),
                isClean());
        kind_ = null;
      }
      kindCase_ = 1;
      onChanged();;
      return bytesListBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.FloatList, org.tensorflow.example.FloatList.Builder, org.tensorflow.example.FloatListOrBuilder> floatListBuilder_;
    /**
     * <code>.tensorflow.FloatList float_list = 2;</code>
     */
    public boolean hasFloatList() {
      return kindCase_ == 2;
    }
    /**
     * <code>.tensorflow.FloatList float_list = 2;</code>
     */
    public org.tensorflow.example.FloatList getFloatList() {
      if (floatListBuilder_ == null) {
        if (kindCase_ == 2) {
          return (org.tensorflow.example.FloatList) kind_;
        }
        return org.tensorflow.example.FloatList.getDefaultInstance();
      } else {
        if (kindCase_ == 2) {
          return floatListBuilder_.getMessage();
        }
        return org.tensorflow.example.FloatList.getDefaultInstance();
      }
    }
    /**
     * <code>.tensorflow.FloatList float_list = 2;</code>
     */
    public Builder setFloatList(org.tensorflow.example.FloatList value) {
      if (floatListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kind_ = value;
        onChanged();
      } else {
        floatListBuilder_.setMessage(value);
      }
      kindCase_ = 2;
      return this;
    }
    /**
     * <code>.tensorflow.FloatList float_list = 2;</code>
     */
    public Builder setFloatList(
        org.tensorflow.example.FloatList.Builder builderForValue) {
      if (floatListBuilder_ == null) {
        kind_ = builderForValue.build();
        onChanged();
      } else {
        floatListBuilder_.setMessage(builderForValue.build());
      }
      kindCase_ = 2;
      return this;
    }
    /**
     * <code>.tensorflow.FloatList float_list = 2;</code>
     */
    public Builder mergeFloatList(org.tensorflow.example.FloatList value) {
      if (floatListBuilder_ == null) {
        if (kindCase_ == 2 &&
            kind_ != org.tensorflow.example.FloatList.getDefaultInstance()) {
          kind_ = org.tensorflow.example.FloatList.newBuilder((org.tensorflow.example.FloatList) kind_)
              .mergeFrom(value).buildPartial();
        } else {
          kind_ = value;
        }
        onChanged();
      } else {
        if (kindCase_ == 2) {
          floatListBuilder_.mergeFrom(value);
        }
        floatListBuilder_.setMessage(value);
      }
      kindCase_ = 2;
      return this;
    }
    /**
     * <code>.tensorflow.FloatList float_list = 2;</code>
     */
    public Builder clearFloatList() {
      if (floatListBuilder_ == null) {
        if (kindCase_ == 2) {
          kindCase_ = 0;
          kind_ = null;
          onChanged();
        }
      } else {
        if (kindCase_ == 2) {
          kindCase_ = 0;
          kind_ = null;
        }
        floatListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.tensorflow.FloatList float_list = 2;</code>
     */
    public org.tensorflow.example.FloatList.Builder getFloatListBuilder() {
      return getFloatListFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.FloatList float_list = 2;</code>
     */
    public org.tensorflow.example.FloatListOrBuilder getFloatListOrBuilder() {
      if ((kindCase_ == 2) && (floatListBuilder_ != null)) {
        return floatListBuilder_.getMessageOrBuilder();
      } else {
        if (kindCase_ == 2) {
          return (org.tensorflow.example.FloatList) kind_;
        }
        return org.tensorflow.example.FloatList.getDefaultInstance();
      }
    }
    /**
     * <code>.tensorflow.FloatList float_list = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.FloatList, org.tensorflow.example.FloatList.Builder, org.tensorflow.example.FloatListOrBuilder> 
        getFloatListFieldBuilder() {
      if (floatListBuilder_ == null) {
        if (!(kindCase_ == 2)) {
          kind_ = org.tensorflow.example.FloatList.getDefaultInstance();
        }
        floatListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.example.FloatList, org.tensorflow.example.FloatList.Builder, org.tensorflow.example.FloatListOrBuilder>(
                (org.tensorflow.example.FloatList) kind_,
                getParentForChildren(),
                isClean());
        kind_ = null;
      }
      kindCase_ = 2;
      onChanged();;
      return floatListBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.Int64List, org.tensorflow.example.Int64List.Builder, org.tensorflow.example.Int64ListOrBuilder> int64ListBuilder_;
    /**
     * <code>.tensorflow.Int64List int64_list = 3;</code>
     */
    public boolean hasInt64List() {
      return kindCase_ == 3;
    }
    /**
     * <code>.tensorflow.Int64List int64_list = 3;</code>
     */
    public org.tensorflow.example.Int64List getInt64List() {
      if (int64ListBuilder_ == null) {
        if (kindCase_ == 3) {
          return (org.tensorflow.example.Int64List) kind_;
        }
        return org.tensorflow.example.Int64List.getDefaultInstance();
      } else {
        if (kindCase_ == 3) {
          return int64ListBuilder_.getMessage();
        }
        return org.tensorflow.example.Int64List.getDefaultInstance();
      }
    }
    /**
     * <code>.tensorflow.Int64List int64_list = 3;</code>
     */
    public Builder setInt64List(org.tensorflow.example.Int64List value) {
      if (int64ListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kind_ = value;
        onChanged();
      } else {
        int64ListBuilder_.setMessage(value);
      }
      kindCase_ = 3;
      return this;
    }
    /**
     * <code>.tensorflow.Int64List int64_list = 3;</code>
     */
    public Builder setInt64List(
        org.tensorflow.example.Int64List.Builder builderForValue) {
      if (int64ListBuilder_ == null) {
        kind_ = builderForValue.build();
        onChanged();
      } else {
        int64ListBuilder_.setMessage(builderForValue.build());
      }
      kindCase_ = 3;
      return this;
    }
    /**
     * <code>.tensorflow.Int64List int64_list = 3;</code>
     */
    public Builder mergeInt64List(org.tensorflow.example.Int64List value) {
      if (int64ListBuilder_ == null) {
        if (kindCase_ == 3 &&
            kind_ != org.tensorflow.example.Int64List.getDefaultInstance()) {
          kind_ = org.tensorflow.example.Int64List.newBuilder((org.tensorflow.example.Int64List) kind_)
              .mergeFrom(value).buildPartial();
        } else {
          kind_ = value;
        }
        onChanged();
      } else {
        if (kindCase_ == 3) {
          int64ListBuilder_.mergeFrom(value);
        }
        int64ListBuilder_.setMessage(value);
      }
      kindCase_ = 3;
      return this;
    }
    /**
     * <code>.tensorflow.Int64List int64_list = 3;</code>
     */
    public Builder clearInt64List() {
      if (int64ListBuilder_ == null) {
        if (kindCase_ == 3) {
          kindCase_ = 0;
          kind_ = null;
          onChanged();
        }
      } else {
        if (kindCase_ == 3) {
          kindCase_ = 0;
          kind_ = null;
        }
        int64ListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.tensorflow.Int64List int64_list = 3;</code>
     */
    public org.tensorflow.example.Int64List.Builder getInt64ListBuilder() {
      return getInt64ListFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.Int64List int64_list = 3;</code>
     */
    public org.tensorflow.example.Int64ListOrBuilder getInt64ListOrBuilder() {
      if ((kindCase_ == 3) && (int64ListBuilder_ != null)) {
        return int64ListBuilder_.getMessageOrBuilder();
      } else {
        if (kindCase_ == 3) {
          return (org.tensorflow.example.Int64List) kind_;
        }
        return org.tensorflow.example.Int64List.getDefaultInstance();
      }
    }
    /**
     * <code>.tensorflow.Int64List int64_list = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.Int64List, org.tensorflow.example.Int64List.Builder, org.tensorflow.example.Int64ListOrBuilder> 
        getInt64ListFieldBuilder() {
      if (int64ListBuilder_ == null) {
        if (!(kindCase_ == 3)) {
          kind_ = org.tensorflow.example.Int64List.getDefaultInstance();
        }
        int64ListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.example.Int64List, org.tensorflow.example.Int64List.Builder, org.tensorflow.example.Int64ListOrBuilder>(
                (org.tensorflow.example.Int64List) kind_,
                getParentForChildren(),
                isClean());
        kind_ = null;
      }
      kindCase_ = 3;
      onChanged();;
      return int64ListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.Feature)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.Feature)
  private static final org.tensorflow.example.Feature DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.example.Feature();
  }

  public static org.tensorflow.example.Feature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Feature>
      PARSER = new com.google.protobuf.AbstractParser<Feature>() {
    @java.lang.Override
    public Feature parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Feature(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Feature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Feature> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.example.Feature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

