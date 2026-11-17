package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C06H;
import java.security.interfaces.ECPublicKey;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class LinkMcFleetPublicKeyProvider implements LinkFleetPublicKeyProvider {
    public static final int $stable = 0;
    public final Function0<String> debugPublicKeysJson;
    public final Function0<String> publicKeysJson;

    /* renamed from: com.facebook.aura.devices.pairing.LinkMcFleetPublicKeyProvider$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return "";
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }

    @Override // com.facebook.aura.devices.pairing.LinkFleetPublicKeyProvider
    public ECPublicKey publicKeyForEpoch(int i) {
        return LinkEncryptedPairingKt.decodeLinkFleetPublicKeys((i == 9000 ? this.debugPublicKeysJson : this.publicKeysJson).invoke()).get(Integer.valueOf(i));
    }

    public LinkMcFleetPublicKeyProvider(Function0<String> function0, Function0<String> function02) {
        AnonymousClass003.A0u(function0, function02);
        this.publicKeysJson = function0;
        this.debugPublicKeysJson = function02;
    }

    public /* synthetic */ LinkMcFleetPublicKeyProvider(Function0 function0, Function0 function02, int i, C06H c06h) {
        this(function0, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function02);
    }
}
