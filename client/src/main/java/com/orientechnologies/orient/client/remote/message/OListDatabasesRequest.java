package com.orientechnologies.orient.client.remote.message;

import java.io.IOException;

import com.orientechnologies.orient.client.binary.OChannelBinaryAsynchClient;
import com.orientechnologies.orient.client.remote.OBinaryRequest;
import com.orientechnologies.orient.client.remote.OStorageRemoteSession;
import com.orientechnologies.orient.enterprise.channel.binary.OChannelBinary;
import com.orientechnologies.orient.enterprise.channel.binary.OChannelBinaryProtocol;

public class OListDatabasesRequest implements OBinaryRequest<OListDatabasesReponse> {
  @Override
  public void write(OChannelBinaryAsynchClient network, OStorageRemoteSession session) throws IOException {
  }

  @Override
  public void read(OChannelBinary channel, int protocolVersion, String serializerName) throws IOException {
  }

  @Override
  public byte getCommand() {
    return OChannelBinaryProtocol.REQUEST_DB_LIST;
  }

  @Override
  public OListDatabasesReponse createResponse() {
    return new OListDatabasesReponse();
  }

}