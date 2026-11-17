package com.facebook.aura.spaces.preload;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C10543Hqv;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C6t6;
import X.C7384Etj;
import X.F1F;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import android.util.Base64;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1$completed$1", f = "SpacesShareBridge.kt", l = {MessageDraftSenderKt.UNICODE_MULTIPART_CHARS, ImageCompressor.IMAGE_COMPRESSION_QUALITY}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SpacesShareBridge$share$posted$1$1$completed$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ F1F $handedOff;
    public final /* synthetic */ C10543Hqv<String> $operation;
    public final /* synthetic */ String $payload;
    public final /* synthetic */ String $sourceUrl;
    public final /* synthetic */ C10543Hqv<File> $stagedFile;
    public final /* synthetic */ String $token;
    public final /* synthetic */ C6t6 $webView;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ SpacesShareBridge this$0;

    @DebugMetadata(c = "com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1$completed$1$1", f = "SpacesShareBridge.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1$completed$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HxE<? extends SpacesShareFileJson, ? extends byte[]>>, Object> {
        public final /* synthetic */ C10543Hqv<String> $operation;
        public final /* synthetic */ String $payload;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, C10543Hqv<String> c10543Hqv, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$payload = str;
            this.$operation = c10543Hqv;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$payload, this.$operation, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            SpacesShareFileJson spacesShareFileJson = (SpacesShareFileJson) HatchJsonKt.HatchJson.A00(this.$payload, SpacesShareFileJson$$serializer.INSTANCE);
            this.$operation.element = "validate";
            if (!AnonymousClass005.A1a(spacesShareFileJson.type, "image/") && !AnonymousClass005.A1a(spacesShareFileJson.type, "video/")) {
                throw C60O.A0i("Failed requirement.");
            }
            String str = spacesShareFileJson.type;
            if (str.length() > 128) {
                throw C60O.A0i("Failed requirement.");
            }
            String strA0U = FGI.A0U(HatchWebPageParserKt.DATA_URI_PREFIX, str, ";base64,");
            if (!AnonymousClass005.A1a(spacesShareFileJson.data, strA0U)) {
                throw C60O.A0i("Failed requirement.");
            }
            String strSubstring = spacesShareFileJson.data.substring(strA0U.length());
            if (strSubstring.length() > 34952536) {
                throw C60O.A0i("Failed requirement.");
            }
            this.$operation.element = "decode";
            byte[] bArrDecode = Base64.decode(strSubstring, 2);
            this.$operation.element = "validate";
            C7384Etj.A0X(bArrDecode);
            int length = bArrDecode.length;
            if (length == 0 || length > 26214400) {
                throw C60O.A0i("Failed requirement.");
            }
            return C3cG.A0r(spacesShareFileJson, bArrDecode);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super HxE<SpacesShareFileJson, byte[]>> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HxE<? extends SpacesShareFileJson, ? extends byte[]>> htJ) {
            return invoke2(c3ux, (HtJ<? super HxE<SpacesShareFileJson, byte[]>>) htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesShareBridge$share$posted$1$1$completed$1(C10543Hqv<String> c10543Hqv, SpacesShareBridge spacesShareBridge, String str, C6t6 c6t6, String str2, C10543Hqv<File> c10543Hqv2, F1F f1f, String str3, HtJ<? super SpacesShareBridge$share$posted$1$1$completed$1> htJ) {
        super(2, htJ);
        this.$operation = c10543Hqv;
        this.this$0 = spacesShareBridge;
        this.$sourceUrl = str;
        this.$webView = c6t6;
        this.$token = str2;
        this.$stagedFile = c10543Hqv2;
        this.$handedOff = f1f;
        this.$payload = str3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SpacesShareBridge$share$posted$1$1$completed$1(this.$operation, this.this$0, this.$sourceUrl, this.$webView, this.$token, this.$stagedFile, this.$handedOff, this.$payload, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L66
            if (r0 == r2) goto L80
            if (r0 != r3) goto Lb5
            java.lang.Object r6 = r11.L$0
            com.facebook.aura.spaces.preload.SpacesShareFileJson r6 = (com.facebook.aura.spaces.preload.SpacesShareFileJson) r6
            X.Hwg.A00(r12)
        L13:
            com.facebook.aura.spaces.preload.SpacesShareBridge r0 = r11.this$0
            X.G2j<? super android.net.Uri, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r5 = r0.onShare
            java.lang.String r1 = r11.$sourceUrl
            X.6t6 r0 = r11.$webView
            java.lang.String r0 = r0.getUrl()
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L63
            com.facebook.aura.spaces.preload.SpacesShareBridge r3 = r11.this$0
            X.6t6 r1 = r11.$webView
            java.lang.String r0 = r11.$token
            boolean r0 = com.facebook.aura.spaces.preload.SpacesShareBridge.access$isAvailable(r3, r1, r0)
            if (r0 == 0) goto L63
            if (r5 == 0) goto L63
            X.Hqv<java.lang.String> r1 = r11.$operation
            java.lang.String r0 = "handoff"
            r1.element = r0
            X.Hqv<java.io.File> r0 = r11.$stagedFile
            T r0 = r0.element
            if (r0 == 0) goto Lae
            java.io.File r0 = (java.io.File) r0
            java.lang.String r4 = r0.getName()
            java.lang.String r3 = r6.type
            X.C7384Etj.A0X(r4)
            java.lang.String r1 = r6.title
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String r1 = X.BQG.A17(r1, r0)
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 == 0) goto L59
            r1 = r4
        L59:
            X.C7384Etj.A0W(r1)
            r5.invoke(r12, r3, r4, r1)
            X.F1F r0 = r11.$handedOff
            r0.element = r2
        L63:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L66:
            X.Hwg.A00(r12)
            X.78T r7 = X.C3cG.A0v()
            java.lang.String r6 = r11.$payload
            X.Hqv<java.lang.String> r5 = r11.$operation
            r1 = 0
            com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1$completed$1$1 r0 = new com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1$completed$1$1
            r0.<init>(r6, r5, r1)
            r11.label = r2
            java.lang.Object r12 = X.GAo.A00(r11, r7, r0)
            if (r12 != r4) goto L83
            return r4
        L80:
            X.Hwg.A00(r12)
        L83:
            X.HxE r12 = (X.HxE) r12
            A r6 = r12.first
            com.facebook.aura.spaces.preload.SpacesShareFileJson r6 = (com.facebook.aura.spaces.preload.SpacesShareFileJson) r6
            B r8 = r12.second
            byte[] r8 = (byte[]) r8
            X.Hqv<java.lang.String> r1 = r11.$operation
            java.lang.String r0 = "write"
            r1.element = r0
            X.78T r0 = X.AnonymousClass001.A0y()
            com.facebook.aura.spaces.preload.SpacesShareBridge r7 = r11.this$0
            X.Hqv<java.io.File> r9 = r11.$stagedFile
            r10 = 0
            com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1$completed$1$uri$1 r5 = new com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1$completed$1$uri$1
            r5.<init>(r6, r7, r8, r9, r10)
            r11.L$0 = r6
            r11.L$1 = r10
            r11.label = r3
            java.lang.Object r12 = X.GAo.A00(r11, r0, r5)
            if (r12 != r4) goto L13
            return r4
        Lae:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        Lb5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1$completed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SpacesShareBridge$share$posted$1$1$completed$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
