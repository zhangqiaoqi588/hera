// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: x.proto

package com.dfire.protocol;

public final class RpcOperate {
  private RpcOperate() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Operate}
   */
  public enum Operate
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *心跳 worker-&gt;server
     * </pre>
     *
     * <code>HeartBeat = 0;</code>
     */
    HeartBeat(0),
    /**
     * <pre>
     *调度执行命令 server-&gt;worker
     * </pre>
     *
     * <code>Schedule = 1;</code>
     */
    Schedule(1),
    /**
     * <pre>
     *取消命令 server-&gt;worker
     * </pre>
     *
     * <code>Cancel = 2;</code>
     */
    Cancel(2),
    /**
     * <pre>
     *调试命令 server-&gt;worker
     * </pre>
     *
     * <code>Debug = 3;</code>
     */
    Debug(3),
    /**
     * <pre>
     *手动执行命令
     * </pre>
     *
     * <code>Manual = 4;</code>
     */
    Manual(4),
    /**
     * <pre>
     *获得机器信息
     * </pre>
     *
     * <code>GetWorkInfo = 5;</code>
     */
    GetWorkInfo(5),
    /**
     * <pre>
     *设置机器信息
     * </pre>
     *
     * <code>SetWorkInfo = 6;</code>
     */
    SetWorkInfo(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *心跳 worker-&gt;server
     * </pre>
     *
     * <code>HeartBeat = 0;</code>
     */
    public static final int HeartBeat_VALUE = 0;
    /**
     * <pre>
     *调度执行命令 server-&gt;worker
     * </pre>
     *
     * <code>Schedule = 1;</code>
     */
    public static final int Schedule_VALUE = 1;
    /**
     * <pre>
     *取消命令 server-&gt;worker
     * </pre>
     *
     * <code>Cancel = 2;</code>
     */
    public static final int Cancel_VALUE = 2;
    /**
     * <pre>
     *调试命令 server-&gt;worker
     * </pre>
     *
     * <code>Debug = 3;</code>
     */
    public static final int Debug_VALUE = 3;
    /**
     * <pre>
     *手动执行命令
     * </pre>
     *
     * <code>Manual = 4;</code>
     */
    public static final int Manual_VALUE = 4;
    /**
     * <pre>
     *获得机器信息
     * </pre>
     *
     * <code>GetWorkInfo = 5;</code>
     */
    public static final int GetWorkInfo_VALUE = 5;
    /**
     * <pre>
     *设置机器信息
     * </pre>
     *
     * <code>SetWorkInfo = 6;</code>
     */
    public static final int SetWorkInfo_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static Operate valueOf(int value) {
      return forNumber(value);
    }

    public static Operate forNumber(int value) {
      switch (value) {
        case 0: return HeartBeat;
        case 1: return Schedule;
        case 2: return Cancel;
        case 3: return Debug;
        case 4: return Manual;
        case 5: return GetWorkInfo;
        case 6: return SetWorkInfo;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operate>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operate> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operate>() {
            public Operate findValueByNumber(int number) {
              return Operate.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return RpcOperate.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operate[] VALUES = values();

    public static Operate valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Operate(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Operate)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\007x.proto*k\n\007Operate\022\r\n\tHeartBeat\020\000\022\014\n\010S" +
      "chedule\020\001\022\n\n\006Cancel\020\002\022\t\n\005Debug\020\003\022\n\n\006Manu" +
      "al\020\004\022\017\n\013GetWorkInfo\020\005\022\017\n\013SetWorkInfo\020\006B\"" +
      "\n\022com.dfire.protocolB\nRpcOperateH\001b\006prot" +
      "o3"
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
