package com.facebook.aura.commands.core;

import X.HtJ;
import X.HzP;
import com.facebook.aura.commands.core.NodePermissionActivity;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.commands.core.NodePermissionActivity$Companion", f = "NodePermissionActivity.kt", l = {669, 504}, m = "requestPermissions", v = 2)
/* loaded from: classes3.dex */
public final class NodePermissionActivity$Companion$requestPermissions$1 extends HzP {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NodePermissionActivity.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodePermissionActivity$Companion$requestPermissions$1(NodePermissionActivity.Companion companion, HtJ<? super NodePermissionActivity$Companion$requestPermissions$1> htJ) {
        super(htJ);
        this.this$0 = companion;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.requestPermissions(null, null, null, null, false, false, this);
    }
}
