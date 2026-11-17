package com.facebook.aura.network.tigon;

import X.AbstractC7559F3s;
import X.BV4;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraTigonBody$Companion$bytes$1 extends AbstractC7559F3s implements Function0<InputStream> {
    public final /* synthetic */ byte[] $bytes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraTigonBody$Companion$bytes$1(byte[] bArr) {
        super(0);
        this.$bytes = bArr;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InputStream invoke() {
        return BV4.A0E(this.$bytes);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ InputStream invoke() {
        return BV4.A0E(this.$bytes);
    }
}
