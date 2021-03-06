/*
 *  Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.alibaba.fescar.core.rpc;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import io.netty.channel.Channel;

/**
 * @Author: jimin.jm@alibaba-inc.com
 * @Project: fescar-all
 * @DateTime: 2018/10/15 16:56
 * @FileName: ServerMessageSender
 * @Description:
 */
public interface ServerMessageSender {

    /**
     * @param msgId
     * @param channel
     * @param msg
     */
    void sendResponse(long msgId, Channel channel, Object msg);

    /**
     * Sync call to RM with timeout.
     *
     * @param resourceId Resource ID
     * @param clientId Client ID
     * @param message Request message
     * @param timeout timeout of the call
     * @return Response message
     * @throws IOException .
     */
    Object sendSyncRequest(String resourceId, String clientId, Object message, long timeout) throws IOException, TimeoutException;

    /**
     * Sync call to RM
     *
     *
     * @param resourceId Resource ID
     * @param clientId Client ID
     * @param message Request message
     * @return Response message
     * @throws IOException .
     */
    Object sendSyncRequest(String resourceId, String clientId, Object message) throws IOException, TimeoutException;
}
