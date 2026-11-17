package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeHitlSpec;

/* loaded from: classes3.dex */
public final class LocalDeviceConnectorActionDefinition {
    public final G0U<Context, Boolean> isVisible;
    public final String key;
    public final int labelRes;
    public final NodeHitlSpec spec;

    public final LocalDeviceConnectorAction toAction(Context context) {
        C7384Etj.A0Y(context, 0);
        return new LocalDeviceConnectorAction(this.key, context.getString(this.labelRes), this.spec);
    }

    /* renamed from: com.facebook.aura.agentpermission.LocalDeviceConnectorActionDefinition$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Context, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Context context) {
            return AnonymousClass001.A0i();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Context context) {
            return AnonymousClass001.A0i();
        }
    }

    public /* synthetic */ LocalDeviceConnectorActionDefinition(String str, int i, NodeHitlSpec nodeHitlSpec, G0U g0u, int i2, C06H c06h) {
        this(str, i, nodeHitlSpec, (i2 & 8) != 0 ? AnonymousClass1.INSTANCE : g0u);
    }

    public final String getKey() {
        return this.key;
    }

    public final int getLabelRes() {
        return this.labelRes;
    }

    public final NodeHitlSpec getSpec() {
        return this.spec;
    }

    public final G0U<Context, Boolean> isVisible() {
        return this.isVisible;
    }

    public final LocalDeviceConnectorActionMetadata toMetadata() {
        return new LocalDeviceConnectorActionMetadata(this.key, this.labelRes, this.spec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalDeviceConnectorActionDefinition(String str, int i, NodeHitlSpec nodeHitlSpec, G0U<? super Context, Boolean> g0u) {
        AnonymousClass005.A11(str, nodeHitlSpec, g0u, 0);
        this.key = str;
        this.labelRes = i;
        this.spec = nodeHitlSpec;
        this.isVisible = g0u;
    }
}
