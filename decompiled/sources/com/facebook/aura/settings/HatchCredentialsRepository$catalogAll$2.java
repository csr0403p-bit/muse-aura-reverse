package com.facebook.aura.settings;

import X.AHD;
import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsRepository$catalogAll$2", f = "HatchCredentialsRepository.kt", l = {415}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchCredentialsRepository$catalogAll$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends AHD<? extends CredentialCandidate>>>, Object> {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public final /* synthetic */ HatchCredentialsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCredentialsRepository$catalogAll$2(HatchCredentialsRepository hatchCredentialsRepository, HtJ<? super HatchCredentialsRepository$catalogAll$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchCredentialsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCredentialsRepository$catalogAll$2(this.this$0, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends AHD<? extends CredentialCandidate>>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<? extends AHD<CredentialCandidate>>>) htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00cf -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            r5 = r22
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L4c
            if (r0 != r3) goto Ldb
            java.lang.Object r2 = r5.L$1
            X.Hqv r2 = (X.C10543Hqv) r2
            java.lang.Object r1 = r5.L$0
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r8 = X.AnonymousClass002.A0j(r23)
        L17:
            java.lang.Throwable r0 = X.HsJ.A00(r8)
            if (r0 != 0) goto Ld2
            com.facebook.aura.settings.CredentialCatalogResponseJson r8 = (com.facebook.aura.settings.CredentialCatalogResponseJson) r8
            java.util.List<com.facebook.aura.settings.CredentialCatalogItemJson> r0 = r8.items
            java.util.ArrayList r7 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r6 = r0.iterator()
        L29:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r6.next()
            com.facebook.aura.settings.CredentialCatalogItemJson r0 = (com.facebook.aura.settings.CredentialCatalogItemJson) r0
            com.facebook.aura.settings.CredentialCandidate r0 = com.facebook.aura.settings.HatchCredentialsRepositoryKt.toDomain(r0)
            r7.add(r0)
            goto L29
        L3d:
            r1.addAll(r7)
            java.lang.String r0 = r8.next_cursor
            r2.element = r0
            if (r0 != 0) goto L57
            X.AHD r0 = X.AGI.A07(r1)
            goto Ld6
        L4c:
            X.Hwg.A00(r23)
            java.util.ArrayList r1 = X.C3cG.A0h()
            X.Hqv r2 = X.C3cG.A0z()
        L57:
            X.AII r8 = X.AIM.A17()
            java.lang.String r6 = "credential_type"
            java.lang.String r0 = "browser"
            X.AnonymousClass002.A1J(r6, r0, r8)
            java.lang.String r6 = "limit"
            r7 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r0 = X.C3cG.A0R(r7)
            X.AnonymousClass002.A1J(r6, r0, r8)
            T r6 = r2.element
            if (r6 == 0) goto L76
            java.lang.String r0 = "cursor"
            X.AnonymousClass002.A1J(r0, r6, r8)
        L76:
            X.AII r6 = X.AIM.A18(r8)
            r10 = 0
            X.HxE[] r0 = new X.HxE[r10]
            java.lang.Object[] r6 = r6.toArray(r0)
            X.HxE[] r6 = (X.HxE[]) r6
            com.facebook.aura.network.http.HatchHttpApi r8 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$CredentialsCatalog r11 = com.facebook.aura.network.api.JarvisPath.CredentialsCatalog.INSTANCE
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.GET
            com.facebook.aura.settings.HatchCredentialsRepository r0 = r5.this$0
            X.CGz r13 = r0.userSession
            int r0 = r6.length
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r6, r0)
            X.HxE[] r15 = (X.HxE[]) r15
            java.lang.Integer r0 = X.C3cG.A0R(r7)
            java.util.Set r17 = java.util.Collections.singleton(r0)
            X.9jH r19 = X.AGH.A0E()
            com.facebook.aura.settings.HatchCredentialsRepository$catalogAll$2$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1 r9 = com.facebook.aura.settings.HatchCredentialsRepository$catalogAll$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r5.L$0 = r1
            r5.L$1 = r2
            r14 = 0
            r5.L$2 = r14
            r5.L$3 = r14
            r5.L$4 = r14
            r5.L$5 = r14
            r5.L$6 = r14
            r5.L$7 = r14
            r5.L$8 = r14
            r5.L$9 = r14
            r5.I$0 = r10
            r5.I$1 = r3
            r5.I$2 = r10
            r5.label = r3
            r16 = r14
            r18 = r10
            r20 = r3
            r21 = r14
            r22 = r10
            r23 = r5
            java.lang.Object r8 = r8.m1595executeBodylessJarvisRequestWithp3iPjrY(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r8 != r4) goto L17
            return r4
        Ld2:
            X.Hud r0 = X.C3cG.A0s(r0)
        Ld6:
            X.HsJ r4 = X.C3cG.A0t(r0)
            return r4
        Ldb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchCredentialsRepository$catalogAll$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<? extends AHD<CredentialCandidate>>> htJ) {
        return new HatchCredentialsRepository$catalogAll$2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
