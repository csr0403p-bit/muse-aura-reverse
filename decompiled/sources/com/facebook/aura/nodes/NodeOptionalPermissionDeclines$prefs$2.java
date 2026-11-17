package com.facebook.aura.nodes;

import X.AbstractC7559F3s;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NodeOptionalPermissionDeclines$prefs$2 extends AbstractC7559F3s implements Function0<SharedPreferences> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeOptionalPermissionDeclines$prefs$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        return this.$context.getSharedPreferences(NodeOptionalPermissionDeclines.PREFS_NAME, 0);
    }
}
