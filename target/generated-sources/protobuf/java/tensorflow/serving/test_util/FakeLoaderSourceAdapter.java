// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_serving/core/test_util/fake_loader_source_adapter.proto

package tensorflow.serving.test_util;

public final class FakeLoaderSourceAdapter {
  private FakeLoaderSourceAdapter() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FakeLoaderSourceAdapterConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tensorflow.serving.test_util.FakeLoaderSourceAdapterConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * FakeLoaderSourceAdapter's 'suffix' ctor parameter.
     * </pre>
     *
     * <code>string suffix = 1;</code>
     */
    java.lang.String getSuffix();
    /**
     * <pre>
     * FakeLoaderSourceAdapter's 'suffix' ctor parameter.
     * </pre>
     *
     * <code>string suffix = 1;</code>
     */
    com.google.protobuf.ByteString
        getSuffixBytes();
  }
  /**
   * <pre>
   * Config proto for FakeLoaderSourceAdapter.
   * </pre>
   *
   * Protobuf type {@code tensorflow.serving.test_util.FakeLoaderSourceAdapterConfig}
   */
  public  static final class FakeLoaderSourceAdapterConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tensorflow.serving.test_util.FakeLoaderSourceAdapterConfig)
      FakeLoaderSourceAdapterConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FakeLoaderSourceAdapterConfig.newBuilder() to construct.
    private FakeLoaderSourceAdapterConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FakeLoaderSourceAdapterConfig() {
      suffix_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FakeLoaderSourceAdapterConfig(
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
              java.lang.String s = input.readStringRequireUtf8();

              suffix_ = s;
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
      return tensorflow.serving.test_util.FakeLoaderSourceAdapter.internal_static_tensorflow_serving_test_util_FakeLoaderSourceAdapterConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tensorflow.serving.test_util.FakeLoaderSourceAdapter.internal_static_tensorflow_serving_test_util_FakeLoaderSourceAdapterConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig.class, tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig.Builder.class);
    }

    public static final int SUFFIX_FIELD_NUMBER = 1;
    private volatile java.lang.Object suffix_;
    /**
     * <pre>
     * FakeLoaderSourceAdapter's 'suffix' ctor parameter.
     * </pre>
     *
     * <code>string suffix = 1;</code>
     */
    public java.lang.String getSuffix() {
      java.lang.Object ref = suffix_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        suffix_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * FakeLoaderSourceAdapter's 'suffix' ctor parameter.
     * </pre>
     *
     * <code>string suffix = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSuffixBytes() {
      java.lang.Object ref = suffix_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        suffix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getSuffixBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, suffix_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getSuffixBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, suffix_);
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
      if (!(obj instanceof tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig)) {
        return super.equals(obj);
      }
      tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig other = (tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig) obj;

      if (!getSuffix()
          .equals(other.getSuffix())) return false;
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
      hash = (37 * hash) + SUFFIX_FIELD_NUMBER;
      hash = (53 * hash) + getSuffix().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig parseFrom(
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
    public static Builder newBuilder(tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig prototype) {
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
     * Config proto for FakeLoaderSourceAdapter.
     * </pre>
     *
     * Protobuf type {@code tensorflow.serving.test_util.FakeLoaderSourceAdapterConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tensorflow.serving.test_util.FakeLoaderSourceAdapterConfig)
        tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tensorflow.serving.test_util.FakeLoaderSourceAdapter.internal_static_tensorflow_serving_test_util_FakeLoaderSourceAdapterConfig_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tensorflow.serving.test_util.FakeLoaderSourceAdapter.internal_static_tensorflow_serving_test_util_FakeLoaderSourceAdapterConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig.class, tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig.Builder.class);
      }

      // Construct using tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig.newBuilder()
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
        suffix_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tensorflow.serving.test_util.FakeLoaderSourceAdapter.internal_static_tensorflow_serving_test_util_FakeLoaderSourceAdapterConfig_descriptor;
      }

      @java.lang.Override
      public tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig getDefaultInstanceForType() {
        return tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig.getDefaultInstance();
      }

      @java.lang.Override
      public tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig build() {
        tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig buildPartial() {
        tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig result = new tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig(this);
        result.suffix_ = suffix_;
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
        if (other instanceof tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig) {
          return mergeFrom((tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig other) {
        if (other == tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig.getDefaultInstance()) return this;
        if (!other.getSuffix().isEmpty()) {
          suffix_ = other.suffix_;
          onChanged();
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
        tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object suffix_ = "";
      /**
       * <pre>
       * FakeLoaderSourceAdapter's 'suffix' ctor parameter.
       * </pre>
       *
       * <code>string suffix = 1;</code>
       */
      public java.lang.String getSuffix() {
        java.lang.Object ref = suffix_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          suffix_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * FakeLoaderSourceAdapter's 'suffix' ctor parameter.
       * </pre>
       *
       * <code>string suffix = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSuffixBytes() {
        java.lang.Object ref = suffix_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          suffix_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * FakeLoaderSourceAdapter's 'suffix' ctor parameter.
       * </pre>
       *
       * <code>string suffix = 1;</code>
       */
      public Builder setSuffix(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        suffix_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * FakeLoaderSourceAdapter's 'suffix' ctor parameter.
       * </pre>
       *
       * <code>string suffix = 1;</code>
       */
      public Builder clearSuffix() {
        
        suffix_ = getDefaultInstance().getSuffix();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * FakeLoaderSourceAdapter's 'suffix' ctor parameter.
       * </pre>
       *
       * <code>string suffix = 1;</code>
       */
      public Builder setSuffixBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        suffix_ = value;
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


      // @@protoc_insertion_point(builder_scope:tensorflow.serving.test_util.FakeLoaderSourceAdapterConfig)
    }

    // @@protoc_insertion_point(class_scope:tensorflow.serving.test_util.FakeLoaderSourceAdapterConfig)
    private static final tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig();
    }

    public static tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FakeLoaderSourceAdapterConfig>
        PARSER = new com.google.protobuf.AbstractParser<FakeLoaderSourceAdapterConfig>() {
      @java.lang.Override
      public FakeLoaderSourceAdapterConfig parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FakeLoaderSourceAdapterConfig(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FakeLoaderSourceAdapterConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FakeLoaderSourceAdapterConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tensorflow.serving.test_util.FakeLoaderSourceAdapter.FakeLoaderSourceAdapterConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_serving_test_util_FakeLoaderSourceAdapterConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_serving_test_util_FakeLoaderSourceAdapterConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBtensorflow_serving/core/test_util/fake" +
      "_loader_source_adapter.proto\022\034tensorflow" +
      ".serving.test_util\"/\n\035FakeLoaderSourceAd" +
      "apterConfig\022\016\n\006suffix\030\001 \001(\tb\006proto3"
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
    internal_static_tensorflow_serving_test_util_FakeLoaderSourceAdapterConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_serving_test_util_FakeLoaderSourceAdapterConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_serving_test_util_FakeLoaderSourceAdapterConfig_descriptor,
        new java.lang.String[] { "Suffix", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
