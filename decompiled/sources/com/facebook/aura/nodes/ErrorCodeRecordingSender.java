package com.facebook.aura.nodes;

import X.C7384Etj;
import X.HtJ;
import com.facebook.aura.nodes.core.NodeResultSender;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class ErrorCodeRecordingSender implements NodeResultSender {
    public final NodeResultSender delegate;
    public volatile String errorCode;

    public ErrorCodeRecordingSender(NodeResultSender nodeResultSender) {
        C7384Etj.A0Y(nodeResultSender, 0);
        this.delegate = nodeResultSender;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    @Override // com.facebook.aura.nodes.core.NodeResultSender
    public Object sendInvokeResult(String str, String str2, JsonObject jsonObject, HtJ<? super Boolean> htJ) {
        String strHandlerErrorCode = ErrorCodeRecordingSenderKt.handlerErrorCode(jsonObject);
        if (strHandlerErrorCode != null) {
            this.errorCode = strHandlerErrorCode;
        }
        return this.delegate.sendInvokeResult(str, str2, jsonObject, htJ);
    }
}
