package com.facebook.aura.spaces.preload;

import X.AbstractC07127nr;
import X.C10543Hqv;
import X.C3UX;
import X.G0V;
import X.HtJ;
import android.net.Uri;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1$completed$1$uri$1", f = "SpacesShareBridge.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SpacesShareBridge$share$posted$1$1$completed$1$uri$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Uri>, Object> {
    public final /* synthetic */ byte[] $bytes;
    public final /* synthetic */ SpacesShareFileJson $share;
    public final /* synthetic */ C10543Hqv<File> $stagedFile;
    public int label;
    public final /* synthetic */ SpacesShareBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesShareBridge$share$posted$1$1$completed$1$uri$1(SpacesShareFileJson spacesShareFileJson, SpacesShareBridge spacesShareBridge, byte[] bArr, C10543Hqv<File> c10543Hqv, HtJ<? super SpacesShareBridge$share$posted$1$1$completed$1$uri$1> htJ) {
        super(2, htJ);
        this.$share = spacesShareFileJson;
        this.this$0 = spacesShareBridge;
        this.$bytes = bArr;
        this.$stagedFile = c10543Hqv;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SpacesShareBridge$share$posted$1$1$completed$1$uri$1(this.$share, this.this$0, this.$bytes, this.$stagedFile, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.io.File] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto Laa
            X.Hwg.A00(r7)
            com.facebook.aura.spaces.preload.SpacesShareFileJson r0 = r6.$share
            java.lang.String r0 = r0.name
            java.lang.String r1 = X.C7BY.A0M(r0)
            r0 = 92
            java.lang.String r1 = X.C7BY.A0R(r1, r1, r0)
            r0 = 46
            java.lang.String r5 = X.C7BY.A0S(r1, r1, r0)
            java.lang.StringBuilder r4 = X.C60O.A0w()
            int r3 = r5.length()
            r2 = 0
        L24:
            if (r2 >= r3) goto L51
            char r1 = r5.charAt(r2)
            r0 = 97
            if (r0 > r1) goto L38
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 >= r0) goto L35
        L32:
            r4.append(r1)
        L35:
            int r2 = r2 + 1
            goto L24
        L38:
            r0 = 65
            if (r0 > r1) goto L45
            r0 = 91
        L3e:
            if (r1 < r0) goto L32
            r0 = 95
            if (r1 != r0) goto L35
            goto L32
        L45:
            r0 = 48
            if (r0 > r1) goto L4c
            r0 = 58
            goto L3e
        L4c:
            r0 = 45
            if (r1 == r0) goto L32
            goto L35
        L51:
            java.lang.String r1 = r4.toString()
            r0 = 64
            java.lang.String r5 = X.BQG.A17(r1, r0)
            int r0 = r5.length()
            if (r0 != 0) goto L63
            java.lang.String r5 = "share"
        L63:
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            com.facebook.aura.spaces.preload.SpacesShareFileJson r0 = r6.$share
            java.lang.String r0 = r0.type
            java.lang.String r4 = r1.getExtensionFromMimeType(r0)
            if (r4 != 0) goto L73
            java.lang.String r4 = "bin"
        L73:
            com.facebook.aura.spaces.preload.SpacesShareBridge r0 = r6.this$0
            X.G0V<java.lang.String, byte[], java.io.File> r3 = r0.stageFile
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.StringBuilder r1 = X.C3cG.A0g(r5)
            java.lang.String r0 = "_"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "."
            java.lang.String r1 = X.C60P.A1M(r0, r4, r1)
            byte[] r0 = r6.$bytes
            X.C7384Etj.A0X(r0)
            java.lang.Object r2 = r3.invoke(r1, r0)
            java.io.File r2 = (java.io.File) r2
            X.Hqv<java.io.File> r0 = r6.$stagedFile
            r0.element = r2
            com.facebook.aura.model.HatchFileProviderUtil r1 = com.facebook.aura.model.HatchFileProviderUtil.INSTANCE
            com.facebook.aura.spaces.preload.SpacesShareBridge r0 = r6.this$0
            android.content.Context r0 = r0.appContext
            X.C7384Etj.A0U(r0)
            android.net.Uri r0 = r1.getUriForFile(r0, r2)
            return r0
        Laa:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1$completed$1$uri$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Uri> htJ) {
        return ((SpacesShareBridge$share$posted$1$1$completed$1$uri$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
