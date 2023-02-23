package com.zx.sms.codec.smpp.msg;

/*
 * #%L
 * ch-smpp
 * %%
 * Copyright (C) 2009 - 2015 Cloudhopper by Twitter
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import io.netty.buffer.ByteBuf;

import com.zx.sms.codec.smpp.RecoverablePduException;
import com.zx.sms.codec.smpp.SmppConstants;
import com.zx.sms.codec.smpp.UnrecoverablePduException;
import com.zx.sms.connect.manager.smpp.SMPPEndpointEntity;

public class ReplaceSmResp extends PduResponse {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8769525307033653040L;

	public ReplaceSmResp() {
        super(SmppConstants.CMD_ID_REPLACE_SM_RESP, "replace_sm_resp");
    }
    
    @Override
    public void readBody(ByteBuf buffer,SMPPEndpointEntity entity) throws UnrecoverablePduException, RecoverablePduException {
        // nothing
    }

    @Override
    public int calculateByteSizeOfBody() {
        return 0;
    }

    @Override
    public void writeBody(ByteBuf buffer,SMPPEndpointEntity entity) throws UnrecoverablePduException, RecoverablePduException {
        // do nothing
    }

    @Override
    public void appendBodyToString(StringBuilder buffer) {
    }

}