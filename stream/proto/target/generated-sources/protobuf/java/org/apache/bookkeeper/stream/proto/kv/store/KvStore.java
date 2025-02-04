// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv_store.proto

package org.apache.bookkeeper.stream.proto.kv.store;

public final class KvStore {
  private KvStore() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_store_KeyMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_store_KeyMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_store_NopRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_store_NopRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_store_Command_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_store_Command_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_store_FileInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_store_FileInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_store_CheckpointMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_store_CheckpointMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016kv_store.proto\022\031bookkeeper.proto.kv.st" +
      "ore\032\014kv_rpc.proto\"\227\001\n\007KeyMeta\022\027\n\017create_" +
      "revision\030\001 \001(\003\022\024\n\014mod_revision\030\002 \001(\003\022\017\n\007" +
      "version\030\003 \001(\003\0228\n\nvalue_type\030\004 \001(\0162$.book" +
      "keeper.proto.kv.store.ValueType\022\022\n\nexpir" +
      "eTime\030\005 \001(\003\"\014\n\nNopRequest\"\274\002\n\007Command\0228\n" +
      "\007nop_req\030\001 \001(\0132%.bookkeeper.proto.kv.sto" +
      "re.NopRequestH\000\0226\n\007put_req\030\002 \001(\0132#.bookk" +
      "eeper.proto.kv.rpc.PutRequestH\000\022A\n\ndelet" +
      "e_req\030\003 \001(\0132+.bookkeeper.proto.kv.rpc.De" +
      "leteRangeRequestH\000\0226\n\007txn_req\030\004 \001(\0132#.bo" +
      "okkeeper.proto.kv.rpc.TxnRequestH\000\022=\n\010in" +
      "cr_req\030\005 \001(\0132).bookkeeper.proto.kv.rpc.I" +
      "ncrementRequestH\000B\005\n\003req\"*\n\010FileInfo\022\014\n\004" +
      "name\030\001 \001(\t\022\020\n\010checksum\030\002 \001(\t\"}\n\022Checkpoi" +
      "ntMetadata\022\r\n\005files\030\001 \003(\t\022\014\n\004txid\030\002 \001(\014\022" +
      "\022\n\ncreated_at\030\003 \001(\004\0226\n\tfileInfos\030\004 \003(\0132#" +
      ".bookkeeper.proto.kv.store.FileInfo*\"\n\tV" +
      "alueType\022\t\n\005BYTES\020\000\022\n\n\006NUMBER\020\001B/\n+org.a" +
      "pache.bookkeeper.stream.proto.kv.storeP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.getDescriptor(),
        });
    internal_static_bookkeeper_proto_kv_store_KeyMeta_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bookkeeper_proto_kv_store_KeyMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_store_KeyMeta_descriptor,
        new java.lang.String[] { "CreateRevision", "ModRevision", "Version", "ValueType", "ExpireTime", });
    internal_static_bookkeeper_proto_kv_store_NopRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bookkeeper_proto_kv_store_NopRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_store_NopRequest_descriptor,
        new java.lang.String[] { });
    internal_static_bookkeeper_proto_kv_store_Command_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bookkeeper_proto_kv_store_Command_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_store_Command_descriptor,
        new java.lang.String[] { "NopReq", "PutReq", "DeleteReq", "TxnReq", "IncrReq", "Req", });
    internal_static_bookkeeper_proto_kv_store_FileInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bookkeeper_proto_kv_store_FileInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_store_FileInfo_descriptor,
        new java.lang.String[] { "Name", "Checksum", });
    internal_static_bookkeeper_proto_kv_store_CheckpointMetadata_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bookkeeper_proto_kv_store_CheckpointMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_store_CheckpointMetadata_descriptor,
        new java.lang.String[] { "Files", "Txid", "CreatedAt", "FileInfos", });
    org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
