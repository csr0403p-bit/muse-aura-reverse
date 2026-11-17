package com.facebook.aura.settings.support;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFI;
import X.C60O;
import X.Ey9;
import X.F3w;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.commands.photos.MediaDeviceSyncClientKt;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.sharesheet.HatchShareSheetRepository;
import com.facebook.aura.sharesheet.HatchShareSheetViewModelKt;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HelpTicketAttachmentFiles {
    public static final int $stable = 0;
    public static final long MAX_BYTES = 10485760;
    public static final int MAX_COUNT = 5;
    public static final int MAX_MEGABYTES = 10;
    public static final HelpTicketAttachmentFiles INSTANCE = new HelpTicketAttachmentFiles();
    public static final String[] MIME_TYPES = {MediaDeviceSyncClientKt.FALLBACK_MIME, HatchShareSheetViewModelKt.AVATAR_STORY_STICKER_MIME_TYPE, "image/gif", "image/webp", "image/heic", "application/pdf", HatchShareSheetRepository.MUTED_VIDEO_MIME, "video/quicktime"};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class Admission {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Admission[] $VALUES;
        public static final Admission ACCEPTED;
        public static final Admission TOO_LARGE;
        public static final Admission UNSUPPORTED_TYPE;

        static {
            Admission admission = new Admission("ACCEPTED", 0);
            ACCEPTED = admission;
            Admission admission2 = new Admission("UNSUPPORTED_TYPE", 1);
            UNSUPPORTED_TYPE = admission2;
            Admission admission3 = new Admission("TOO_LARGE", 2);
            TOO_LARGE = admission3;
            Admission[] admissionArr = {admission, admission2, admission3};
            $VALUES = admissionArr;
            $ENTRIES = new F3w(admissionArr);
        }

        public static Ey9<Admission> getEntries() {
            return $ENTRIES;
        }

        public static Admission valueOf(String str) {
            return (Admission) Enum.valueOf(Admission.class, str);
        }

        public static Admission[] values() {
            return (Admission[]) $VALUES.clone();
        }

        public Admission(String str, int i) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.support.HelpTicketAttachmentFiles", f = "HelpTicketAttachmentFiles.kt", l = {56}, m = AgeCheckFunnelLogging.KEY_STAGE, v = 2)
    /* renamed from: com.facebook.aura.settings.support.HelpTicketAttachmentFiles$stage$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
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

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HelpTicketAttachmentFiles.this.stage(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.support.HelpTicketAttachmentFiles", f = "HelpTicketAttachmentFiles.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "stageOne", v = 2)
    /* renamed from: com.facebook.aura.settings.support.HelpTicketAttachmentFiles$stageOne$1, reason: invalid class name and case insensitive filesystem */
    public final class C136441 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C136441(HtJ<? super C136441> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HelpTicketAttachmentFiles.this.stageOne(null, null, this);
        }
    }

    private final String mimeTypeOf(Context context, Uri uri) {
        try {
            String type = context.getContentResolver().getType(uri);
            if (type != null) {
                String strA0u = AnonymousClass001.A0u(type);
                if (BFI.A0J(strA0u, MIME_TYPES)) {
                    return strA0u;
                }
            }
        } catch (RuntimeException unused) {
        }
        return null;
    }

    private final Long querySize(Context context, Uri uri) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    int columnIndex = cursorQuery.getColumnIndex("_size");
                    Long lValueOf = (!cursorQuery.moveToFirst() || columnIndex < 0 || cursorQuery.isNull(columnIndex)) ? null : Long.valueOf(cursorQuery.getLong(columnIndex));
                    cursorQuery.close();
                    return lValueOf;
                } finally {
                }
            }
        } catch (RuntimeException unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stageOne(android.content.Context r13, android.net.Uri r14, X.HtJ<? super X.HxE<java.lang.String, ? extends java.io.File>> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.facebook.aura.settings.support.HelpTicketAttachmentFiles.C136441
            if (r0 == 0) goto L23
            r11 = r15
            com.facebook.aura.settings.support.HelpTicketAttachmentFiles$stageOne$1 r11 = (com.facebook.aura.settings.support.HelpTicketAttachmentFiles.C136441) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r11.label = r2
        L12:
            java.lang.Object r0 = r11.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r11.label
            java.lang.String r4 = "HelpTicketAttachmentFiles"
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L29
            java.lang.Object r1 = r11.L$3
            goto L4f
        L23:
            com.facebook.aura.settings.support.HelpTicketAttachmentFiles$stageOne$1 r11 = new com.facebook.aura.settings.support.HelpTicketAttachmentFiles$stageOne$1
            r11.<init>(r15)
            goto L12
        L29:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            X.Hwg.A00(r0)
            r7 = r13
            r8 = r14
            java.lang.String r1 = r12.mimeTypeOf(r13, r14)
            if (r1 == 0) goto L66
            com.facebook.aura.composer.upload.HatchAttachmentStaging r6 = com.facebook.aura.composer.upload.HatchAttachmentStaging.INSTANCE     // Catch: java.lang.Exception -> L57 com.facebook.aura.composer.upload.AttachmentTooLargeException -> L5e java.util.concurrent.CancellationException -> L64
            r11.L$0 = r2     // Catch: java.lang.Exception -> L57 com.facebook.aura.composer.upload.AttachmentTooLargeException -> L5e java.util.concurrent.CancellationException -> L64
            r11.L$1 = r2     // Catch: java.lang.Exception -> L57 com.facebook.aura.composer.upload.AttachmentTooLargeException -> L5e java.util.concurrent.CancellationException -> L64
            r11.L$2 = r2     // Catch: java.lang.Exception -> L57 com.facebook.aura.composer.upload.AttachmentTooLargeException -> L5e java.util.concurrent.CancellationException -> L64
            r11.L$3 = r1     // Catch: java.lang.Exception -> L57 com.facebook.aura.composer.upload.AttachmentTooLargeException -> L5e java.util.concurrent.CancellationException -> L64
            r11.label = r3     // Catch: java.lang.Exception -> L57 com.facebook.aura.composer.upload.AttachmentTooLargeException -> L5e java.util.concurrent.CancellationException -> L64
            r9 = 10485760(0xa00000, double:5.180654E-317)
            java.lang.Object r0 = r6.stage(r7, r8, r9, r11)     // Catch: java.lang.Exception -> L57 com.facebook.aura.composer.upload.AttachmentTooLargeException -> L5e java.util.concurrent.CancellationException -> L64
            if (r0 != r5) goto L52
            return r5
        L4f:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L57 com.facebook.aura.composer.upload.AttachmentTooLargeException -> L5e java.util.concurrent.CancellationException -> L64
        L52:
            X.HxE r5 = X.C3cG.A0r(r1, r0)     // Catch: java.lang.Exception -> L57 com.facebook.aura.composer.upload.AttachmentTooLargeException -> L5e java.util.concurrent.CancellationException -> L64
            return r5
        L57:
            r1 = move-exception
            java.lang.String r0 = "Dropped an unreadable attachment"
            X.CFK.A0A(r4, r0, r1)
            return r2
        L5e:
            java.lang.String r0 = "Dropped an attachment over the 10 MB limit"
            X.CFK.A06(r4, r0)
            return r2
        L64:
            r0 = move-exception
            throw r0
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.support.HelpTicketAttachmentFiles.stageOne(android.content.Context, android.net.Uri, X.HtJ):java.lang.Object");
    }

    public final String[] getMIME_TYPES() {
        return MIME_TYPES;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009e -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stage(android.content.Context r12, java.util.List<? extends android.net.Uri> r13, java.util.List<java.io.File> r14, X.HtJ<? super java.util.List<com.facebook.aura.network.transport.HatchMultipartFilePart>> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.facebook.aura.settings.support.HelpTicketAttachmentFiles.AnonymousClass1
            if (r0 == 0) goto Lb3
            r3 = r15
            com.facebook.aura.settings.support.HelpTicketAttachmentFiles$stage$1 r3 = (com.facebook.aura.settings.support.HelpTicketAttachmentFiles.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb3
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r4 = 1
            if (r0 == 0) goto La1
            if (r0 != r4) goto Lbb
            int r6 = r3.I$2
            int r9 = r3.I$0
            java.lang.Object r2 = r3.L$10
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r8 = r3.L$7
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r7 = r3.L$5
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r14 = r3.L$2
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r0 = r3.L$0
            android.content.Context r12 = X.C60P.A02(r0, r1)
        L37:
            X.HxE r1 = (X.HxE) r1
            if (r1 == 0) goto L60
            A r11 = r1.first
            java.lang.String r11 = (java.lang.String) r11
            B r10 = r1.second
            java.io.File r10 = (java.io.File) r10
            r14.add(r10)
            int r1 = r6 + 1
            java.lang.String r0 = "attachment_"
            java.lang.String r6 = X.FGI.A0H(r0, r1)
            com.facebook.aura.settings.support.HelpTicketAttachmentFiles r1 = com.facebook.aura.settings.support.HelpTicketAttachmentFiles.INSTANCE
            java.lang.String r0 = com.facebook.aura.composer.upload.AttachmentFilenamesKt.resolveAttachmentFilename(r12, r2, r11)
            java.lang.String r1 = r1.asciiFilename(r0)
            com.facebook.aura.network.transport.HatchMultipartFilePart r0 = new com.facebook.aura.network.transport.HatchMultipartFilePart
            r0.<init>(r6, r1, r11, r10)
            r7.add(r0)
        L60:
            r6 = r9
        L61:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lba
            java.lang.Object r2 = r8.next()
            int r9 = r6 + 1
            if (r6 >= 0) goto L77
            X.AbstractC0885AGm.A14()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L77:
            android.net.Uri r2 = (android.net.Uri) r2
            com.facebook.aura.settings.support.HelpTicketAttachmentFiles r1 = com.facebook.aura.settings.support.HelpTicketAttachmentFiles.INSTANCE
            r3.L$0 = r12
            r0 = 0
            r3.L$1 = r0
            r3.L$2 = r14
            r3.L$3 = r0
            r3.L$4 = r0
            r3.L$5 = r7
            r3.L$6 = r0
            r3.L$7 = r8
            r3.L$8 = r0
            r3.L$9 = r0
            r3.L$10 = r2
            r3.I$0 = r9
            r3.I$1 = r6
            r3.I$2 = r6
            r3.label = r4
            java.lang.Object r1 = r1.stageOne(r12, r2, r3)
            if (r1 != r5) goto L37
            return r5
        La1:
            X.Hwg.A00(r1)
            r0 = 5
            java.util.List r0 = X.AbstractC0878AGe.A0a(r13, r0)
            java.util.ArrayList r7 = X.C3cG.A0h()
            java.util.Iterator r8 = r0.iterator()
            r6 = 0
            goto L61
        Lb3:
            com.facebook.aura.settings.support.HelpTicketAttachmentFiles$stage$1 r3 = new com.facebook.aura.settings.support.HelpTicketAttachmentFiles$stage$1
            r3.<init>(r15)
            goto L12
        Lba:
            return r7
        Lbb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.support.HelpTicketAttachmentFiles.stage(android.content.Context, java.util.List, java.util.List, X.HtJ):java.lang.Object");
    }

    private final String asciiFilename(String str) {
        int length = str.length();
        ArrayList arrayListA11 = C60O.A11(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (' ' > cCharAt || cCharAt >= '\u007f' || cCharAt == '/' || cCharAt == '\\') {
                cCharAt = '_';
            }
            arrayListA11.add(Character.valueOf(cCharAt));
        }
        return AbstractC0878AGe.A0L("", "", "", arrayListA11, null);
    }

    public final Admission admit(Context context, Uri uri) {
        AnonymousClass003.A0u(context, uri);
        if (mimeTypeOf(context, uri) == null) {
            return Admission.UNSUPPORTED_TYPE;
        }
        Long lQuerySize = querySize(context, uri);
        return (lQuerySize == null || lQuerySize.longValue() <= 10485760) ? Admission.ACCEPTED : Admission.TOO_LARGE;
    }
}
