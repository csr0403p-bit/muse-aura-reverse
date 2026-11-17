package com.facebook.aura.file.view;

import X.AGH;
import X.AKQ;
import X.AVy;
import X.AbstractC07127nr;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C10571Hud;
import X.C1515AkP;
import X.C3UX;
import X.C7438Evz;
import X.C78N;
import X.C7BY;
import X.C7OQ;
import X.C7OU;
import X.EnumC10460Hji;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.HpR;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.composer.upload.HatchAttachmentStaging;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class LibraryUploadMenuKt {
    public static final String UPLOAD_ERROR_FORBIDDEN = "forbidden";

    /* renamed from: com.facebook.aura.file.view.LibraryUploadMenuKt$LibraryUploadMenu$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $folderPath;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onUploadComplete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$folderPath = str;
            this.$onUploadComplete = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            LibraryUploadMenuKt.LibraryUploadMenu(this.$folderPath, this.$onUploadComplete, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.LibraryUploadMenuKt", f = "LibraryUploadMenu.kt", l = {69, 73}, m = "uploadLibraryUri", v = 2)
    /* renamed from: com.facebook.aura.file.view.LibraryUploadMenuKt$uploadLibraryUri$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LibraryUploadMenuKt.uploadLibraryUri(null, null, null, null, null, null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.LibraryUploadMenuKt$uploadLibraryUri$2", f = "LibraryUploadMenu.kt", l = {HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.LibraryUploadMenuKt$uploadLibraryUri$2, reason: invalid class name and case insensitive filesystem */
    public final class C119772 extends AbstractC07127nr implements G0W<Context, Uri, HtJ<? super File>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public C119772(HtJ<? super C119772> htJ) {
            super(3, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object c10571Hud;
            Context context = (Context) this.L$0;
            Uri uri = (Uri) this.L$1;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchAttachmentStaging hatchAttachmentStaging = HatchAttachmentStaging.INSTANCE;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    obj = hatchAttachmentStaging.stage(context, uri, LinkEncryptedPairingKt.LINK_COUNTER_MAX, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                c10571Hud = (File) obj;
            } catch (Throwable th) {
                c10571Hud = new C10571Hud(th);
            }
            if (c10571Hud instanceof C10571Hud) {
                return null;
            }
            return c10571Hud;
        }

        @Override // X.G0W
        public final Object invoke(Context context, Uri uri, HtJ<? super File> htJ) {
            C119772 c119772 = new C119772(htJ);
            c119772.L$0 = context;
            c119772.L$1 = uri;
            return c119772.invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.LibraryUploadMenuKt$uploadLibraryUri$3", f = "LibraryUploadMenu.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.LibraryUploadMenuKt$uploadLibraryUri$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G2j<String, File, AbstractC3358CGz, HtJ<? super HatchFileOperations.WriteResult>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public /* synthetic */ Object L$2;
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(4, htJ);
        }

        @Override // X.G2j
        public final Object invoke(String str, File file, AbstractC3358CGz abstractC3358CGz, HtJ<? super HatchFileOperations.WriteResult> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
            anonymousClass3.L$0 = str;
            anonymousClass3.L$1 = file;
            anonymousClass3.L$2 = abstractC3358CGz;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            File file = (File) this.L$1;
            AbstractC3358CGz abstractC3358CGz = (AbstractC3358CGz) this.L$2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                obj = hatchFileOperations.uploadFile(str, file, abstractC3358CGz, AGH.A0E(), this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }
    }

    /* renamed from: com.facebook.aura.file.view.LibraryUploadMenuKt$uploadLibraryUri$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 extends C7438Evz implements G0V<Context, Uri, String> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(2, LibraryUploadMenuKt.class, "resolveDisplayName", "resolveDisplayName(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;", 1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String invoke2(Context context, Uri uri) {
            AnonymousClass003.A0u(context, uri);
            return LibraryUploadMenuKt.resolveDisplayName(context, uri);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ String invoke(Context context, Uri uri) {
            Context context2 = context;
            Uri uri2 = uri;
            AnonymousClass003.A0u(context2, uri2);
            return LibraryUploadMenuKt.resolveDisplayName(context2, uri2);
        }
    }

    public static final void LibraryUploadMenu(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, function0);
        bfm.AgG(672701623);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121194);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121196);
            MutableState mutableState = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            boolean zA1P = AnonymousClass003.A1P(bfm, strA012, strA01, AnonymousClass002.A1V(bfm, abstractC3358CGzA0g, AnonymousClass003.A1B(iA0d), AnonymousClass003.A1M(bfm, c3ux, contextA0H)) | AnonymousClass002.A1Q(iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 32));
            Object objAaT2 = bfm.AaT();
            if (zA1P || objAaT2 == obj) {
                objAaT2 = new LibraryUploadMenuKt$LibraryUploadMenu$upload$1$1(c3ux, function0, strA012, strA01, contextA0H, str, abstractC3358CGzA0g);
                bfm.Ai0(objAaT2);
            }
            G0V g0v = (G0V) objAaT2;
            HpR hpR = new HpR();
            boolean zA65 = bfm.A65(g0v);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == obj) {
                objAaT3 = new LibraryUploadMenuKt$LibraryUploadMenu$documentLauncher$1$1(g0v);
                bfm.Ai0(objAaT3);
            }
            C7OU c7ouA00 = C7OQ.A00(hpR, bfm, (G0U) objAaT3);
            HpR hpR2 = new HpR();
            boolean zA652 = bfm.A65(g0v);
            Object objAaT4 = bfm.AaT();
            if (zA652 || objAaT4 == obj) {
                objAaT4 = new LibraryUploadMenuKt$LibraryUploadMenu$photoLauncher$1$1(g0v);
                bfm.Ai0(objAaT4);
            }
            C7OU c7ouA002 = C7OQ.A00(hpR2, bfm, (G0U) objAaT4);
            boolean zA1N = AnonymousClass003.A1N(bfm, c7ouA00, strA01);
            Object objAaT5 = bfm.AaT();
            if (zA1N || objAaT5 == obj) {
                objAaT5 = new LibraryUploadMenuKt$LibraryUploadMenu$openDocumentPicker$1$1(c7ouA00, strA01);
                bfm.Ai0(objAaT5);
            }
            Function0 function02 = (Function0) objAaT5;
            boolean zA1N2 = AnonymousClass003.A1N(bfm, c7ouA002, strA01);
            Object objAaT6 = bfm.AaT();
            if (zA1N2 || objAaT6 == obj) {
                objAaT6 = new LibraryUploadMenuKt$LibraryUploadMenu$openPhotoPicker$1$1(c7ouA002, strA01);
                bfm.Ai0(objAaT6);
            }
            Function0 function03 = (Function0) objAaT6;
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121195);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121197);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.two_lines_vertical_rectangle_missing_corner_outline_24, 0);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.image_wght400_outline_24, 0);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0D);
            AVy aVyA003 = BOf.A00(bfm, R.drawable.ellipsis_wght400_outline_24, 0);
            String strA015 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121198);
            Object objAaT7 = bfm.AaT();
            if (objAaT7 == obj) {
                objAaT7 = new LibraryUploadMenuKt$LibraryUploadMenu$1$1$1(mutableState);
                bfm.Ai0(objAaT7);
            }
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA003, strA015, (Function0) objAaT7, null, false, 0.0f, null, null, null, false, false, bfm, AVy.$stable | 384, 0, 2040);
            boolean zA0A = MutableState.A0A(mutableState);
            long jA0N = AnonymousClass003.A0N(Float.floatToRawIntBits(0.0f));
            boolean zA1K = AnonymousClass003.A1K(bfm, function02, function03);
            Object objAaT8 = bfm.AaT();
            if (zA1K || objAaT8 == obj) {
                objAaT8 = new LibraryUploadMenuKt$LibraryUploadMenu$1$2$1(function02, function03, mutableState);
                bfm.Ai0(objAaT8);
            }
            G0U g0u = (G0U) objAaT8;
            Object objAaT9 = bfm.AaT();
            if (objAaT9 == obj) {
                objAaT9 = new LibraryUploadMenuKt$LibraryUploadMenu$1$3$1(mutableState);
                bfm.Ai0(objAaT9);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u, (Function0) objAaT9, zA0A, null, jA0N, null, false, new LibraryUploadMenuKt$LibraryUploadMenu$1$4(strA013, aVyA00, strA014, aVyA002), false, null, null, null, false, bfm, 196992, 0, 16081);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, function0, bRg2, i, i2);
        }
    }

    public static final String resolveDisplayName(Context context, Uri uri) {
        Object c10571Hud;
        int columnIndex;
        if ("file".equals(uri.getScheme())) {
            return lastPathComponent(uri);
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    c10571Hud = (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) < 0) ? null : cursorQuery.getString(columnIndex);
                    cursorQuery.close();
                } finally {
                }
            } else {
                c10571Hud = null;
            }
        } catch (Throwable th) {
            c10571Hud = new C10571Hud(th);
        }
        return (String) (c10571Hud instanceof C10571Hud ? null : c10571Hud);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object uploadLibraryUri(android.content.Context r6, android.net.Uri r7, java.lang.String r8, java.lang.String r9, X.AbstractC3358CGz r10, X.G0W<? super android.content.Context, ? super android.net.Uri, ? super X.HtJ<? super java.io.File>, ? extends java.lang.Object> r11, X.G2j<? super java.lang.String, ? super java.io.File, ? super X.AbstractC3358CGz, ? super X.HtJ<? super com.facebook.aura.gateway.HatchFileOperations.WriteResult>, ? extends java.lang.Object> r12, X.G0V<? super android.content.Context, ? super android.net.Uri, java.lang.String> r13, X.HtJ<? super com.facebook.aura.gateway.HatchFileOperations.WriteResult> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.LibraryUploadMenuKt.uploadLibraryUri(android.content.Context, android.net.Uri, java.lang.String, java.lang.String, X.CGz, X.G0W, X.G2j, X.G0V, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object uploadLibraryUri$default(Context context, Uri uri, String str, String str2, AbstractC3358CGz abstractC3358CGz, G0W g0w, G2j g2j, G0V g0v, HtJ htJ, int i, Object obj) {
        if ((i & 32) != 0) {
            g0w = new C119772(null);
        }
        if ((i & 64) != 0) {
            g2j = new AnonymousClass3(null);
        }
        if ((i & 128) != 0) {
            g0v = AnonymousClass4.INSTANCE;
        }
        return uploadLibraryUri(context, uri, str, str2, abstractC3358CGz, g0w, g2j, g0v, htJ);
    }

    public static final String defaultFileName() {
        return FGI.A0B(System.currentTimeMillis(), "upload_");
    }

    public static final String lastPathComponent(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            return C7BY.A0R(lastPathSegment, lastPathSegment, '/');
        }
        return null;
    }
}
