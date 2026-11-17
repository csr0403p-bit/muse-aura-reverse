package com.facebook.aura.bugreport;

import X.A6B;
import X.AII;
import X.AIM;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass801;
import X.C067379v;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C3UX;
import X.C3b6;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C78T;
import X.C7AI;
import X.C7BY;
import X.C8154FWw;
import X.CEV;
import X.CFK;
import X.CFP;
import X.DCl;
import X.EnumC10460Hji;
import X.Ey9;
import X.F0H;
import X.F3w;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.net.Uri;
import com.facebook.acra.constants.ReportField;
import com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil;
import com.facebook.aura.common.prefs.AuraPrefsStorage;
import com.facebook.aura.file.utils.HatchDownloadsWriterKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.mobileconfig.AuraMobileConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraBugReportCollector {
    public static final int $stable = 0;
    public static final String AGENT_LOGS_FILE_NAME = "agent_logs.txt";
    public static final String ATTACHMENTS_DIR = "bug_report_attachments";
    public static final String DIAGNOSTICS_FILE_NAME = "hatch_diagnostics.txt";
    public static final String HATCHERY_LINK_FILE_NAME = "hatchery_vm_link.txt";
    public static final AuraBugReportCollector INSTANCE = new AuraBugReportCollector();
    public static final String LOGCAT_FILE_NAME = "logcat.txt";
    public static final int LOGCAT_MAX_LINES = 10000;
    public static final long LOGCAT_PROCESS_TIMEOUT_SECONDS = 10;
    public static final long MAX_REVIEWED_ARTIFACT_BYTES = 10485760;
    public static final String MOBILE_CONFIGS_FILE_NAME = "mobileconfigs.txt";
    public static final String TAG = "AuraBugReportCollector";
    public static final Set<String> activeSubmissions;
    public static final C3UX cleanupScope;

    /* loaded from: classes.dex */
    public final class CollectedItem extends C06G {
        public static final int $stable = 8;
        public final File file;
        public final CollectedItemKind kind;
        public final String pickedName;
        public final long sizeBytes;

        public static /* synthetic */ CollectedItem copy$default(CollectedItem collectedItem, CollectedItemKind collectedItemKind, File file, long j, String str, int i, Object obj) {
            CollectedItemKind collectedItemKind2 = collectedItemKind;
            File file2 = file;
            long j2 = j;
            String str2 = str;
            if ((i & 1) != 0) {
                collectedItemKind2 = collectedItem.kind;
            }
            if ((i & 2) != 0) {
                file2 = collectedItem.file;
            }
            if ((i & 4) != 0) {
                j2 = collectedItem.sizeBytes;
            }
            if ((i & 8) != 0) {
                str2 = collectedItem.pickedName;
            }
            AnonymousClass003.A0u(collectedItemKind2, file2);
            return new CollectedItem(collectedItemKind2, file2, j2, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CollectedItem) {
                    CollectedItem collectedItem = (CollectedItem) obj;
                    if (this.kind != collectedItem.kind || !C7384Etj.areEqual(this.file, collectedItem.file) || this.sizeBytes != collectedItem.sizeBytes || !C7384Etj.areEqual(this.pickedName, collectedItem.pickedName)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final CollectedItemKind component1() {
            return this.kind;
        }

        public final File component2() {
            return this.file;
        }

        public final long component3() {
            return this.sizeBytes;
        }

        public final String component4() {
            return this.pickedName;
        }

        public final String getDisplayName() {
            String str = this.pickedName;
            return str == null ? getName() : str;
        }

        public final File getFile() {
            return this.file;
        }

        public final CollectedItemKind getKind() {
            return this.kind;
        }

        public final String getName() {
            String name = this.file.getName();
            C7384Etj.A0U(name);
            return name;
        }

        public final String getPickedName() {
            return this.pickedName;
        }

        public final long getSizeBytes() {
            return this.sizeBytes;
        }

        public int hashCode() {
            return AnonymousClass006.A06(this.sizeBytes, AnonymousClass005.A0F(this.file, AnonymousClass005.A0E(this.kind))) + AnonymousClass006.A0G(this.pickedName);
        }

        public CollectedItem(CollectedItemKind collectedItemKind, File file, long j, String str) {
            AnonymousClass003.A0u(collectedItemKind, file);
            this.kind = collectedItemKind;
            this.file = file;
            this.sizeBytes = j;
            this.pickedName = str;
        }

        public final CollectedItem copy(CollectedItemKind collectedItemKind, File file, long j, String str) {
            AnonymousClass003.A0u(collectedItemKind, file);
            return new CollectedItem(collectedItemKind, file, j, str);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ CollectedItem(CollectedItemKind collectedItemKind, File file, long j, String str, int i, C06H c06h) {
            this(collectedItemKind, file, j, AnonymousClass006.A0u(i, str));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class CollectedItemKind {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ CollectedItemKind[] $VALUES;
        public static final CollectedItemKind CONTRIBUTOR;
        public static final CollectedItemKind DIAGNOSTICS;
        public static final CollectedItemKind HATCHERY_LINK;
        public static final CollectedItemKind LOGCAT;
        public static final CollectedItemKind VM_LOGS;

        static {
            CollectedItemKind collectedItemKind = new CollectedItemKind(ReportField.LOGCAT, 0);
            LOGCAT = collectedItemKind;
            CollectedItemKind collectedItemKind2 = new CollectedItemKind("DIAGNOSTICS", 1);
            DIAGNOSTICS = collectedItemKind2;
            CollectedItemKind collectedItemKind3 = new CollectedItemKind("HATCHERY_LINK", 2);
            HATCHERY_LINK = collectedItemKind3;
            CollectedItemKind collectedItemKind4 = new CollectedItemKind("CONTRIBUTOR", 3);
            CONTRIBUTOR = collectedItemKind4;
            CollectedItemKind collectedItemKind5 = new CollectedItemKind("VM_LOGS", 4);
            VM_LOGS = collectedItemKind5;
            CollectedItemKind[] collectedItemKindArr = {collectedItemKind, collectedItemKind2, collectedItemKind3, collectedItemKind4, collectedItemKind5};
            $VALUES = collectedItemKindArr;
            $ENTRIES = new F3w(collectedItemKindArr);
        }

        public static Ey9<CollectedItemKind> getEntries() {
            return $ENTRIES;
        }

        public static CollectedItemKind valueOf(String str) {
            return (CollectedItemKind) Enum.valueOf(CollectedItemKind.class, str);
        }

        public static CollectedItemKind[] values() {
            return (CollectedItemKind[]) $VALUES.clone();
        }

        public CollectedItemKind(String str, int i) {
        }
    }

    /* loaded from: classes.dex */
    public interface ReplaceResult {

        public final class Failed implements ReplaceResult {
            public static final int $stable = 0;
            public static final Failed INSTANCE = new Failed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Failed);
            }

            public String toString() {
                return "Failed";
            }

            public int hashCode() {
                return 642465642;
            }
        }

        public final class Replaced extends C06G implements ReplaceResult {
            public static final int $stable = 0;
            public final long sizeBytes;

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Replaced) && this.sizeBytes == ((Replaced) obj).sizeBytes);
            }

            public static /* synthetic */ Replaced copy$default(Replaced replaced, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = replaced.sizeBytes;
                }
                return new Replaced(j);
            }

            public final long component1() {
                return this.sizeBytes;
            }

            public final Replaced copy(long j) {
                return new Replaced(j);
            }

            public final long getSizeBytes() {
                return this.sizeBytes;
            }

            public int hashCode() {
                return AnonymousClass002.A0A(this.sizeBytes);
            }

            public Replaced(long j) {
                this.sizeBytes = j;
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class TooLarge implements ReplaceResult {
            public static final int $stable = 0;
            public static final TooLarge INSTANCE = new TooLarge();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof TooLarge);
            }

            public String toString() {
                return "TooLarge";
            }

            public int hashCode() {
                return 1540969012;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportCollector$cleanupAsync$1", f = "AuraBugReportCollector.kt", l = {363}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportCollector$cleanupAsync$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ List<HoC> $pendingWork;
        public final /* synthetic */ String $submissionId;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends HoC> list, Context context, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$pendingWork = list;
            this.$context = context;
            this.$submissionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$pendingWork, this.$context, this.$submissionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Iterator<HoC> it;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                it = this.$pendingWork.iterator();
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                it = (Iterator) this.L$1;
                Hwg.A00(obj);
            }
            while (it.hasNext()) {
                HoC next = it.next();
                this.L$0 = null;
                this.L$1 = it;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 1;
                if (next.APQ(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            AuraBugReportCollector.INSTANCE.cleanup(this.$context, this.$submissionId);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportCollector$collect$2", f = "AuraBugReportCollector.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportCollector$collect$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends CollectedItem>>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $endpoint;
        public final /* synthetic */ String $submissionId;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, AbstractC3358CGz abstractC3358CGz, String str2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$submissionId = str;
            this.$userSession = abstractC3358CGz;
            this.$endpoint = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$submissionId, this.$userSession, this.$endpoint, htJ);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends CollectedItem>> htJ) {
            return invoke2(c3ux, (HtJ<? super List<CollectedItem>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            Context context = this.$context;
            String str = this.$submissionId;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            String str2 = this.$endpoint;
            AII aiiA17 = AIM.A17();
            AuraBugReportCollector auraBugReportCollector = AuraBugReportCollector.INSTANCE;
            File fileCollectLogcat = auraBugReportCollector.collectLogcat(context, str);
            if (fileCollectLogcat != null) {
                aiiA17.add(auraBugReportCollector.toItem(fileCollectLogcat, CollectedItemKind.LOGCAT));
            }
            if (abstractC3358CGz != null) {
                File fileCollectHatcheryLink = auraBugReportCollector.collectHatcheryLink(abstractC3358CGz, context, str);
                if (fileCollectHatcheryLink != null) {
                    aiiA17.add(auraBugReportCollector.toItem(fileCollectHatcheryLink, CollectedItemKind.HATCHERY_LINK));
                }
                File fileCollectDiagnostics = auraBugReportCollector.collectDiagnostics(abstractC3358CGz, context, str, auraBugReportCollector.getAppVersion$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(context), str2);
                if (fileCollectDiagnostics != null) {
                    aiiA17.add(auraBugReportCollector.toItem(fileCollectDiagnostics, CollectedItemKind.DIAGNOSTICS));
                }
                File fileCollectMobileConfigs = auraBugReportCollector.collectMobileConfigs(context, str);
                if (fileCollectMobileConfigs != null) {
                    aiiA17.add(auraBugReportCollector.toItem(fileCollectMobileConfigs, CollectedItemKind.DIAGNOSTICS));
                }
                int[] iArr = {0, 1, 2};
                int i = 0;
                do {
                    File fileA0L = AnonymousClass801.A0L(iArr[i], context, abstractC3358CGz, auraBugReportCollector.ensureAttachmentsDir$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(context, str));
                    if (fileA0L != null) {
                        aiiA17.add(auraBugReportCollector.toItem(fileA0L, CollectedItemKind.CONTRIBUTOR));
                    }
                    i++;
                } while (i < 3);
            }
            return AIM.A18(aiiA17);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super List<CollectedItem>> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportCollector$replaceItemContent$2", f = "AuraBugReportCollector.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportCollector$replaceItemContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C109992 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ReplaceResult>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Uri $source;
        public final /* synthetic */ File $target;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109992(File file, Context context, Uri uri, HtJ<? super C109992> htJ) {
            super(2, htJ);
            this.$target = file;
            this.$context = context;
            this.$source = uri;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C109992(this.$target, this.$context, this.$source, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            boolean z;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            File fileA0O = C3cG.A0O(this.$target.getParentFile(), FGI.A0M(this.$target.getName(), AuraPrefsStorage.TEMP_FILE_SUFFIX));
            try {
                InputStream inputStreamOpenInputStream = this.$context.getContentResolver().openInputStream(this.$source);
                if (inputStreamOpenInputStream == null) {
                    C60Q.A1J("Replacement source for ", this.$target.getName(), " could not be opened", AuraBugReportCollector.TAG);
                    return ReplaceResult.Failed.INSTANCE;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileA0O);
                    try {
                        byte[] bArr = new byte[8192];
                        long j = 0;
                        while (true) {
                            int i = inputStreamOpenInputStream.read(bArr);
                            if (i < 0) {
                                z = false;
                                break;
                            }
                            j += i;
                            if (j > 10485760) {
                                z = true;
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        }
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                        if (z) {
                            fileA0O.delete();
                            return ReplaceResult.TooLarge.INSTANCE;
                        }
                        Files.move(fileA0O.toPath(), this.$target.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
                        return new ReplaceResult.Replaced(j);
                    } finally {
                    }
                } finally {
                }
            } catch (CancellationException e) {
                fileA0O.delete();
                throw e;
            } catch (Exception e2) {
                CFK.A0A(AuraBugReportCollector.TAG, FGI.A0U("Failed to replace ", this.$target.getName(), ", keeping the original"), e2);
                fileA0O.delete();
                return ReplaceResult.Failed.INSTANCE;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ReplaceResult> htJ) {
            return ((C109992) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportCollector$saveItemToDownloads$2", f = "AuraBugReportCollector.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportCollector$saveItemToDownloads$2, reason: invalid class name and case insensitive filesystem */
    public final class C110002 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $mimeType;
        public final /* synthetic */ File $source;
        public int label;

        /* renamed from: com.facebook.aura.bugreport.AuraBugReportCollector$saveItemToDownloads$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<OutputStream, Unit> {
            public final /* synthetic */ File $source;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OutputStream outputStream) throws IOException {
                C7384Etj.A0Y(outputStream, 0);
                FileInputStream fileInputStream = new FileInputStream(this.$source);
                try {
                    F0H.A00(fileInputStream, outputStream);
                    fileInputStream.close();
                } finally {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(File file) {
                super(1);
                this.$source = file;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(OutputStream outputStream) throws IOException {
                invoke2(outputStream);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110002(Context context, File file, String str, HtJ<? super C110002> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$source = file;
            this.$mimeType = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C110002(this.$context, this.$source, this.$mimeType, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            boolean z = false;
            try {
                Context context = this.$context;
                String name = this.$source.getName();
                C7384Etj.A0U(name);
                if (HatchDownloadsWriterKt.writeToDownloads(context, name, this.$mimeType, new AnonymousClass1(this.$source)) != null) {
                    z = true;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(AuraBugReportCollector.TAG, FGI.A0U("Failed to save ", this.$source.getName(), " to Downloads"), e2);
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C110002) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectedItem toItem(File file, CollectedItemKind collectedItemKind) {
        return new CollectedItem(collectedItemKind, file, file.length(), null);
    }

    public final String readContent(File file) {
        C7384Etj.A0Y(file, 0);
        try {
            return CFP.A04(file, DCl.A05);
        } catch (Exception e) {
            CFK.A0A(TAG, FGI.A0M("Failed to read content for ", file.getName()), e);
            return "";
        }
    }

    public final List<LogLine> readLines(File file, int i, int i2) throws IOException {
        C7384Etj.A0Y(file, 0);
        try {
            BufferedReader bufferedReaderA0U = C60R.A0U(new FileInputStream(file), DCl.A05);
            try {
                C3b6 c3b6A07 = A6B.A07(new C8154FWw(new C067379v(bufferedReaderA0U)), i);
                AuraBugReportCollector$readLines$1$1 auraBugReportCollector$readLines$1$1 = new AuraBugReportCollector$readLines$1$1(i2);
                C7384Etj.A0Y(c3b6A07, 0);
                List<LogLine> listA02 = A6B.A02(new C7AI(auraBugReportCollector$readLines$1$1, c3b6A07));
                if (bufferedReaderA0U != null) {
                    bufferedReaderA0U.close();
                }
                return listA02;
            } finally {
            }
        } catch (Exception e) {
            CFK.A0A(TAG, FGI.A0M("Failed to read lines for ", file.getName()), e);
            return C0881AGi.A00;
        }
    }

    public final CollectedItem vmLogItem(File file) {
        C7384Etj.A0Y(file, 0);
        return toItem(file, CollectedItemKind.VM_LOGS);
    }

    public final boolean writeLines(File file, List<LogLine> list) throws IOException {
        boolean zA1a = AnonymousClass002.A1a(file, list);
        File fileA0O = C3cG.A0O(file.getParentFile(), FGI.A0M(file.getName(), AuraPrefsStorage.TEMP_FILE_SUFFIX));
        try {
            Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileA0O), DCl.A05);
            BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
            try {
                Iterator<LogLine> it = list.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write(it.next().text);
                    bufferedWriter.newLine();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                Files.move(fileA0O.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
                return zA1a;
            } finally {
            }
        } catch (Exception e) {
            CFK.A0A(TAG, FGI.A0U("Failed to write lines for ", file.getName(), ", dropping it from the report"), e);
            fileA0O.delete();
            file.delete();
            return false;
        }
    }

    static {
        Set<String> setSynchronizedSet = Collections.synchronizedSet(C3cG.A0k());
        C7384Etj.A0U(setSynchronizedSet);
        activeSubmissions = setSynchronizedSet;
        cleanupScope = C78T.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File collectDiagnostics(X.AbstractC3358CGz r17, android.content.Context r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportCollector.collectDiagnostics(X.CGz, android.content.Context, java.lang.String, java.lang.String, java.lang.String):java.io.File");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File collectHatcheryLink(AbstractC3358CGz abstractC3358CGz, Context context, String str) {
        HatchGatewayPrefsStore hatchGatewayPrefsStoreA0D = C3cG.A0D(abstractC3358CGz);
        String strA0a = C3cG.A0a(hatchGatewayPrefsStoreA0D);
        if (strA0a == null) {
            return null;
        }
        try {
            File fileA0O = C3cG.A0O(ensureAttachmentsDir$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(context, str), HATCHERY_LINK_FILE_NAME);
            String str2 = hatchGatewayPrefsStoreA0D.latestMessageId;
            String str3 = hatchGatewayPrefsStoreA0D.viewportMessageId;
            String strA0M = str2 != null ? FGI.A0M("&turn_id=", str2) : "";
            String strA0M2 = str3 != null ? FGI.A0M("&turn_id=", str3) : "";
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(FGI.A0M("Hatch VM: ", strA0a));
            sbA0w.append('\n');
            sbA0w.append(FGI.A0U("Hatchery Link (Last Turn at Report Time): https://www.pariscope.dev/hatchery?hatch=", strA0a, strA0M));
            sbA0w.append('\n');
            CFP.A05(fileA0O, AnonymousClass001.A0v(FGI.A0U("Hatchery Link (Last Turn in User Viewport at Report Time): https://www.pariscope.dev/hatchery?hatch=", strA0a, strA0M2), sbA0w), DCl.A05);
            CFK.A05(TAG, "Hatchery VM link file created");
            return fileA0O;
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to create Hatchery VM link file", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File collectLogcat(Context context, String str) throws IOException {
        try {
            File fileA0O = C3cG.A0O(ensureAttachmentsDir$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(context, str), LOGCAT_FILE_NAME);
            Process processStart = new ProcessBuilder("logcat", "-d", "-v", "year", "-t", "10000").redirectErrorStream(true).start();
            InputStream inputStream = processStart.getInputStream();
            C7384Etj.A0U(inputStream);
            Charset charset = DCl.A05;
            Reader inputStreamReader = new InputStreamReader(inputStream, charset);
            BufferedWriter bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileA0O), charset);
                bufferedReader = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        bufferedReader.write(line);
                        bufferedReader.newLine();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    bufferedReader.close();
                    if (!processStart.waitFor(10L, TimeUnit.SECONDS)) {
                        CFK.A06(TAG, "Logcat process timed out, destroying");
                    }
                    processStart.destroy();
                    if (!fileA0O.exists() || fileA0O.length() <= 0) {
                        CFK.A06(TAG, "Logcat file empty or missing");
                        return null;
                    }
                    CFK.A05(TAG, FGI.A0J("Logcat collected: ", fileA0O.length(), " bytes"));
                    return fileA0O;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to collect logcat", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File collectMobileConfigs(Context context, String str) {
        try {
            String strBuildBugReportDump = AuraMobileConfig.INSTANCE.buildBugReportDump();
            if (strBuildBugReportDump == null || C7BY.A0j(strBuildBugReportDump)) {
                CFK.A06(TAG, "No MobileConfig data available for bug report");
                return null;
            }
            File fileA0O = C3cG.A0O(ensureAttachmentsDir$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(context, str), MOBILE_CONFIGS_FILE_NAME);
            CFP.A05(fileA0O, strBuildBugReportDump, DCl.A05);
            C60O.A1O("MobileConfig bug report file created: ", strBuildBugReportDump.length(), " characters", TAG);
            return fileA0O;
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to create MobileConfig bug report file", e);
            return null;
        }
    }

    public final void cleanup(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        try {
            CEV.A03(C3cG.A0O(context.getCacheDir(), FGI.A0M("bug_report_attachments/", str)));
        } catch (Exception e) {
            C60O.A1Q("Failed to clean up attachments dir for ", str, TAG, e);
        }
        try {
            AuraBugReportScreenshotUtil.INSTANCE.screenshotFile(context, str).delete();
        } catch (Exception e2) {
            C60O.A1Q("Failed to clean up screenshot for ", str, TAG, e2);
        }
        activeSubmissions.remove(str);
    }

    public final String getAppVersion$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(Context context) {
        C7384Etj.A0Y(context, 0);
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final void cleanupAsync(Context context, String str, List<? extends HoC> list) {
        AnonymousClass005.A0x(context, str, list);
        AnonymousClass001.A1J(new AnonymousClass1(list, context, str, null), cleanupScope);
    }

    public final Object collect(Context context, AbstractC3358CGz abstractC3358CGz, String str, String str2, HtJ<? super List<CollectedItem>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(context, str, abstractC3358CGz, str2, null));
    }

    public final File ensureAttachmentsDir$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        activeSubmissions.add(str);
        File fileA0O = C3cG.A0O(context.getCacheDir(), FGI.A0M("bug_report_attachments/", str));
        if (!fileA0O.exists()) {
            fileA0O.mkdirs();
        }
        return fileA0O;
    }

    public final Object replaceItemContent(Context context, File file, Uri uri, HtJ<? super ReplaceResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C109992(file, context, uri, null));
    }

    public final Object saveItemToDownloads(Context context, File file, String str, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C110002(context, file, str, null));
    }
}
