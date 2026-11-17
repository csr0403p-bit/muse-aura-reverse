package com.facebook.aura.commands.sms.intf;

import X.HtJ;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeArgSpec;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public interface MessageSendContributor {
    String getDescriptionNote();

    Map<String, NodeArgSpec> getOptionalArgs();

    String getResultDescriptionNote();

    Object trySendToEach(Context context, JsonObject jsonObject, List<String> list, String str, boolean z, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ);

    String validateParams(String str);
}
