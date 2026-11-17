package com.facebook.aura.file.view;

import X.AHI;
import X.AKQ;
import X.AVy;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC1103AYp;
import X.AbstractC1996Aw5;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06827l3;
import X.C10G;
import X.C1110AYw;
import X.C11U;
import X.C1515AkP;
import X.C1809ArT;
import X.C1822Arm;
import X.C19U;
import X.C1YY;
import X.C1b8;
import X.C3U4;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7195Ei7;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C7BD;
import X.C7BY;
import X.C7Je;
import X.DCl;
import X.EnumC10460Hji;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC8647Fhz;
import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.file.actions.HatchFileRef;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.file.view.BoundedTextRead;
import com.facebook.aura.file.view.ExternalFileSource;
import com.facebook.aura.file.view.FileContentType;
import com.facebook.aura.library.repo.WorkspaceBrowseDataSource;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class FileViewerContentKt {
    public static final long BYTES_PER_CHAR = 2;
    public static final int CHUNK_LINES = 100;
    public static final float DocumentViewerBottomPadding = 20.0f;
    public static final String FILE_VIEWER_CACHE_SUBDIR = "file_viewer";
    public static final long FS_READ_CAP_BYTES = 1048576;
    public static final long LOW_RAM_MAX_HTML_MATERIALIZED_BYTES = 2097152;
    public static final int MAX_CSV_CELL_CHARS = 16384;
    public static final int MAX_CSV_LINES_SCANNED = 50000;
    public static final int MAX_CSV_RECORD_CHARS = 65536;
    public static final long MAX_HTML_MATERIALIZED_BYTES = 4194304;
    public static final int MAX_LINE_CHARS = 2000;
    public static final int MAX_MARKDOWN_PREVIEW_CHARS = 131072;
    public static final int MAX_SPREADSHEET_COLUMNS = 256;
    public static final int MAX_SPREADSHEET_ROWS = 500;
    public static final File PLACEHOLDER_FILE = new File("");

    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$ErrorContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            FileViewerContentKt.ErrorContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$LoadingContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119442 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119442(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            FileViewerContentKt.LoadingContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$UnsupportedContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119452 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $icon;
        public final /* synthetic */ String $message;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119452(String str, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$message = str;
            this.$icon = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            FileViewerContentKt.UnsupportedContent(this.$message, this.$icon, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.FileViewerContentKt", f = "FileViewerContent.kt", l = {1164}, m = "externalSource", v = 2)
    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$externalSource$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileViewerContentKt.externalSource(null, null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.FileViewerContentKt", f = "FileViewerContent.kt", l = {870}, m = "fileByteSize", v = 2)
    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$fileByteSize$1, reason: invalid class name and case insensitive filesystem */
    public final class C119461 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileViewerContentKt.fileByteSize(null, null, null, null, this);
        }

        public C119461(HtJ<? super C119461> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.FileViewerContentKt", f = "FileViewerContent.kt", l = {1202}, m = "loadCsvPreview", v = 2)
    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$loadCsvPreview$1, reason: invalid class name and case insensitive filesystem */
    public final class C119471 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileViewerContentKt.loadCsvPreview(null, null, null, null, this);
        }

        public C119471(HtJ<? super C119471> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.FileViewerContentKt$loadFileContent$2", f = "FileViewerContent.kt", l = {911, 912, 935, 958, 966, 977, 988, 990, 992, 996, 1000, 1002, 1081}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$loadFileContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119482 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super FileLoadingState>, Object> {
        public final /* synthetic */ String $authToken;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ WorkspaceEntry $entry;
        public final /* synthetic */ String $fileUrl;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119482(WorkspaceEntry workspaceEntry, String str, String str2, Context context, AbstractC3358CGz abstractC3358CGz, HtJ<? super C119482> htJ) {
            super(2, htJ);
            this.$entry = workspaceEntry;
            this.$fileUrl = str;
            this.$authToken = str2;
            this.$context = context;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C119482(this.$entry, this.$fileUrl, this.$authToken, this.$context, this.$userSession, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:122:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0237 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0251 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0268 A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0274 A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:141:0x027d A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x028f  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0295  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x02cb A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:161:0x02d4 A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:163:0x02e2 A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0310 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:174:0x031e A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:176:0x0326 A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:220:0x0437 A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:222:0x043b A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009d A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00db A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e3 A[Catch: Exception -> 0x0441, TryCatch #6 {Exception -> 0x0441, blocks: (B:7:0x001a, B:9:0x0024, B:11:0x0039, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:21:0x005c, B:23:0x0060, B:25:0x006b, B:27:0x0073, B:29:0x0077, B:33:0x008e, B:35:0x0092, B:37:0x009d, B:39:0x00a5, B:41:0x00a9, B:43:0x00b1, B:44:0x00b5, B:46:0x00bd, B:50:0x00d7, B:52:0x00db, B:54:0x00e3, B:56:0x00f8, B:58:0x0100, B:62:0x011a, B:64:0x011e, B:67:0x0128, B:71:0x0141, B:73:0x0145, B:77:0x015e, B:79:0x0162, B:81:0x0166, B:85:0x017e, B:87:0x0182, B:89:0x0186, B:167:0x02f5, B:172:0x031a, B:174:0x031e, B:176:0x0326, B:178:0x0332, B:210:0x03ee, B:212:0x03f8, B:213:0x03fc, B:214:0x0424, B:180:0x033a, B:192:0x036d, B:194:0x0371, B:196:0x037b, B:198:0x0399, B:200:0x03ab, B:202:0x03b3, B:204:0x03d1, B:206:0x03d9, B:208:0x03e9, B:209:0x03ed, B:191:0x0358, B:92:0x01a3, B:218:0x0431, B:220:0x0437, B:222:0x043b, B:95:0x01b8, B:97:0x01c2, B:99:0x01c6, B:101:0x01cc, B:104:0x01de, B:134:0x0260, B:136:0x0268, B:137:0x026c, B:139:0x0274, B:140:0x027a, B:150:0x0299, B:151:0x02a0, B:156:0x02c7, B:158:0x02cb, B:159:0x02d0, B:161:0x02d4, B:163:0x02e2, B:141:0x027d, B:143:0x0285, B:144:0x028c, B:108:0x01e5, B:109:0x01ea, B:113:0x01fa, B:120:0x021a, B:123:0x021f, B:128:0x0243, B:131:0x0253, B:133:0x025b, B:116:0x020b, B:20:0x0059, B:32:0x008b, B:49:0x00d4, B:61:0x0117, B:70:0x013e, B:76:0x015b, B:84:0x017b, B:119:0x0217, B:127:0x0240, B:155:0x02c4, B:166:0x02f2, B:171:0x0317, B:217:0x042e, B:103:0x01d8, B:106:0x01e3, B:112:0x01f2, B:182:0x0342, B:184:0x034c, B:188:0x0353, B:189:0x0356, B:183:0x0347, B:186:0x0351), top: B:238:0x000f, inners: #1, #3, #4, #5 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 1150
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.C119482.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super FileLoadingState> htJ) {
            return ((C119482) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.FileViewerContentKt", f = "FileViewerContent.kt", l = {1316, 1327}, m = "loadPptxPreview", v = 2)
    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$loadPptxPreview$1, reason: invalid class name and case insensitive filesystem */
    public final class C119491 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileViewerContentKt.loadPptxPreview(null, null, null, null, this);
        }

        public C119491(HtJ<? super C119491> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.FileViewerContentKt", f = "FileViewerContent.kt", l = {1178}, m = "loadSpreadsheetForWebView", v = 2)
    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$loadSpreadsheetForWebView$1, reason: invalid class name and case insensitive filesystem */
    public final class C119501 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileViewerContentKt.loadSpreadsheetForWebView(null, null, null, null, this);
        }

        public C119501(HtJ<? super C119501> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.FileViewerContentKt", f = "FileViewerContent.kt", l = {1249, 1260}, m = "loadXlsxPreview", v = 2)
    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$loadXlsxPreview$1, reason: invalid class name and case insensitive filesystem */
    public final class C119511 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileViewerContentKt.loadXlsxPreview(null, null, null, null, this);
        }

        public C119511(HtJ<? super C119511> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.FileViewerContentKt", f = "FileViewerContent.kt", l = {1437}, m = "resolveSavePath", v = 2)
    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$resolveSavePath$1, reason: invalid class name and case insensitive filesystem */
    public final class C119521 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileViewerContentKt.resolveSavePath(null, null, this);
        }

        public C119521(HtJ<? super C119521> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.FileViewerContentKt$saveFileContent$2", f = "FileViewerContent.kt", l = {1428, 1428}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$saveFileContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119532 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $content;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public Object L$1;
        public int label;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z;
            WorkspaceBrowseDataSource companion;
            Object objResolveSavePath = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (Exception unused) {
                z = false;
            }
            if (i == 0) {
                Hwg.A00(obj);
                companion = WorkspaceBrowseDataSource.Companion.getInstance(this.$userSession);
                String str = this.$relativePath;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.L$0 = null;
                this.L$1 = companion;
                this.label = 1;
                objResolveSavePath = FileViewerContentKt.resolveSavePath(str, abstractC3358CGz, this);
                if (objResolveSavePath == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    z = ((WorkspaceBrowseDataSource.WriteResult) objResolveSavePath) instanceof WorkspaceBrowseDataSource.WriteResult.Success;
                    return Boolean.valueOf(z);
                }
                companion = (WorkspaceBrowseDataSource) this.L$1;
                Hwg.A00(obj);
            }
            String str2 = this.$content;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            objResolveSavePath = companion.writeFileContent((String) objResolveSavePath, str2, true, false, true, this);
            if (objResolveSavePath == enumC10460Hji) {
                return enumC10460Hji;
            }
            z = ((WorkspaceBrowseDataSource.WriteResult) objResolveSavePath) instanceof WorkspaceBrowseDataSource.WriteResult.Success;
            return Boolean.valueOf(z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119532(AbstractC3358CGz abstractC3358CGz, String str, String str2, HtJ<? super C119532> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$relativePath = str;
            this.$content = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C119532(this.$userSession, this.$relativePath, this.$content, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C119532) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.FileViewerContentKt", f = "FileViewerContent.kt", l = {1499}, m = "streamFileToCache", v = 2)
    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$streamFileToCache$1, reason: invalid class name and case insensitive filesystem */
    public final class C119541 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileViewerContentKt.streamFileToCache(null, null, null, null, this);
        }

        public C119541(HtJ<? super C119541> htJ) {
            super(htJ);
        }
    }

    public static final long maxHtmlMaterializedBytes(Context context) {
        ActivityManager activityManager;
        Object systemService = context != null ? context.getSystemService("activity") : null;
        return ((systemService instanceof ActivityManager) && (activityManager = (ActivityManager) systemService) != null && activityManager.isLowRamDevice()) ? 2097152L : 4194304L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x02c0, code lost:
    
        if (r48 == false) goto L93;
     */
    /* renamed from: EditableTextContent-GmEhDVc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m891EditableTextContentGmEhDVc(java.lang.String r46, com.facebook.aura.library.repo.WorkspaceEntry r47, boolean r48, boolean r49, X.G0U<? super java.lang.String, kotlin.Unit> r50, float r51, boolean r52, com.facebook.aura.file.view.ExternalFileSource r53, X.BRg r54, X.BFM r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.m891EditableTextContentGmEhDVc(java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry, boolean, boolean, X.G0U, float, boolean, com.facebook.aura.file.view.ExternalFileSource, X.BRg, X.BFM, int, int):void");
    }

    public static final void ErrorContent(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1921140398);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209e7);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, BRg.A00, AuraDimensKt.SpacingXsmall);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12004b), null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }

    /* renamed from: ImageContent-942rkJo, reason: not valid java name */
    public static final void m893ImageContent942rkJo(WorkspaceEntry workspaceEntry, String str, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1197643709);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, workspaceEntry) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A06(bfm, f);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0T = AnonymousClass005.A0T(bfm, C3U4.A0C(bRg2, 0.0f, 0.0f, 0.0f, f));
            float f2 = AuraDimensKt.SpacingMedium;
            BRg bRgA0B = C3U4.A0B(bRgA0T, f2, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (str != null) {
                bfm.AgE(2145849161);
                String str2 = workspaceEntry.name;
                BRg bRgA012 = C1b8.A01(C11U.A01(C10G.A02, 12.0f), C3cH.A0W(bfm).secondaryButtonBackground);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    C7196Ei8 c7196Ei8A00 = C7197Ei9.A00();
                    ((C7195Ei7) c7196Ei8A00).A01 = InterfaceC8647Fhz.A05;
                    objAaT = new C7197Ei9(c7196Ei8A00);
                    bfm.Ai0(objAaT);
                }
                AuraImageKt.AuraImage(str, bRgA012, (C7197Ei9) objAaT, str2, null, true, ComposableSingletons$FileViewerContentKt.lambda$1161379035, null, false, null, bfm, ((iA0T >> 3) & 14) | 1769472, 912);
            } else {
                bfm.AgE(2146316393);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, BRg.A00, f2, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new FileViewerContentKt$ImageContent$2(workspaceEntry, str, f, bRg2, i, i2);
        }
    }

    /* renamed from: ScrollingFileTextContent-PfoAEA0, reason: not valid java name */
    public static final void m894ScrollingFileTextContentPfoAEA0(String str, WorkspaceEntry workspaceEntry, boolean z, boolean z2, ExternalFileSource externalFileSource, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1358608886);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, workspaceEntry);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, externalFileSource);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A09(bfm, f);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = AbstractC0878AGe.A0N(toDisplayLines(str), 100);
                bfm.Ai0(objAaT);
            }
            List list = (List) objAaT;
            C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, 1);
            String strRememberViewerMimeType = rememberViewerMimeType(workspaceEntry.name, bfm, 0);
            long j = C3cH.A0W(bfm).primaryText;
            long jA03 = C19U.A03(14);
            long jA04 = C60Q.A04();
            AbstractC1996Aw5 abstractC1996Aw5 = z ? AbstractC1996Aw5.A01 : AbstractC1996Aw5.A04;
            C1822Arm c1822Arm = C1822Arm.A03;
            C1822Arm c1822Arm2 = new C1822Arm(null, abstractC1996Aw5, null, 0, 0, j, jA03, C1809ArT.A01, B6A.A07, jA04);
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0T(bRg2), AuraDimensKt.SpacingMedium);
            boolean zA1W = AnonymousClass002.A1W(bfm, strRememberViewerMimeType, AnonymousClass003.A1P(bfm, c1110AYwA00, c1822Arm2, bfm.A67(list) | AnonymousClass004.A1K(iA0d)) | AnonymousClass004.A1M(iA0d), AnonymousClass005.A1L(iA0d)) | AnonymousClass007.A1I(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = new FileViewerContentKt$ScrollingFileTextContent$1$1(list, z2, externalFileSource, z, c1110AYwA00, c1822Arm2, strRememberViewerMimeType, f);
                bfm.Ai0(objAaT2);
            }
            C1YY.A01(null, null, null, null, null, bfm, null, bRgA09, (G0U) objAaT2, 0, 510, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new FileViewerContentKt$ScrollingFileTextContent$2(str, workspaceEntry, z, z2, externalFileSource, f, bRg2, i, i2);
        }
    }

    public static final void UnsupportedContent(String str, int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRgA00;
        long j;
        AuraIconSize auraIconSize;
        BRg bRgA07;
        BRg bRg2 = bRg;
        bfm.AgG(-731254311);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C10G.A04(C3U4.A09(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium), 150.0f);
            InterfaceC1380AiA interfaceC1380AiAA0R = AnonymousClass006.A0R(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0R);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            boolean zA1W = C60Q.A1W(HatchFileUIUtils.SELF_COLORED_ICONS, i);
            BS0 bs0 = BRg.A00;
            BRg bRgA072 = C10G.A07(bs0, 48.0f);
            if (zA1W) {
                bfm.AgE(-1573171369);
                BBI.A0R(bbi, false);
                bRgA00 = bs0;
            } else {
                bfm.AgE(-1573167220);
                bRgA00 = C1b8.A00(C11U.A01(bs0, 24.0f), 0.1f, C3cH.A07(bfm, AuraTheme.INSTANCE));
                BBI.A0R(bbi, false);
            }
            BRg bRgThen = bRgA072.then(bRgA00);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AVy aVyA00 = BOf.A00(bfm, i, (iA0d >> 3) & 14);
            if (zA1W) {
                bfm.AgE(1873164832);
                BBI.A0R(bbi, false);
                j = B6A.A07;
                auraIconSize = AuraIconSize.LARGE;
                bRgA07 = C10G.A07(bs0, 48.0f);
            } else {
                bfm.AgE(1873165922);
                j = C3cH.A0W(bfm).secondaryText;
                BBI.A0R(bbi, false);
                auraIconSize = AuraIconSize.SMALL;
                bRgA07 = bs0;
            }
            AuraIconKt.m2567AuraIconFHprtrg(bRgA07, aVyA00, auraIconSize, null, j, null, bfm, (AVy.$stable << 3) | 3072, 32);
            BBI.A0R(bbi, true);
            C01N.A05(bfm, bs0);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119452(str, i, bRg2, i2, i3);
        }
    }

    public static final File createFileViewerCacheFile(Context context, WorkspaceEntry workspaceEntry) throws IOException {
        try {
            File fileA0O = C3cG.A0O(context.getCacheDir(), FILE_VIEWER_CACHE_SUBDIR);
            fileA0O.mkdirs();
            StagedFileHandoff stagedFileHandoff = StagedFileHandoff.INSTANCE;
            stagedFileHandoff.sweepStale(fileA0O, 21600000L);
            String str = workspaceEntry.name;
            if (C7BY.A0j(str)) {
                str = "file";
            }
            String name = new File(str).getName();
            C7384Etj.A0U(name);
            File fileCreateTempFile = File.createTempFile(FGI.A0U("hatch_", C06827l3.A02("[\\\\/\\x00-\\x1f]").A03(name, "_"), "_"), "", fileA0O);
            C7384Etj.A0X(fileCreateTempFile);
            stagedFileHandoff.retain(fileCreateTempFile);
            return fileCreateTempFile;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object externalSource(com.facebook.aura.library.repo.WorkspaceEntry r6, java.lang.String r7, android.content.Context r8, X.AbstractC3358CGz r9, X.HtJ<? super com.facebook.aura.file.view.ExternalFileSource> r10) throws java.io.IOException {
        /*
            boolean r0 = r10 instanceof com.facebook.aura.file.view.FileViewerContentKt.AnonymousClass1
            if (r0 == 0) goto L4e
            r5 = r10
            com.facebook.aura.file.view.FileViewerContentKt$externalSource$1 r5 = (com.facebook.aura.file.view.FileViewerContentKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L54
            X.Hwg.A00(r4)
        L21:
            java.io.File r4 = (java.io.File) r4
            if (r4 == 0) goto L2a
            com.facebook.aura.file.view.ExternalFileSource$Staged r2 = new com.facebook.aura.file.view.ExternalFileSource$Staged
            r2.<init>(r4)
        L2a:
            return r2
        L2b:
            X.Hwg.A00(r4)
            java.lang.String r0 = "content://"
            boolean r0 = X.C60O.A1X(r7, r0)
            if (r0 == 0) goto L3d
            if (r8 == 0) goto L3d
            com.facebook.aura.file.view.ExternalFileSource$Local r0 = localContentSource(r6, r7)
            return r0
        L3d:
            r5.L$0 = r2
            r5.L$1 = r2
            r5.L$2 = r2
            r5.L$3 = r2
            r5.label = r1
            java.lang.Object r4 = streamFileToCache(r6, r7, r8, r9, r5)
            if (r4 != r3) goto L21
            return r3
        L4e:
            com.facebook.aura.file.view.FileViewerContentKt$externalSource$1 r5 = new com.facebook.aura.file.view.FileViewerContentKt$externalSource$1
            r5.<init>(r10)
            goto L12
        L54:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.externalSource(com.facebook.aura.library.repo.WorkspaceEntry, java.lang.String, android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object fileByteSize(java.lang.String r7, com.facebook.aura.library.repo.WorkspaceEntry r8, android.content.Context r9, X.AbstractC3358CGz r10, X.HtJ<? super java.lang.Long> r11) {
        /*
            java.lang.String r1 = "_size"
            boolean r0 = r11 instanceof com.facebook.aura.file.view.FileViewerContentKt.C119461
            if (r0 == 0) goto L5d
            r5 = r11
            com.facebook.aura.file.view.FileViewerContentKt$fileByteSize$1 r5 = (com.facebook.aura.file.view.FileViewerContentKt.C119461) r5
            int r3 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L5d
            int r3 = r3 - r2
            r5.label = r3
        L14:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 1
            r6 = 0
            if (r0 == 0) goto L34
            if (r0 != r2) goto L64
            X.Hwg.A00(r4)
        L23:
            boolean r0 = r4 instanceof com.facebook.aura.gateway.HatchFileOperations.StatResult.Success
            if (r0 == 0) goto L32
            com.facebook.aura.gateway.HatchFileOperations$StatResult$Success r4 = (com.facebook.aura.gateway.HatchFileOperations.StatResult.Success) r4
        L29:
            if (r4 == 0) goto L63
            com.facebook.aura.gateway.HatchFileOperations$FileEntry r0 = r4.entry
            if (r0 == 0) goto L63
            java.lang.Long r0 = r0.size
            return r0
        L32:
            r4 = r6
            goto L29
        L34:
            X.Hwg.A00(r4)
            java.lang.String r0 = "content://"
            boolean r0 = X.C60O.A1X(r7, r0)
            if (r0 == 0) goto L48
            if (r9 == 0) goto La0
            android.content.ContentResolver r3 = r9.getContentResolver()
            if (r3 == 0) goto La0
            goto L69
        L48:
            com.facebook.aura.gateway.HatchFileOperations r1 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            java.lang.String r0 = r8.relativePath
            r5.L$0 = r6
            r5.L$1 = r6
            r5.L$2 = r6
            r5.L$3 = r6
            r5.label = r2
            java.lang.Object r4 = r1.statFile(r0, r10, r5)
            if (r4 != r3) goto L23
            return r3
        L5d:
            com.facebook.aura.file.view.FileViewerContentKt$fileByteSize$1 r5 = new com.facebook.aura.file.view.FileViewerContentKt$fileByteSize$1
            r5.<init>(r11)
            goto L14
        L63:
            return r6
        L64:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L69:
            android.net.Uri r4 = X.C7Je.A01(r7)     // Catch: java.lang.Exception -> La0
            java.lang.String[] r5 = new java.lang.String[]{r1}     // Catch: java.lang.Exception -> La0
            r7 = r6
            r8 = r6
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> La0
            if (r2 == 0) goto La0
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L99
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L94
            if (r1 < 0) goto L94
            boolean r0 = r2.isNull(r1)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L94
            long r0 = r2.getLong(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.Long r0 = X.C3cG.A0S(r0)     // Catch: java.lang.Throwable -> L99
            goto L95
        L94:
            r0 = r6
        L95:
            r2.close()     // Catch: java.lang.Exception -> La0
            return r0
        L99:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r2, r1)     // Catch: java.lang.Exception -> La0
            throw r0     // Catch: java.lang.Exception -> La0
        La0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.fileByteSize(java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry, android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    public static final float getDocumentViewerBottomPadding() {
        return DocumentViewerBottomPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.facebook.aura.file.view.StagedFileHandoff] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.facebook.aura.file.view.StagedFileHandoff] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.aura.file.view.StagedFileHandoff] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.HtJ, com.facebook.aura.file.view.FileViewerContentKt$loadCsvPreview$1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object loadCsvPreview(com.facebook.aura.library.repo.WorkspaceEntry r10, java.lang.String r11, android.content.Context r12, X.AbstractC3358CGz r13, X.HtJ<? super com.facebook.aura.file.view.FileLoadingState> r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.loadCsvPreview(com.facebook.aura.library.repo.WorkspaceEntry, java.lang.String, android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object loadFileContent$default(WorkspaceEntry workspaceEntry, String str, String str2, Context context, AbstractC3358CGz abstractC3358CGz, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            context = null;
        }
        return loadFileContent(workspaceEntry, str, str2, context, abstractC3358CGz, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object loadPptxPreview(com.facebook.aura.library.repo.WorkspaceEntry r10, java.lang.String r11, android.content.Context r12, X.AbstractC3358CGz r13, X.HtJ<? super com.facebook.aura.file.view.FileLoadingState> r14) throws java.io.IOException {
        /*
            boolean r0 = r14 instanceof com.facebook.aura.file.view.FileViewerContentKt.C119491
            if (r0 == 0) goto Lca
            r8 = r14
            com.facebook.aura.file.view.FileViewerContentKt$loadPptxPreview$1 r8 = (com.facebook.aura.file.view.FileViewerContentKt.C119491) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lca
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r3 = r8.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r7 = 0
            r1 = 1
            r6 = 2
            if (r0 == 0) goto L5f
            if (r0 == r1) goto L81
            if (r0 != r6) goto Ld1
            java.lang.Object r10 = r8.L$0
            com.facebook.aura.library.repo.WorkspaceEntry r10 = (com.facebook.aura.library.repo.WorkspaceEntry) r10
            X.Hwg.A00(r3)
        L28:
            java.io.File r3 = (java.io.File) r3
            if (r3 != 0) goto L34
            java.lang.String r0 = "Failed to load presentation"
            com.facebook.aura.file.view.FileLoadingState$Error r9 = new com.facebook.aura.file.view.FileLoadingState$Error
            r9.<init>(r0)
            return r9
        L34:
            com.facebook.aura.file.view.ExternalFileSource$Staged r7 = new com.facebook.aura.file.view.ExternalFileSource$Staged
            r7.<init>(r3)
            com.facebook.aura.file.docx.OoxmlArchiveGuard r1 = com.facebook.aura.file.docx.OoxmlArchiveGuard.INSTANCE
            com.facebook.aura.file.docx.OoxmlArchiveGuard$Limits r0 = com.facebook.aura.file.docx.OoxmlArchiveGuard.pptxLimits
            com.facebook.aura.file.docx.OoxmlArchiveGuard$Inspection r6 = r1.inspect(r3, r0)
            long r4 = r3.length()
            com.facebook.aura.file.view.AuraFileViewerLimits r0 = com.facebook.aura.file.view.AuraFileViewerLimits.INSTANCE
            long r1 = r0.getMaxRenderBytes()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto Lae
            boolean r0 = r6 instanceof com.facebook.aura.file.docx.OoxmlArchiveGuard.Inspection.Rejected
            if (r0 != 0) goto Lae
            r1 = 0
            com.facebook.aura.file.view.FileContentType$Presentation r0 = new com.facebook.aura.file.view.FileContentType$Presentation
            r0.<init>(r3, r1)
            com.facebook.aura.file.view.FileLoadingState$Success r9 = new com.facebook.aura.file.view.FileLoadingState$Success
            r9.<init>(r0)
            return r9
        L5f:
            X.Hwg.A00(r3)
            java.lang.String r0 = "content://"
            boolean r0 = X.C60O.A1X(r11, r0)
            if (r0 == 0) goto L6d
            r5 = 1
            if (r12 != 0) goto L6e
        L6d:
            r5 = 0
        L6e:
            r8.L$0 = r10
            r8.L$1 = r11
            r8.L$2 = r12
            r8.L$3 = r13
            r8.I$0 = r5
            r8.label = r1
            java.lang.Object r3 = fileByteSize(r11, r10, r12, r13, r8)
            if (r3 != r9) goto L96
            return r9
        L81:
            int r5 = r8.I$0
            java.lang.Object r13 = r8.L$3
            X.CGz r13 = (X.AbstractC3358CGz) r13
            java.lang.Object r12 = r8.L$2
            android.content.Context r12 = (android.content.Context) r12
            java.lang.Object r11 = r8.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r8.L$0
            com.facebook.aura.library.repo.WorkspaceEntry r10 = (com.facebook.aura.library.repo.WorkspaceEntry) r10
            X.Hwg.A00(r3)
        L96:
            java.lang.Number r3 = (java.lang.Number) r3
            if (r5 == 0) goto Lb5
            if (r3 == 0) goto Lb5
            long r3 = r3.longValue()
            com.facebook.aura.file.view.AuraFileViewerLimits r0 = com.facebook.aura.file.view.AuraFileViewerLimits.INSTANCE
            long r1 = r0.getMaxRenderBytes()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb5
            com.facebook.aura.file.view.ExternalFileSource$Local r7 = localContentSource(r10, r11)
        Lae:
            com.facebook.aura.file.view.ExternalFileSource r7 = (com.facebook.aura.file.view.ExternalFileSource) r7
            com.facebook.aura.file.view.FileLoadingState$Success r0 = X.C60R.A0L(r7, r10)
            return r0
        Lb5:
            r8.L$0 = r10
            r8.L$1 = r7
            r8.L$2 = r7
            r8.L$3 = r7
            r8.L$4 = r7
            r8.I$0 = r5
            r8.label = r6
            java.lang.Object r3 = streamFileToCache(r10, r11, r12, r13, r8)
            if (r3 != r9) goto L28
            return r9
        Lca:
            com.facebook.aura.file.view.FileViewerContentKt$loadPptxPreview$1 r8 = new com.facebook.aura.file.view.FileViewerContentKt$loadPptxPreview$1
            r8.<init>(r14)
            goto L12
        Ld1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.loadPptxPreview(com.facebook.aura.library.repo.WorkspaceEntry, java.lang.String, android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object loadSpreadsheetForWebView(com.facebook.aura.library.repo.WorkspaceEntry r6, java.lang.String r7, android.content.Context r8, X.AbstractC3358CGz r9, X.HtJ<? super com.facebook.aura.file.view.FileLoadingState> r10) throws java.io.IOException {
        /*
            boolean r0 = r10 instanceof com.facebook.aura.file.view.FileViewerContentKt.C119501
            if (r0 == 0) goto L45
            r3 = r10
            com.facebook.aura.file.view.FileViewerContentKt$loadSpreadsheetForWebView$1 r3 = (com.facebook.aura.file.view.FileViewerContentKt.C119501) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r5 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L73
            java.lang.Object r6 = r3.L$0
            com.facebook.aura.library.repo.WorkspaceEntry r6 = (com.facebook.aura.library.repo.WorkspaceEntry) r6
            X.Hwg.A00(r5)
        L24:
            java.io.File r5 = (java.io.File) r5
            if (r5 != 0) goto L4b
            java.lang.String r0 = "Failed to load spreadsheet"
            com.facebook.aura.file.view.FileLoadingState$Error r2 = new com.facebook.aura.file.view.FileLoadingState$Error
            r2.<init>(r0)
            return r2
        L30:
            X.Hwg.A00(r5)
            r3.L$0 = r6
            r0 = 0
            r3.L$1 = r0
            r3.L$2 = r0
            r3.L$3 = r0
            r3.label = r1
            java.lang.Object r5 = streamFileToCache(r6, r7, r8, r9, r3)
            if (r5 != r2) goto L24
            return r2
        L45:
            com.facebook.aura.file.view.FileViewerContentKt$loadSpreadsheetForWebView$1 r3 = new com.facebook.aura.file.view.FileViewerContentKt$loadSpreadsheetForWebView$1
            r3.<init>(r10)
            goto L12
        L4b:
            long r3 = r5.length()
            com.facebook.aura.file.view.AuraFileViewerLimits r0 = com.facebook.aura.file.view.AuraFileViewerLimits.INSTANCE
            long r1 = r0.getMaxRenderBytes()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L63
            com.facebook.aura.file.view.ExternalFileSource$Staged r0 = new com.facebook.aura.file.view.ExternalFileSource$Staged
            r0.<init>(r5)
            com.facebook.aura.file.view.FileLoadingState$Success r0 = X.C60R.A0L(r0, r6)
            return r0
        L63:
            X.AHI r2 = X.AHI.A01
            r4 = 0
            r3 = 0
            com.facebook.aura.file.view.FileContentType$Spreadsheet r1 = new com.facebook.aura.file.view.FileContentType$Spreadsheet
            r6 = r3
            r1.<init>(r2, r3, r4, r5, r6)
            com.facebook.aura.file.view.FileLoadingState$Success r2 = new com.facebook.aura.file.view.FileLoadingState$Success
            r2.<init>(r1)
            return r2
        L73:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.loadSpreadsheetForWebView(com.facebook.aura.library.repo.WorkspaceEntry, java.lang.String, android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object loadXlsxPreview(com.facebook.aura.library.repo.WorkspaceEntry r11, java.lang.String r12, android.content.Context r13, X.AbstractC3358CGz r14, X.HtJ<? super com.facebook.aura.file.view.FileLoadingState> r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.loadXlsxPreview(com.facebook.aura.library.repo.WorkspaceEntry, java.lang.String, android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.file.view.BoundedRecord readBoundedRecord(java.io.BufferedReader r9, int r10, int r11) throws java.io.IOException {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = java.lang.Math.min(r10, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r6 = 1
            r5 = 0
            r4 = 1
            r8 = 0
        Lf:
            int r0 = r9.read()
            if (r0 >= 0) goto L28
            java.lang.String r0 = r7.toString()
            com.facebook.aura.file.view.BoundedRecord r1 = new com.facebook.aura.file.view.BoundedRecord
            r1.<init>(r0, r5, r4)
            int r0 = r7.length()
            if (r0 > 0) goto L27
            if (r5 != 0) goto L27
            r1 = 0
        L27:
            return r1
        L28:
            char r3 = (char) r0
            r0 = 13
            r2 = 10
            if (r3 == r2) goto L32
            r1 = 0
            if (r3 != r0) goto L33
        L32:
            r1 = 1
        L33:
            if (r3 != r0) goto L42
            r9.mark(r6)
            int r0 = r9.read()
            char r0 = (char) r0
            if (r0 == r2) goto L42
            r9.reset()
        L42:
            if (r1 == 0) goto L5f
            if (r8 != 0) goto L50
            java.lang.String r0 = r7.toString()
            com.facebook.aura.file.view.BoundedRecord r1 = new com.facebook.aura.file.view.BoundedRecord
            r1.<init>(r0, r5, r4)
            return r1
        L50:
            if (r4 < r11) goto L5c
            java.lang.String r0 = r7.toString()
            com.facebook.aura.file.view.BoundedRecord r1 = new com.facebook.aura.file.view.BoundedRecord
            r1.<init>(r0, r6, r4)
            return r1
        L5c:
            int r4 = r4 + 1
            goto L65
        L5f:
            r0 = 34
            if (r3 != r0) goto L65
            r8 = r8 ^ 1
        L65:
            int r0 = r7.length()
            if (r0 >= r10) goto L73
            if (r1 == 0) goto L6f
            r3 = 10
        L6f:
            r7.append(r3)
            goto Lf
        L73:
            r5 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.readBoundedRecord(java.io.BufferedReader, int, int):com.facebook.aura.file.view.BoundedRecord");
    }

    public static final BoundedTextRead readBoundedText(InputStream inputStream, int i) throws IOException {
        BoundedTextRead success;
        Reader inputStreamReader = new InputStreamReader(inputStream, DCl.A05);
        if (!(inputStreamReader instanceof BufferedReader)) {
            inputStreamReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            StringBuilder sb = new StringBuilder(Math.min(i, 8192));
            char[] cArr = new char[8192];
            while (true) {
                int i2 = inputStreamReader.read(cArr);
                if (i2 < 0) {
                    success = new BoundedTextRead.Success(sb.toString());
                    break;
                }
                if (sb.length() > i - i2) {
                    success = BoundedTextRead.TooLarge.INSTANCE;
                    break;
                }
                sb.append(cArr, 0, i2);
            }
            inputStreamReader.close();
            return success;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.file.view.CsvPreview readCsvPreview(java.io.InputStream r6) throws java.io.IOException {
        /*
            java.nio.charset.Charset r0 = X.DCl.A05
            java.io.BufferedReader r3 = X.C60R.A0U(r6, r0)
            java.util.ArrayList r4 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> L56
            r5 = 0
        Lb:
            r6 = 0
        Lc:
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = 50000(0xc350, float:7.0065E-41)
            int r0 = r1 - r5
            com.facebook.aura.file.view.BoundedRecord r2 = readBoundedRecord(r3, r2, r0)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L4b
            if (r5 >= r1) goto L4a
            int r0 = r2.lines     // Catch: java.lang.Throwable -> L56
            int r5 = r5 + r0
            java.lang.String r0 = r2.value     // Catch: java.lang.Throwable -> L56
            boolean r0 = X.C7BY.A0j(r0)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L2b
            if (r6 != 0) goto L48
            boolean r0 = r2.truncated     // Catch: java.lang.Throwable -> L56
            goto L46
        L2b:
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L56
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L4a
            java.lang.String r0 = r2.value     // Catch: java.lang.Throwable -> L56
            com.facebook.aura.file.view.CsvRow r1 = parseCsvRecord(r0)     // Catch: java.lang.Throwable -> L56
            java.util.List<java.lang.String> r0 = r1.cells     // Catch: java.lang.Throwable -> L56
            r4.add(r0)     // Catch: java.lang.Throwable -> L56
            if (r6 != 0) goto L48
            boolean r0 = r2.truncated     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L48
            boolean r0 = r1.truncated     // Catch: java.lang.Throwable -> L56
        L46:
            if (r0 == 0) goto Lb
        L48:
            r6 = 1
            goto Lc
        L4a:
            r6 = 1
        L4b:
            com.facebook.aura.file.view.CsvPreview r0 = new com.facebook.aura.file.view.CsvPreview     // Catch: java.lang.Throwable -> L56
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L55
            r3.close()
        L55:
            return r0
        L56:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.readCsvPreview(java.io.InputStream):com.facebook.aura.file.view.CsvPreview");
    }

    public static final TextPreview readTextPreview(InputStream inputStream, int i) throws IOException {
        TextPreview textPreview;
        Reader inputStreamReader = new InputStreamReader(inputStream, DCl.A05);
        if (!(inputStreamReader instanceof BufferedReader)) {
            inputStreamReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            StringBuilder sb = new StringBuilder(Math.min(i, 8192));
            char[] cArr = new char[8192];
            while (true) {
                if (sb.length() < i) {
                    int i2 = inputStreamReader.read(cArr, 0, Math.min(8192, i - sb.length()));
                    if (i2 < 0) {
                        textPreview = new TextPreview(sb.toString(), false);
                        break;
                    }
                    sb.append(cArr, 0, i2);
                } else {
                    textPreview = new TextPreview(sb.toString(), inputStreamReader.read() >= 0);
                }
            }
            inputStreamReader.close();
            return textPreview;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String rememberViewerMimeType(java.lang.String r3, X.BFM r4, int r5) {
        /*
            r0 = r5 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto Ld
            boolean r0 = r4.A65(r3)
            if (r0 != 0) goto L12
        Ld:
            r1 = r5 & 6
            r0 = 0
            if (r1 != r2) goto L13
        L12:
            r0 = 1
        L13:
            java.lang.Object r1 = r4.AaT()
            if (r0 != 0) goto L1d
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L30
        L1d:
            com.facebook.aura.file.core.HatchMimeResolver r0 = com.facebook.aura.file.core.HatchMimeResolver.INSTANCE
            java.lang.String r1 = r0.mimeForName(r3)
            java.lang.String r0 = "application/octet-stream"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            java.lang.String r1 = "text/plain"
        L2d:
            r4.Ai0(r1)
        L30:
            java.lang.String r1 = (java.lang.String) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.rememberViewerMimeType(java.lang.String, X.BFM, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object resolveSavePath(java.lang.String r6, X.AbstractC3358CGz r7, X.HtJ<? super java.lang.String> r8) {
        /*
            boolean r0 = r8 instanceof com.facebook.aura.file.view.FileViewerContentKt.C119521
            if (r0 == 0) goto L72
            r5 = r8
            com.facebook.aura.file.view.FileViewerContentKt$resolveSavePath$1 r5 = (com.facebook.aura.file.view.FileViewerContentKt.C119521) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r3 = r5.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L5f
            if (r0 != r4) goto L79
            java.lang.Object r0 = r5.L$0
            java.lang.String r6 = X.C3cG.A0d(r0, r3)
        L23:
            com.facebook.aura.gateway.HatchFileOperations$StatResult r3 = (com.facebook.aura.gateway.HatchFileOperations.StatResult) r3
            boolean r0 = r3 instanceof com.facebook.aura.gateway.HatchFileOperations.StatResult.Success
            if (r0 == 0) goto L78
            com.facebook.aura.gateway.HatchFileOperations$StatResult$Success r3 = (com.facebook.aura.gateway.HatchFileOperations.StatResult.Success) r3
            com.facebook.aura.gateway.HatchFileOperations$FileEntry r0 = r3.entry
            com.facebook.aura.gateway.HatchFileOperations$FileEntryType r1 = r0.type
            com.facebook.aura.gateway.HatchFileOperations$FileEntryType r0 = com.facebook.aura.gateway.HatchFileOperations.FileEntryType.FILE
            if (r1 != r0) goto L78
            java.lang.String r1 = r3.path
            char[] r0 = new char[r4]
            r3 = 0
            r2 = 47
            r0[r3] = r2
            java.lang.String r1 = X.C7BY.A0a(r1, r0)
            int r0 = r1.length()
            if (r0 == 0) goto L78
            java.lang.String r0 = X.AnonymousClass002.A0l(r1)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L78
            char[] r0 = new char[r4]
            r0[r3] = r2
            java.lang.String r0 = X.C7BY.A0a(r6, r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L78
            return r1
        L5f:
            X.Hwg.A00(r3)
            com.facebook.aura.gateway.HatchFileOperations r1 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            r5.L$0 = r6
            r0 = 0
            r5.L$1 = r0
            r5.label = r4
            java.lang.Object r3 = r1.statFile(r6, r7, r5)
            if (r3 != r2) goto L23
            return r2
        L72:
            com.facebook.aura.file.view.FileViewerContentKt$resolveSavePath$1 r5 = new com.facebook.aura.file.view.FileViewerContentKt$resolveSavePath$1
            r5.<init>(r8)
            goto L12
        L78:
            return r6
        L79:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.resolveSavePath(java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r5 = createFileViewerCacheFile(r9, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object streamFileToCache(com.facebook.aura.library.repo.WorkspaceEntry r7, java.lang.String r8, android.content.Context r9, X.AbstractC3358CGz r10, X.HtJ<? super java.io.File> r11) throws java.io.IOException {
        /*
            boolean r0 = r11 instanceof com.facebook.aura.file.view.FileViewerContentKt.C119541
            if (r0 == 0) goto L25
            r6 = r11
            com.facebook.aura.file.view.FileViewerContentKt$streamFileToCache$1 r6 = (com.facebook.aura.file.view.FileViewerContentKt.C119541) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r6.label
            r1 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r1) goto L2b
            java.lang.Object r1 = r6.L$5
            java.lang.Object r5 = r6.L$4
            java.io.File r5 = (java.io.File) r5
            goto L8a
        L25:
            com.facebook.aura.file.view.FileViewerContentKt$streamFileToCache$1 r6 = new com.facebook.aura.file.view.FileViewerContentKt$streamFileToCache$1
            r6.<init>(r11)
            goto L12
        L2b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L30:
            X.Hwg.A00(r0)
            if (r9 == 0) goto L9b
            java.io.File r5 = createFileViewerCacheFile(r9, r7)
            if (r5 == 0) goto L9b
            java.lang.String r0 = "content://"
            boolean r0 = X.C60O.A1X(r8, r0)     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L6f
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch: java.lang.Exception -> L94
            android.net.Uri r0 = X.C7Je.A01(r8)     // Catch: java.lang.Exception -> L94
            java.io.InputStream r3 = r1.openInputStream(r0)     // Catch: java.lang.Exception -> L94
            if (r3 == 0) goto L94
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L68
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L68
            X.F0H.A00(r3, r2)     // Catch: java.lang.Throwable -> L61
            r2.close()     // Catch: java.lang.Throwable -> L68
            r3.close()     // Catch: java.lang.Exception -> L94
            r4 = r5
            goto L94
        L61:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L63
        L63:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r2, r1)     // Catch: java.lang.Throwable -> L68
            throw r0     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r3, r1)     // Catch: java.lang.Exception -> L94
            throw r0     // Catch: java.lang.Exception -> L94
        L6f:
            com.facebook.aura.gateway.HatchFileOperations r0 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE     // Catch: java.lang.Exception -> L94
            r6.L$0 = r4     // Catch: java.lang.Exception -> L94
            r6.L$1 = r4     // Catch: java.lang.Exception -> L94
            r6.L$2 = r4     // Catch: java.lang.Exception -> L94
            r6.L$3 = r4     // Catch: java.lang.Exception -> L94
            r6.L$4 = r5     // Catch: java.lang.Exception -> L94
            r6.L$5 = r5     // Catch: java.lang.Exception -> L94
            r6.L$6 = r4     // Catch: java.lang.Exception -> L94
            r6.label = r1     // Catch: java.lang.Exception -> L94
            java.lang.Object r0 = r0.fetchMediaToFile(r8, r5, r10, r6)     // Catch: java.lang.Exception -> L94
            if (r0 != r3) goto L88
            return r3
        L88:
            r1 = r5
            goto L8d
        L8a:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L94
        L8d:
            boolean r0 = X.AnonymousClass001.A1X(r0)     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L94
            r4 = r1
        L94:
            if (r4 != 0) goto L9b
            com.facebook.aura.file.view.StagedFileHandoff r0 = com.facebook.aura.file.view.StagedFileHandoff.INSTANCE
            r0.release(r5)
        L9b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.streamFileToCache(com.facebook.aura.library.repo.WorkspaceEntry, java.lang.String, android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    public static final void LoadingContent(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(694437918);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA04 = C10G.A04(AnonymousClass001.A0R(bRg), 200.0f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AnonymousClass007.A0s(bfm, bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119442(bRg, i, i2);
        }
    }

    public static final FileContentType getContentType(WorkspaceEntry workspaceEntry) {
        String strA0i = C60Q.A0i(workspaceEntry.getFileExtension());
        return AbstractC0878AGe.A0k(HatchFileUIUtils.FileExtensions.TEXT, strA0i) ? new FileContentType.Text("", true, false, null) : AbstractC0878AGe.A0k(HatchFileUIUtils.FileExtensions.CODE, strA0i) ? new FileContentType.Code("", true, false, null) : AbstractC0878AGe.A0k(HatchFileUIUtils.FileExtensions.IMAGE, strA0i) ? new FileContentType.Image("", false) : AbstractC0878AGe.A0k(HatchFileUIUtils.FileExtensions.PDF, strA0i) ? new FileContentType.Pdf(PLACEHOLDER_FILE, false) : AbstractC0878AGe.A0k(HatchFileUIUtils.FileExtensions.DOCUMENT, strA0i) ? new FileContentType.Document(PLACEHOLDER_FILE, false) : AbstractC0878AGe.A0k(HatchFileUIUtils.FileExtensions.SPREADSHEET, strA0i) ? new FileContentType.Spreadsheet(AHI.A01, false, null, null, false) : AbstractC0878AGe.A0k(HatchFileUIUtils.FileExtensions.PRESENTATION, strA0i) ? new FileContentType.Presentation(PLACEHOLDER_FILE, false) : AbstractC0878AGe.A0k(HatchFileUIUtils.FileExtensions.HTML, strA0i) ? new FileContentType.Html("", true) : AbstractC0878AGe.A0k(HatchFileUIUtils.FileExtensions.AUDIO, strA0i) ? new FileContentType.Audio(false) : AbstractC0878AGe.A0k(HatchFileUIUtils.FileExtensions.VIDEO, strA0i) ? new FileContentType.Video(false) : new FileContentType.Unknown(false);
    }

    public static final Object loadFileContent(WorkspaceEntry workspaceEntry, String str, String str2, Context context, AbstractC3358CGz abstractC3358CGz, HtJ<? super FileLoadingState> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C119482(workspaceEntry, str, str2, context, abstractC3358CGz, null));
    }

    public static final ExternalFileSource.Local localContentSource(WorkspaceEntry workspaceEntry, String str) {
        Uri uriA01 = C7Je.A01(str);
        C7384Etj.A0U(uriA01);
        return new ExternalFileSource.Local(new HatchFileRef.Local(uriA01, workspaceEntry.name));
    }

    public static final CsvRow parseCsvRecord(String str) {
        boolean z;
        ArrayList arrayListA0h = C3cG.A0h();
        StringBuilder sbA0w = C60O.A0w();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int length = str.length();
            z = true;
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (z2 && cCharAt == '\"') {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != '\"') {
                    z2 = !z2;
                    i++;
                } else {
                    if (sbA0w.length() < 16384) {
                        sbA0w.append('\"');
                    } else {
                        z3 = true;
                    }
                    i += 2;
                }
            } else {
                if (cCharAt == '\"') {
                    z2 = !z2;
                } else if (cCharAt != ',' || z2) {
                    if (sbA0w.length() < 16384) {
                        sbA0w.append(cCharAt);
                    } else {
                        z3 = true;
                    }
                } else {
                    if (arrayListA0h.size() >= 256) {
                        z3 = true;
                        break;
                    }
                    arrayListA0h.add(AnonymousClass002.A0l(sbA0w.toString()));
                    sbA0w.setLength(0);
                }
                i++;
            }
        }
        if (arrayListA0h.size() < 256) {
            arrayListA0h.add(AnonymousClass002.A0l(sbA0w.toString()));
            z = z3;
        }
        return new CsvRow(arrayListA0h, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.G0U<java.lang.String, kotlin.Unit> rememberFileViewerMarkdownLinkHandler(com.facebook.aura.library.repo.WorkspaceEntry r7, boolean r8, X.BFM r9, int r10) {
        /*
            android.content.Context r6 = X.AnonymousClass003.A0O(r9)
            com.facebook.aura.navigation.AuraNavigator r5 = X.AnonymousClass003.A0b(r9)
            X.AKH<X.CGz> r0 = com.facebook.aura.session.LocalUserSessionKt.LocalUserSession
            java.lang.Object r4 = r9.A6v(r0)
            X.CGz r4 = (X.AbstractC3358CGz) r4
            java.lang.String r0 = r7.relativePath
            boolean r3 = r9.A65(r0)
            r0 = r10 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L24
            boolean r0 = r9.A66(r8)
            if (r0 != 0) goto L29
        L24:
            r1 = r10 & 48
            r0 = 0
            if (r1 != r2) goto L2a
        L29:
            r0 = 1
        L2a:
            r0 = r0 | r3
            boolean r0 = X.AnonymousClass005.A1T(r9, r6, r5, r4, r0)
            java.lang.Object r3 = r9.AaT()
            if (r0 != 0) goto L39
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L41
        L39:
            com.facebook.aura.file.view.FileViewerContentKt$rememberFileViewerMarkdownLinkHandler$1$1 r3 = new com.facebook.aura.file.view.FileViewerContentKt$rememberFileViewerMarkdownLinkHandler$1$1
            r3.<init>(r4, r5, r6, r7, r8)
            r9.Ai0(r3)
        L41:
            X.G0U r3 = (X.G0U) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.rememberFileViewerMarkdownLinkHandler(com.facebook.aura.library.repo.WorkspaceEntry, boolean, X.BFM, int):X.G0U");
    }

    public static final Object saveFileContent(String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C119532(abstractC3358CGz, str, str2, null));
    }

    public static final List<String> toDisplayLines(String str) {
        int iMin;
        ArrayList arrayListA0h = C3cG.A0h();
        C7384Etj.A0Y(str, 0);
        C7BD c7bd = new C7BD(str);
        while (c7bd.hasNext()) {
            String str2 = (String) c7bd.next();
            int length = str2.length();
            if (length <= 2000) {
                arrayListA0h.add(str2);
            } else {
                int i = 0;
                do {
                    iMin = Math.min(i + 2000, length);
                    arrayListA0h.add(str2.substring(i, iMin));
                    i = iMin;
                } while (iMin < length);
            }
        }
        return arrayListA0h;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161 A[PHI: r11
  0x0161: PHI (r11v6 boolean) = (r11v4 boolean), (r11v30 boolean), (r11v30 boolean) binds: [B:173:0x04be, B:73:0x015b, B:75:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d1  */
    /* renamed from: FileViewerContent-Kp3ePZc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m892FileViewerContentKp3ePZc(com.facebook.aura.library.repo.WorkspaceEntry r36, com.facebook.aura.file.view.FileLoadingState r37, java.lang.String r38, boolean r39, boolean r40, X.G0U<? super java.lang.String, kotlin.Unit> r41, java.lang.String r42, X.BO6<java.lang.Integer, java.lang.String> r43, androidx.compose.foundation.pager.PagerState r44, boolean r45, X.G0U<? super java.lang.Integer, kotlin.Unit> r46, float r47, X.BRg r48, X.BFM r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 1277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerContentKt.m892FileViewerContentKp3ePZc(com.facebook.aura.library.repo.WorkspaceEntry, com.facebook.aura.file.view.FileLoadingState, java.lang.String, boolean, boolean, X.G0U, java.lang.String, X.BO6, androidx.compose.foundation.pager.PagerState, boolean, X.G0U, float, X.BRg, X.BFM, int, int, int):void");
    }
}
