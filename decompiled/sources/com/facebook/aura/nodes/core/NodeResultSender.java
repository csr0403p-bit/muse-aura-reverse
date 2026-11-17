package com.facebook.aura.nodes.core;

import X.HtJ;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public interface NodeResultSender {
    Object sendInvokeResult(String str, String str2, JsonObject jsonObject, HtJ<? super Boolean> htJ);
}
