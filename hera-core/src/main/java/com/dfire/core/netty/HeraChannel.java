package com.dfire.core.netty;

import com.dfire.core.exception.RemotingException;
import com.dfire.protocol.RpcSocketMessage;

import java.net.SocketAddress;

/**
 * @author xiaosuda
 * @date 2018/11/16
 */
public interface HeraChannel {


    void writeAndFlush(RpcSocketMessage.SocketMessage msg) throws RemotingException;

    SocketAddress getRemoteAddress();

    SocketAddress getLocalAddress();

    void close();
}
