package com.facebook.aura.file.utils;

import X.ADq;
import X.AbstractC06907md;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.BFI;
import X.BFM;
import X.BNt;
import X.C06H;
import X.C31u;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7354EnR;
import X.C7384Etj;
import X.C78T;
import X.C7BY;
import X.C7Je;
import X.CEV;
import X.DCl;
import X.EnumC10460Hji;
import X.F0H;
import X.F1F;
import X.FGI;
import X.FXS;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC7359EnW;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.components.reactions.AuraCelebrationBlastKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.file.core.HatchMimeResolver;
import com.facebook.aura.file.utils.MC;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.model.HatchFileProviderUtil;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.notifications.push.HatchDownloadCompletion;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.aura.settings.HatchDataExportLoggingKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.spaces.repo.HatchSpacesDataSource;
import com.facebook.aura.spaces.repo.PinnedItemsRepositoryJsonKt;
import com.facebook.aura.spaces.repo.SpaceExportResult;
import com.facebook.aura.status.repo.ActivityAction;
import com.facebook.aura.status.repo.ActivityDetails;
import com.facebook.aura.status.repo.ActivityGoal;
import com.facebook.aura.toast.api.ToastApi;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchFileUIUtils {
    public static final int $stable = 0;
    public static final long BYTES_PER_CHAR = 2;
    public static final String CLIPBOARD_STAGING_DIR = "clipboard";
    public static final String HTML_SUFFIX = ".html";
    public static final Set<String> KNOWN_FILE_EXTENSIONS;
    public static final int MAX_FILE_NAME_BYTES = 255;
    public static final int MAX_PATH_STRIP_DEPTH = 3;
    public static final String MIME_TYPE_HTML = "text/html";
    public static final Set<Integer> SELF_COLORED_ICONS;
    public static final String SHARED_CACHE_CLIP_EXTRA = "com.facebook.aura.shared_cache_clip";
    public static final String SPACE_EXPORT_ACTION = "download_space_export";
    public static final Set<Character> SPACE_EXPORT_NAME_SEPARATORS;
    public static final String TAG = "HatchFileUIUtils";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7354EnR(HatchFileUIUtils.class, "artifactsPathSegmentRaw", "getArtifactsPathSegmentRaw()Ljava/lang/String;", 0)};
    public static final HatchFileUIUtils INSTANCE = new HatchFileUIUtils();
    public static final C31u artifactsPathSegmentRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android.artifacts_path_segment);

    public final class ActivityIconColors {
        public static final int $stable = 0;
        public static final long AMBER;
        public static final long BLUE;
        public static final long CYAN;
        public static final long EMAIL_BLUE;
        public static final long EMERALD;
        public static final long FILE_PURPLE;
        public static final long GIT_ORANGE;
        public static final long GOAL;
        public static final long HEARTBEAT_RED;
        public static final ActivityIconColors INSTANCE = new ActivityIconColors();
        public static final long MESSAGE_BLUE;
        public static final long ORANGE;
        public static final long PINK;
        public static final long REMINDER_ORANGE;
        public static final long RUN_GREEN;
        public static final long SEARCH_GRAY;
        public static final long VIOLET;

        static {
            long j = B6A.A01;
            EMAIL_BLUE = 4278215892L << 32;
            FILE_PURPLE = 4286276095L << 32;
            GIT_ORANGE = 4293939512L << 32;
            MESSAGE_BLUE = 4278224127L << 32;
            REMINDER_ORANGE = 4294942474L << 32;
            SEARCH_GRAY = 4285033070L << 32;
            RUN_GREEN = 4280660313L << 32;
            HEARTBEAT_RED = 4294916912L << 32;
            BLUE = 4282090230L << 32;
            VIOLET = 4287323382L << 32;
            EMERALD = 4279286145L << 32;
            ORANGE = 4294538006L << 32;
            PINK = 4293675161L << 32;
            CYAN = 4278630100L << 32;
            AMBER = 4294286859L << 32;
            GOAL = 4279308561L << 32;
        }

        /* renamed from: getAMBER-0d7_KjU, reason: not valid java name */
        public final long m864getAMBER0d7_KjU() {
            return AMBER;
        }

        /* renamed from: getBLUE-0d7_KjU, reason: not valid java name */
        public final long m865getBLUE0d7_KjU() {
            return BLUE;
        }

        /* renamed from: getCYAN-0d7_KjU, reason: not valid java name */
        public final long m866getCYAN0d7_KjU() {
            return CYAN;
        }

        /* renamed from: getEMAIL_BLUE-0d7_KjU, reason: not valid java name */
        public final long m867getEMAIL_BLUE0d7_KjU() {
            return EMAIL_BLUE;
        }

        /* renamed from: getEMERALD-0d7_KjU, reason: not valid java name */
        public final long m868getEMERALD0d7_KjU() {
            return EMERALD;
        }

        /* renamed from: getFILE_PURPLE-0d7_KjU, reason: not valid java name */
        public final long m869getFILE_PURPLE0d7_KjU() {
            return FILE_PURPLE;
        }

        /* renamed from: getGIT_ORANGE-0d7_KjU, reason: not valid java name */
        public final long m870getGIT_ORANGE0d7_KjU() {
            return GIT_ORANGE;
        }

        /* renamed from: getGOAL-0d7_KjU, reason: not valid java name */
        public final long m871getGOAL0d7_KjU() {
            return GOAL;
        }

        /* renamed from: getHEARTBEAT_RED-0d7_KjU, reason: not valid java name */
        public final long m872getHEARTBEAT_RED0d7_KjU() {
            return HEARTBEAT_RED;
        }

        /* renamed from: getMESSAGE_BLUE-0d7_KjU, reason: not valid java name */
        public final long m873getMESSAGE_BLUE0d7_KjU() {
            return MESSAGE_BLUE;
        }

        /* renamed from: getORANGE-0d7_KjU, reason: not valid java name */
        public final long m874getORANGE0d7_KjU() {
            return ORANGE;
        }

        /* renamed from: getPINK-0d7_KjU, reason: not valid java name */
        public final long m875getPINK0d7_KjU() {
            return PINK;
        }

        /* renamed from: getREMINDER_ORANGE-0d7_KjU, reason: not valid java name */
        public final long m876getREMINDER_ORANGE0d7_KjU() {
            return REMINDER_ORANGE;
        }

        /* renamed from: getRUN_GREEN-0d7_KjU, reason: not valid java name */
        public final long m877getRUN_GREEN0d7_KjU() {
            return RUN_GREEN;
        }

        /* renamed from: getSEARCH_GRAY-0d7_KjU, reason: not valid java name */
        public final long m878getSEARCH_GRAY0d7_KjU() {
            return SEARCH_GRAY;
        }

        /* renamed from: getVIOLET-0d7_KjU, reason: not valid java name */
        public final long m879getVIOLET0d7_KjU() {
            return VIOLET;
        }
    }

    public interface DownloadOutcome {

        public final class Failed implements DownloadOutcome {
            public static final int $stable = 0;
            public final String errorType;
            public final int messageRes;
            public final String reason;

            public final String getErrorType() {
                return this.errorType;
            }

            public final int getMessageRes() {
                return this.messageRes;
            }

            public final String getReason() {
                return this.reason;
            }

            public Failed(String str, int i, String str2) {
                AnonymousClass003.A0v(str, str2);
                this.errorType = str;
                this.messageRes = i;
                this.reason = str2;
            }

            public /* synthetic */ Failed(String str, int i, String str2, int i2, C06H c06h) {
                this(str, (i2 & 2) != 0 ? R.string._name_removed__res_0x7f121188 : i, (i2 & 4) != 0 ? str : str2);
            }
        }

        public final class Saved implements DownloadOutcome {
            public static final int $stable = 8;
            public final String mimeType;
            public final Uri uri;

            public final String getMimeType() {
                return this.mimeType;
            }

            public final Uri getUri() {
                return this.uri;
            }

            public Saved(Uri uri, String str) {
                AnonymousClass003.A0u(uri, str);
                this.uri = uri;
                this.mimeType = str;
            }
        }

        public final class SavedWithoutUri implements DownloadOutcome {
            public static final int $stable = 0;
            public static final SavedWithoutUri INSTANCE = new SavedWithoutUri();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SavedWithoutUri);
            }

            public String toString() {
                return "SavedWithoutUri";
            }

            public int hashCode() {
                return 896244857;
            }
        }
    }

    public final class FileExtensions {
        public static final int $stable = 0;
        public static final String MIME_TYPE_HTML = "text/html";
        public static final FileExtensions INSTANCE = new FileExtensions();
        public static final Set<String> TEXT = HatchMimeResolver.Extensions.TEXT;
        public static final Set<String> CODE = HatchMimeResolver.Extensions.CODE;
        public static final Set<String> IMAGE = HatchMimeResolver.Extensions.IMAGE;
        public static final Set<String> HTML = HatchMimeResolver.Extensions.HTML;
        public static final Set<String> PDF = HatchMimeResolver.Extensions.PDF;
        public static final Set<String> DOCUMENT = HatchMimeResolver.Extensions.DOCUMENT;
        public static final Set<String> SPREADSHEET = HatchMimeResolver.Extensions.SPREADSHEET;
        public static final Set<String> PRESENTATION = HatchMimeResolver.Extensions.PRESENTATION;
        public static final Set<String> AUDIO = HatchMimeResolver.Extensions.AUDIO;
        public static final Set<String> VIDEO = HatchMimeResolver.Extensions.VIDEO;
        public static final Set<String> MARKDOWN = HatchMimeResolver.Extensions.MARKDOWN;
        public static final Set<String> EDITABLE = HatchMimeResolver.Extensions.EDITABLE;
        public static final Set<String> IS_TEXT_FILE = HatchMimeResolver.Extensions.IS_TEXT_FILE;
        public static final Set<String> IS_MEDIA_FILE = HatchMimeResolver.Extensions.IS_MEDIA_FILE;

        public final boolean isHtml(String str, String str2, String str3) {
            C7384Etj.A0Y(str2, 1);
            if (!"text/html".equals(str) && !HTML.contains(C7BY.A0N(str2))) {
                if (str3 != null) {
                    String strA0W = C7BY.A0W(str3, HatchOpenGraphRepository.UNKNOWN_HOST, str3);
                    String strA0W2 = C7BY.A0W(strA0W, "#", strA0W);
                    if (C7BY.A0q(strA0W2, FGI.A0U(CustomConnectorRegisterRepositoryKt.ROOT_PATH, HatchFileUIUtils.INSTANCE.getArtifactsPathSegment(), CustomConnectorRegisterRepositoryKt.ROOT_PATH), false)) {
                        String strA0Z = C7BY.A0Z(strA0W2, '/');
                        String strA0V = C7BY.A0V(strA0Z, CustomConnectorRegisterRepositoryKt.ROOT_PATH, strA0Z);
                        if (strA0V.length() <= 0 || C7BY.A0q(strA0V, ".", false)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final boolean isPreviewableExtension(String str) {
            C7384Etj.A0Y(str, 0);
            String strA0u = AnonymousClass001.A0u(str);
            return strA0u.length() == 0 || IMAGE.contains(strA0u) || PDF.contains(strA0u) || TEXT.contains(strA0u) || CODE.contains(strA0u) || HTML.contains(strA0u) || MARKDOWN.contains(strA0u) || DOCUMENT.contains(strA0u) || PRESENTATION.contains(strA0u);
        }

        public final boolean isSvg(String str, String str2, String str3) {
            C7384Etj.A0Y(str2, 1);
            return HatchMimeResolver.INSTANCE.isSvg(str, str2, str3);
        }

        public final Set<String> getAUDIO() {
            return AUDIO;
        }

        public final Set<String> getCODE() {
            return CODE;
        }

        public final Set<String> getDOCUMENT() {
            return DOCUMENT;
        }

        public final Set<String> getEDITABLE() {
            return EDITABLE;
        }

        public final Set<String> getHTML() {
            return HTML;
        }

        public final Set<String> getIMAGE() {
            return IMAGE;
        }

        public final Set<String> getIS_MEDIA_FILE() {
            return IS_MEDIA_FILE;
        }

        public final Set<String> getIS_TEXT_FILE() {
            return IS_TEXT_FILE;
        }

        public final Set<String> getMARKDOWN() {
            return MARKDOWN;
        }

        public final Set<String> getPDF() {
            return PDF;
        }

        public final Set<String> getPRESENTATION() {
            return PRESENTATION;
        }

        public final Set<String> getSPREADSHEET() {
            return SPREADSHEET;
        }

        public final Set<String> getTEXT() {
            return TEXT;
        }

        public final Set<String> getVIDEO() {
            return VIDEO;
        }
    }

    /* loaded from: classes.dex */
    public final class Icons {
        public static final int $stable = 0;
        public static final int CHECKMARK = 2131231215;
        public static final int CHEVRON_LEFT = 2131231300;
        public static final int CHEVRON_RIGHT = 2131231307;
        public static final int FILE = 2131231416;
        public static final int GEAR = 2131231221;
        public static final Icons INSTANCE = new Icons();

        public final int getCHECKMARK() {
            return CHECKMARK;
        }

        public final int getCHEVRON_LEFT() {
            return CHEVRON_LEFT;
        }

        public final int getCHEVRON_RIGHT() {
            return CHEVRON_RIGHT;
        }

        public final int getFILE() {
            return FILE;
        }

        public final int getGEAR() {
            return GEAR;
        }
    }

    public final class StatusColors {
        public static final int $stable = 0;
        public static final long ERROR_RED;
        public static final StatusColors INSTANCE = new StatusColors();
        public static final long PARTIAL_ORANGE;
        public static final long SUCCESS_GREEN;

        static {
            long j = B6A.A01;
            SUCCESS_GREEN = 4280660313L << 32;
            PARTIAL_ORANGE = 4294942474L << 32;
            ERROR_RED = 4294916912L << 32;
        }

        /* renamed from: getERROR_RED-0d7_KjU, reason: not valid java name */
        public final long m880getERROR_RED0d7_KjU() {
            return ERROR_RED;
        }

        /* renamed from: getPARTIAL_ORANGE-0d7_KjU, reason: not valid java name */
        public final long m881getPARTIAL_ORANGE0d7_KjU() {
            return PARTIAL_ORANGE;
        }

        /* renamed from: getSUCCESS_GREEN-0d7_KjU, reason: not valid java name */
        public final long m882getSUCCESS_GREEN0d7_KjU() {
            return SUCCESS_GREEN;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils$copyFileToClipboard$2", f = "HatchFileUIUtils.kt", l = {872}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$copyFileToClipboard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<File, HtJ<? super Uri>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$relativePath = str;
            this.$fileName = str2;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.$relativePath, this.$fileName, this.$userSession, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchFileOperations.DownloadResult.Success success;
            File file = (File) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                Context context = this.$context;
                String str = this.$relativePath;
                String str2 = this.$fileName;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.L$0 = null;
                this.label = 1;
                obj = hatchFileOperations.downloadFileToCache(context, str, str2, abstractC3358CGz, file, LinkEncryptedPairingKt.LINK_COUNTER_MAX, this);
                if (obj != enumC10460Hji) {
                }
                return enumC10460Hji;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            enumC10460Hji = null;
            if ((obj instanceof HatchFileOperations.DownloadResult.Success) && (success = (HatchFileOperations.DownloadResult.Success) obj) != null) {
                try {
                    return C7Je.A01(success.localPath);
                } catch (SecurityException | UnsupportedOperationException unused) {
                    return null;
                }
            }
            return enumC10460Hji;
        }

        @Override // X.G0V
        public final Object invoke(File file, HtJ<? super Uri> htJ) {
            return ((AnonymousClass2) create(file, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils$copyLocalUriToClipboard$2", f = "HatchFileUIUtils.kt", l = {899}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$copyLocalUriToClipboard$2, reason: invalid class name and case insensitive filesystem */
    public final class C119082 extends AbstractC07127nr implements G0V<File, HtJ<? super Uri>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $localUri;
        public final /* synthetic */ String $safeName;
        public /* synthetic */ Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils$copyLocalUriToClipboard$2$1", f = "HatchFileUIUtils.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$copyLocalUriToClipboard$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Uri>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ File $directory;
            public final /* synthetic */ String $localUri;
            public final /* synthetic */ String $safeName;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, File file, String str2, Context context, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$localUri = str;
                this.$directory = file;
                this.$safeName = str2;
                this.$context = context;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$localUri, this.$directory, this.$safeName, this.$context, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) throws IOException {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                try {
                    Uri uriA01 = null;
                    try {
                        uriA01 = C7Je.A01(this.$localUri);
                    } catch (SecurityException | UnsupportedOperationException unused) {
                    }
                    if (uriA01 != null) {
                        File file = this.$directory;
                        file.mkdirs();
                        File fileA0O = C3cG.A0O(file, this.$safeName);
                        InputStream inputStreamOpenInputStream = this.$context.getContentResolver().openInputStream(uriA01);
                        if (inputStreamOpenInputStream != null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(fileA0O);
                                try {
                                    F0H.A00(inputStreamOpenInputStream, fileOutputStream);
                                    fileOutputStream.close();
                                    inputStreamOpenInputStream.close();
                                    return HatchFileProviderUtil.INSTANCE.getUriForFile(this.$context, fileA0O);
                                } finally {
                                }
                            } finally {
                            }
                        }
                    }
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Uri> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119082(String str, String str2, Context context, HtJ<? super C119082> htJ) {
            super(2, htJ);
            this.$localUri = str;
            this.$safeName = str2;
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C119082 c119082 = new C119082(this.$localUri, this.$safeName, this.$context, htJ);
            c119082.L$0 = obj;
            return c119082;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            File file = (File) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                C78T c78tA0s = AnonymousClass002.A0s(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$localUri, file, this.$safeName, this.$context, null);
                this.L$0 = null;
                this.label = 1;
                obj = GAo.A00(this, c78tA0s, anonymousClass1);
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

        @Override // X.G0V
        public final Object invoke(File file, HtJ<? super Uri> htJ) {
            return ((C119082) create(file, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils", f = "HatchFileUIUtils.kt", l = {924, 930, 930}, m = "copyStagedFileToClipboard", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$copyStagedFileToClipboard$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileUIUtils.this.copyStagedFileToClipboard(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils$copyStagedFileToClipboard$2", f = "HatchFileUIUtils.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$copyStagedFileToClipboard$2, reason: invalid class name and case insensitive filesystem */
    public final class C119092 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Object>, Object> {
        public final /* synthetic */ F1F $committed;
        public final /* synthetic */ String $stagingName;
        public final /* synthetic */ File $stagingRoot;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119092(F1F f1f, File file, String str, HtJ<? super C119092> htJ) {
            super(2, htJ);
            this.$committed = f1f;
            this.$stagingRoot = file;
            this.$stagingName = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C119092(this.$committed, this.$stagingRoot, this.$stagingName, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (!this.$committed.element) {
                return Boolean.valueOf(CEV.A03(C3cG.A0O(this.$stagingRoot, this.$stagingName)));
            }
            File[] fileArrListFiles = this.$stagingRoot.listFiles();
            if (fileArrListFiles == null) {
                return null;
            }
            String str = this.$stagingName;
            for (File file : fileArrListFiles) {
                if (file.getName().compareTo(str) < 0) {
                    CEV.A03(file);
                }
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<Object> htJ) {
            return ((C119092) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Object> htJ) {
            return invoke2(c3ux, (HtJ<Object>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils", f = "HatchFileUIUtils.kt", l = {640}, m = "downloadAndCreateShareIntent", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$downloadAndCreateShareIntent$1, reason: invalid class name and case insensitive filesystem */
    public final class C119101 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C119101(HtJ<? super C119101> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileUIUtils.this.downloadAndCreateShareIntent(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils$downloadExportHtml$2", f = "HatchFileUIUtils.kt", l = {AuraCelebrationBlastKt.CELEBRATION_TOTAL_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$downloadExportHtml$2, reason: invalid class name and case insensitive filesystem */
    public final class C119112 extends AbstractC07127nr implements G0U<HtJ<? super DownloadOutcome>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ G0V<G0U<? super InputStream, ? extends Uri>, HtJ<? super SpaceExportResult>, Object> $fetch;
        public final /* synthetic */ String $fileName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C119112(G0V<? super G0U<? super InputStream, ? extends Uri>, ? super HtJ<? super SpaceExportResult>, ? extends Object> g0v, Context context, String str, HtJ<? super C119112> htJ) {
            super(1, htJ);
            this.$fetch = g0v;
            this.$context = context;
            this.$fileName = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C119112(this.$fetch, this.$context, this.$fileName, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2;
            String str;
            String str2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i3 = this.label;
            if (i3 == 0) {
                Hwg.A00(obj);
                G0V<G0U<? super InputStream, ? extends Uri>, HtJ<? super SpaceExportResult>, Object> g0v = this.$fetch;
                HatchFileUIUtils$downloadExportHtml$2$result$1 hatchFileUIUtils$downloadExportHtml$2$result$1 = new HatchFileUIUtils$downloadExportHtml$2$result$1(this.$context, this.$fileName);
                this.label = 1;
                obj = g0v.invoke(hatchFileUIUtils$downloadExportHtml$2$result$1, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i3 != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SpaceExportResult spaceExportResult = (SpaceExportResult) obj;
            if (spaceExportResult instanceof SpaceExportResult.Saved) {
                return new DownloadOutcome.Saved(((SpaceExportResult.Saved) spaceExportResult).uri, "text/html");
            }
            if (C7384Etj.areEqual(spaceExportResult, SpaceExportResult.SaveFailed.INSTANCE)) {
                i2 = 6;
                str = null;
                str2 = "save_to_downloads_failed";
            } else {
                if (!C7384Etj.areEqual(spaceExportResult, SpaceExportResult.NotBuilt.INSTANCE)) {
                    if (!C7384Etj.areEqual(spaceExportResult, SpaceExportResult.NotExportable.INSTANCE)) {
                        if (C7384Etj.areEqual(spaceExportResult, SpaceExportResult.Failed.INSTANCE)) {
                            return new DownloadOutcome.Failed("export_fetch_failed", R.string._name_removed__res_0x7f121188, "export_fetch_failed");
                        }
                        throw C3cG.A0q();
                    }
                    i = R.string._name_removed__res_0x7f120fd6;
                    i2 = 4;
                    str = null;
                    str2 = "export_not_exportable";
                    return new DownloadOutcome.Failed(str2, i, str, i2, str);
                }
                i2 = 6;
                str = null;
                str2 = "export_not_built";
            }
            i = 0;
            return new DownloadOutcome.Failed(str2, i, str, i2, str);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super DownloadOutcome> htJ) {
            return ((C119112) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils$downloadFileWithToast$2", f = "HatchFileUIUtils.kt", l = {829}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$downloadFileWithToast$2, reason: invalid class name and case insensitive filesystem */
    public final class C119122 extends AbstractC07127nr implements G0U<HtJ<? super DownloadOutcome>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119122(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super C119122> htJ) {
            super(1, htJ);
            this.$context = context;
            this.$relativePath = str;
            this.$fileName = str2;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C119122(this.$context, this.$relativePath, this.$fileName, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
                Context context = this.$context;
                String str = this.$relativePath;
                String str2 = this.$fileName;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.label = 1;
                obj = hatchFileUIUtils.saveWorkspaceFile(context, str, str2, abstractC3358CGz, this);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super DownloadOutcome> htJ) {
            return ((C119122) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils", f = "HatchFileUIUtils.kt", l = {1097, 1113}, m = "downloadHtmlAsPdf", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$downloadHtmlAsPdf$1, reason: invalid class name and case insensitive filesystem */
    public final class C119131 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C119131(HtJ<? super C119131> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileUIUtils.this.downloadHtmlAsPdf(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils$downloadHtmlFile$2", f = "HatchFileUIUtils.kt", l = {1168, 1170}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$downloadHtmlFile$2, reason: invalid class name and case insensitive filesystem */
    public final class C119142 extends AbstractC07127nr implements G0U<HtJ<? super DownloadOutcome>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $htmlFileName;
        public final /* synthetic */ String $url;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public int label;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objFirstExistingFile = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
                List listMakePathCandidates = hatchFileUIUtils.makePathCandidates(hatchFileUIUtils.resolveHtmlFilePath(this.$url));
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.label = 1;
                objFirstExistingFile = hatchFileUIUtils.firstExistingFile(listMakePathCandidates, abstractC3358CGz, this);
                if (objFirstExistingFile == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        Hwg.A00(obj);
                    }
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            String str = (String) objFirstExistingFile;
            if (str == null) {
                return new DownloadOutcome.Failed("html_file_not_found", R.string._name_removed__res_0x7f121188, "html_file_not_found");
            }
            HatchFileUIUtils hatchFileUIUtils2 = HatchFileUIUtils.INSTANCE;
            Context context = this.$context;
            String str2 = this.$htmlFileName;
            AbstractC3358CGz abstractC3358CGz2 = this.$userSession;
            this.L$0 = null;
            this.label = 2;
            objFirstExistingFile = hatchFileUIUtils2.saveWorkspaceFile(context, str, str2, abstractC3358CGz2, this);
            return objFirstExistingFile == enumC10460Hji ? enumC10460Hji : objFirstExistingFile;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119142(String str, AbstractC3358CGz abstractC3358CGz, Context context, String str2, HtJ<? super C119142> htJ) {
            super(1, htJ);
            this.$url = str;
            this.$userSession = abstractC3358CGz;
            this.$context = context;
            this.$htmlFileName = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C119142(this.$url, this.$userSession, this.$context, this.$htmlFileName, htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super DownloadOutcome> htJ) {
            return ((C119142) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils", f = "HatchFileUIUtils.kt", l = {980}, m = "downloadMarkdownAsPdf", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$downloadMarkdownAsPdf$1, reason: invalid class name and case insensitive filesystem */
    public final class C119151 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C119151(HtJ<? super C119151> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileUIUtils.this.downloadMarkdownAsPdf(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils$downloadPeerSpaceExportHtml$2", f = "HatchFileUIUtils.kt", l = {1214}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$downloadPeerSpaceExportHtml$2, reason: invalid class name and case insensitive filesystem */
    public final class C119162 extends AbstractC07127nr implements G0V<G0U<? super InputStream, ? extends Uri>, HtJ<? super SpaceExportResult>, Object> {
        public final /* synthetic */ String $hostMuse;
        public final /* synthetic */ String $spaceId;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119162(AbstractC3358CGz abstractC3358CGz, String str, String str2, HtJ<? super C119162> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$hostMuse = str;
            this.$spaceId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C119162 c119162 = new C119162(this.$userSession, this.$hostMuse, this.$spaceId, htJ);
            c119162.L$0 = obj;
            return c119162;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            G0U<? super InputStream, ? extends Uri> g0u = (G0U) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchSpacesDataSource companion = HatchSpacesDataSource.Companion.getInstance(this.$userSession);
                String str = this.$hostMuse;
                String str2 = this.$spaceId;
                this.L$0 = null;
                this.label = 1;
                obj = companion.fetchPeerSpaceExportHtml(str, str2, g0u, this);
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

        @Override // X.G0V
        public final Object invoke(G0U<? super InputStream, ? extends Uri> g0u, HtJ<? super SpaceExportResult> htJ) {
            return ((C119162) create(g0u, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils$downloadSpaceExportHtml$2", f = "HatchFileUIUtils.kt", l = {1200}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$downloadSpaceExportHtml$2, reason: invalid class name and case insensitive filesystem */
    public final class C119172 extends AbstractC07127nr implements G0V<G0U<? super InputStream, ? extends Uri>, HtJ<? super SpaceExportResult>, Object> {
        public final /* synthetic */ String $slug;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119172(AbstractC3358CGz abstractC3358CGz, String str, HtJ<? super C119172> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$slug = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C119172 c119172 = new C119172(this.$userSession, this.$slug, htJ);
            c119172.L$0 = obj;
            return c119172;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            G0U<? super InputStream, ? extends Uri> g0u = (G0U) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchSpacesDataSource companion = HatchSpacesDataSource.Companion.getInstance(this.$userSession);
                String str = this.$slug;
                this.L$0 = null;
                this.label = 1;
                obj = companion.fetchSpaceExportHtml(str, g0u, this);
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

        @Override // X.G0V
        public final Object invoke(G0U<? super InputStream, ? extends Uri> g0u, HtJ<? super SpaceExportResult> htJ) {
            return ((C119172) create(g0u, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils", f = "HatchFileUIUtils.kt", l = {1178}, m = "firstExistingFile", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$firstExistingFile$1, reason: invalid class name and case insensitive filesystem */
    public final class C119181 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C119181(HtJ<? super C119181> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileUIUtils.this.firstExistingFile(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils", f = "HatchFileUIUtils.kt", l = {1334, 1343}, m = "readFirstAvailable", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$readFirstAvailable$1, reason: invalid class name and case insensitive filesystem */
    public final class C119191 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C119191(HtJ<? super C119191> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileUIUtils.this.readFirstAvailable(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils$readHtmlContent$2", f = "HatchFileUIUtils.kt", l = {1365}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$readHtmlContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119202 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ Long $maxBytes;
        public final /* synthetic */ String $url;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119202(String str, AbstractC3358CGz abstractC3358CGz, Long l, HtJ<? super C119202> htJ) {
            super(2, htJ);
            this.$url = str;
            this.$userSession = abstractC3358CGz;
            this.$maxBytes = l;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C119202(this.$url, this.$userSession, this.$maxBytes, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
                List listMakePathCandidates = hatchFileUIUtils.makePathCandidates(hatchFileUIUtils.resolveHtmlFilePath(this.$url));
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                Long l = this.$maxBytes;
                this.label = 1;
                obj = hatchFileUIUtils.readFirstAvailable(listMakePathCandidates, abstractC3358CGz, l, this);
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((C119202) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils", f = "HatchFileUIUtils.kt", l = {775}, m = "runDownloadWithToast", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$runDownloadWithToast$1, reason: invalid class name and case insensitive filesystem */
    public final class C119211 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C119211(HtJ<? super C119211> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileUIUtils.this.runDownloadWithToast(null, null, null, null, false, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils", f = "HatchFileUIUtils.kt", l = {712}, m = "saveToGoogleDrive", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$saveToGoogleDrive$1, reason: invalid class name and case insensitive filesystem */
    public final class C119221 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C119221(HtJ<? super C119221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileUIUtils.this.saveToGoogleDrive(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils", f = "HatchFileUIUtils.kt", l = {841}, m = "saveWorkspaceFile", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$saveWorkspaceFile$1, reason: invalid class name and case insensitive filesystem */
    public final class C119231 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C119231(HtJ<? super C119231> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileUIUtils.this.saveWorkspaceFile(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils", f = "HatchFileUIUtils.kt", l = {692}, m = "shareFileWithChooser", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$shareFileWithChooser$1, reason: invalid class name and case insensitive filesystem */
    public final class C119241 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C119241(HtJ<? super C119241> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileUIUtils.this.shareFileWithChooser(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadAndCreateShareIntent(android.content.Context r10, java.lang.String r11, java.lang.String r12, X.AbstractC3358CGz r13, X.HtJ<? super android.content.Intent> r14) {
        /*
            r9 = this;
            r5 = r10
            r3 = r14
            r7 = r12
            r6 = r11
            boolean r0 = r14 instanceof com.facebook.aura.file.utils.HatchFileUIUtils.C119101
            if (r0 == 0) goto L59
            r12 = r3
            com.facebook.aura.file.utils.HatchFileUIUtils$downloadAndCreateShareIntent$1 r12 = (com.facebook.aura.file.utils.HatchFileUIUtils.C119101) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r12.label = r2
        L16:
            java.lang.Object r4 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r12.label
            r0 = 1
            if (r1 == 0) goto L3c
            if (r1 != r0) goto Lb0
            java.lang.Object r7 = r12.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r12.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r12.L$0
            android.content.Context r5 = X.C60P.A02(r0, r4)
        L2f:
            com.facebook.aura.gateway.HatchFileOperations$DownloadResult r4 = (com.facebook.aura.gateway.HatchFileOperations.DownloadResult) r4
            boolean r0 = r4 instanceof com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Success
            r2 = 0
            if (r0 == 0) goto L95
            com.facebook.aura.gateway.HatchFileOperations$DownloadResult$Success r4 = (com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Success) r4
            java.lang.String r0 = r4.localPath
            r3 = 0
            goto L5f
        L3c:
            X.Hwg.A00(r4)
            com.facebook.aura.gateway.HatchFileOperations r4 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            r12.L$0 = r10
            r12.L$1 = r11
            r12.L$2 = r7
            r9 = 0
            r12.L$3 = r9
            r12.label = r0
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = r13
            java.lang.Object r4 = r4.downloadFileToCache(r5, r6, r7, r8, r9, r10, r12)
            if (r4 != r2) goto L2f
            return r2
        L59:
            com.facebook.aura.file.utils.HatchFileUIUtils$downloadAndCreateShareIntent$1 r12 = new com.facebook.aura.file.utils.HatchFileUIUtils$downloadAndCreateShareIntent$1
            r12.<init>(r14)
            goto L16
        L5f:
            android.net.Uri r3 = X.C7Je.A01(r0)     // Catch: java.lang.Throwable -> L63
        L63:
            if (r3 != 0) goto L70
            com.facebook.aura.file.utils.HatchShareDownloadLogger r7 = com.facebook.aura.file.utils.HatchShareDownloadLogger.INSTANCE
            java.lang.String r1 = r4.localPath
            java.lang.String r0 = "uri_parse_failed: localPath="
            java.lang.String r10 = X.FGI.A0M(r0, r1)
            goto L9f
        L70:
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r2 = X.C60P.A03(r0)
            java.lang.String r1 = r4.mimeType
            if (r1 == 0) goto L92
            java.lang.String r0 = "application/octet-stream"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L92
        L82:
            r2.setType(r1)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r2.putExtra(r0, r3)
            android.content.ContentResolver r0 = r5.getContentResolver()
            X.C60Q.A16(r0, r2, r3, r7)
            return r2
        L92:
        */
        //  java.lang.String r1 = "*/*"
        /*
            goto L82
        L95:
            boolean r0 = r4 instanceof com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Failed
            if (r0 == 0) goto Lab
            com.facebook.aura.file.utils.HatchShareDownloadLogger r7 = com.facebook.aura.file.utils.HatchShareDownloadLogger.INSTANCE
            com.facebook.aura.gateway.HatchFileOperations$DownloadResult$Failed r4 = (com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Failed) r4
            java.lang.String r10 = r4.message
        L9f:
            r11 = 0
            java.lang.String r8 = "download_to_cache"
            r9 = r6
            r7.logActionFailed(r8, r9, r10, r11)
            X.C60R.A0w(r5)
            return r2
        Lab:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        Lb0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.downloadAndCreateShareIntent(android.content.Context, java.lang.String, java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadExportHtml(Context context, String str, String str2, G0V<? super G0U<? super InputStream, ? extends Uri>, ? super HtJ<? super SpaceExportResult>, ? extends Object> g0v, HtJ<? super Unit> htJ) {
        Object objRunDownloadWithToast = runDownloadWithToast(context, SPACE_EXPORT_ACTION, str, str2, true, null, new C119112(g0v, context, str2, null), htJ);
        return objRunDownloadWithToast != EnumC10460Hji.A02 ? Unit.INSTANCE : objRunDownloadWithToast;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> makePathCandidates(String str) {
        String strA0Z = C7BY.A0Z(C7BY.A0a(str, '/'), '/');
        ArrayList arrayListA0y = AbstractC0885AGm.A0y(strA0Z);
        if (!AnonymousClass005.A1a(strA0Z, "workspace/")) {
            arrayListA0y.add(0, FGI.A0M("workspace/", strA0Z));
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = arrayListA0y.iterator();
        while (it.hasNext()) {
            List listA0e = C7BY.A0e(AnonymousClass005.A0j(it), CustomConnectorRegisterRepositoryKt.ROOT_PATH);
            ADq aDq = new ADq(0, Math.min(3, listA0e.size() - 1));
            ArrayList arrayListA0i = AnonymousClass003.A0i(aDq);
            Iterator<Integer> it2 = aDq.iterator();
            while (it2.hasNext()) {
                arrayListA0i.add(AbstractC06907md.A01(CustomConnectorRegisterRepositoryKt.ROOT_PATH, listA0e.subList(((BNt) it2).A00(), listA0e.size()), null));
            }
            AbstractC0882AGj.A0r(arrayListA0i, arrayListA0h);
        }
        return C3cG.A0m(arrayListA0h);
    }

    public final Object copyFileToClipboard(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, Function0<Boolean> function0, HtJ<? super Unit> htJ) {
        return C3cG.A0U(copyStagedFileToClipboard(context, str2, function0, new AnonymousClass2(context, str, str2, abstractC3358CGz, null), htJ));
    }

    public final boolean copyProviderUriToClipboard(Context context, Uri uri, String str, Function0<Boolean> function0) {
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A11(uri, str, function0, 1);
        if (!AnonymousClass003.A1Y(function0)) {
            return false;
        }
        ClipData clipDataNewUri = ClipData.newUri(context.getContentResolver(), str, uri);
        ClipDescription description = clipDataNewUri.getDescription();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putBoolean(SHARED_CACHE_CLIP_EXTRA, true);
        description.setExtras(persistableBundle);
        Object systemService = context.getSystemService(CLIPBOARD_STAGING_DIR);
        C7384Etj.A0Z(systemService, AnonymousClass000.A00(32));
        ((ClipboardManager) systemService).setPrimaryClip(clipDataNewUri);
        if (Build.VERSION.SDK_INT < 33) {
            ToastApi.INSTANCE.showToast(context.getString(R.string._name_removed__res_0x7f121183));
        }
        return true;
    }

    public final String displayNameForPath(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0R = C7BY.A0R(str, str, '/');
        if (!"index.html".equals(strA0R)) {
            return strA0R;
        }
        String strA0T = C7BY.A0T(str, str, '/');
        return C7BY.A0R(strA0T, strA0T, '/');
    }

    public final Object downloadFileWithToast(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, boolean z, HatchSaveLogOrigin hatchSaveLogOrigin, HtJ<? super Unit> htJ) {
        return C3cG.A0U(runDownloadWithToast(context, HatchDataExportLoggingKt.PHASE_DOWNLOAD, str, str2, z, hatchSaveLogOrigin, new C119122(context, str, str2, abstractC3358CGz, null), htJ));
    }

    public final Object downloadPeerSpaceExportHtml(Context context, String str, String str2, String str3, AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        return C3cG.A0U(downloadExportHtml(context, str2, spaceExportFileName(str3, str2), new C119162(abstractC3358CGz, str, str2, null), htJ));
    }

    public final Object downloadSpaceExportHtml(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        return C3cG.A0U(downloadExportHtml(context, str, spaceExportFileName(str2, str), new C119172(abstractC3358CGz, str, null), htJ));
    }

    public final String ensureWorkspacePrefix(String str) {
        C7384Etj.A0Y(str, 0);
        return !str.startsWith("workspace/") ? FGI.A0M("workspace/", str) : str;
    }

    public final String fileExtensionForPath(String str) {
        C7384Etj.A0Y(str, 0);
        return C7BY.A0R(C7BY.A0M(str), "", '.');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r1.equals(r0) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* renamed from: getActionIconColorValue-vNxB06k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m862getActionIconColorValuevNxB06k(com.facebook.aura.status.repo.ActivityAction r4) {
        /*
            r3 = this;
            r2 = 0
            X.C7384Etj.A0Y(r4, r2)
            java.lang.String r0 = r4.tag
            if (r0 == 0) goto L13
            java.lang.String r1 = X.AnonymousClass001.A0u(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1354792126: goto L1c;
                case -1077756671: goto L27;
                case -887328209: goto L2a;
                case -409807663: goto L2d;
                case -59919290: goto L36;
                case 200896764: goto L4c;
                case 1108864149: goto L57;
                default: goto L13;
            }
        L13:
            com.facebook.aura.status.repo.ActivityAction$ActivityType r0 = r3.getResolvedActivityType(r4)
            long r0 = r3.m861getActivityTypeIconColorvNxB06k(r0)
            return r0
        L1c:
            java.lang.String r0 = "config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.ActivityIconColors.GIT_ORANGE
            return r0
        L27:
            java.lang.String r0 = "memory"
            goto L59
        L2a:
            java.lang.String r0 = "system"
            goto L2f
        L2d:
            java.lang.String r0 = "task_run"
        L2f:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L62
            goto L13
        L36:
            java.lang.String r0 = "sub_agent"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            com.facebook.aura.status.repo.ActivityAction$ActivityStatus r0 = r4.status
            int r1 = r0.ordinal()
            if (r1 == r2) goto L65
            r0 = 2
            if (r1 != r0) goto L62
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.StatusColors.ERROR_RED
            return r0
        L4c:
            java.lang.String r0 = "heartbeat"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.ActivityIconColors.HEARTBEAT_RED
            return r0
        L57:
            java.lang.String r0 = "workspace"
        L59:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.ActivityIconColors.FILE_PURPLE
            return r0
        L62:
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.ActivityIconColors.SEARCH_GRAY
            return r0
        L65:
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.StatusColors.SUCCESS_GREEN
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.m862getActionIconColorValuevNxB06k(com.facebook.aura.status.repo.ActivityAction):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getActionIconRes(com.facebook.aura.status.repo.ActivityAction r3) {
        /*
            r2 = this;
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)
            java.lang.String r0 = r3.tag
            if (r0 == 0) goto L13
            java.lang.String r1 = X.AnonymousClass001.A0u(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1354792126: goto L49;
                case -1077756671: goto L3d;
                case -887328209: goto L3a;
                case -409807663: goto L37;
                case -59919290: goto L34;
                case 200896764: goto L28;
                case 1108864149: goto L1c;
                default: goto L13;
            }
        L13:
            com.facebook.aura.status.repo.ActivityAction$ActivityType r0 = r2.getResolvedActivityType(r3)
            int r0 = r2.getActivityTypeIconRes(r0)
            return r0
        L1c:
            java.lang.String r0 = "workspace"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 2131231158(0x7f0801b6, float:1.807839E38)
            return r0
        L28:
            java.lang.String r0 = "heartbeat"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 2131231173(0x7f0801c5, float:1.807842E38)
            return r0
        L34:
            java.lang.String r0 = "sub_agent"
            goto L3f
        L37:
            java.lang.String r0 = "task_run"
            goto L3f
        L3a:
            java.lang.String r0 = "system"
            goto L4b
        L3d:
            java.lang.String r0 = "memory"
        L3f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 2131231157(0x7f0801b5, float:1.8078387E38)
            return r0
        L49:
            java.lang.String r0 = "config"
        L4b:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            int r0 = com.facebook.aura.file.utils.HatchFileUIUtils.Icons.GEAR
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.getActionIconRes(com.facebook.aura.status.repo.ActivityAction):int");
    }

    public final String getActionSubTitle(ActivityAction activityAction) {
        C7384Etj.A0Y(activityAction, 0);
        String str = activityAction.summary;
        return str == null ? "" : str;
    }

    public final String getActionTitle(ActivityAction activityAction) {
        C7384Etj.A0Y(activityAction, 0);
        String str = activityAction.title;
        return str == null ? "" : str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r1.equals(r0) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* renamed from: getActivityActionIconColor-XeAY9LY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m863getActivityActionIconColorXeAY9LY(com.facebook.aura.status.repo.ActivityAction r4, X.BFM r5, int r6) {
        /*
            r3 = this;
            r2 = 0
            X.C7384Etj.A0Y(r4, r2)
            java.lang.String r0 = r4.tag
            if (r0 == 0) goto L13
            java.lang.String r1 = X.AnonymousClass001.A0u(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1354792126: goto L1c;
                case -1077756671: goto L27;
                case -887328209: goto L2a;
                case -409807663: goto L2d;
                case -59919290: goto L36;
                case 200896764: goto L4c;
                case 1108864149: goto L57;
                default: goto L13;
            }
        L13:
            com.facebook.aura.status.repo.ActivityAction$ActivityType r0 = r3.getResolvedActivityType(r4)
            long r0 = r3.m861getActivityTypeIconColorvNxB06k(r0)
            return r0
        L1c:
            java.lang.String r0 = "config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.ActivityIconColors.GIT_ORANGE
            return r0
        L27:
            java.lang.String r0 = "memory"
            goto L59
        L2a:
            java.lang.String r0 = "system"
            goto L2f
        L2d:
            java.lang.String r0 = "task_run"
        L2f:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L62
            goto L13
        L36:
            java.lang.String r0 = "sub_agent"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            com.facebook.aura.status.repo.ActivityAction$ActivityStatus r0 = r4.status
            int r1 = r0.ordinal()
            if (r1 == r2) goto L65
            r0 = 2
            if (r1 != r0) goto L62
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.StatusColors.ERROR_RED
            return r0
        L4c:
            java.lang.String r0 = "heartbeat"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.ActivityIconColors.HEARTBEAT_RED
            return r0
        L57:
            java.lang.String r0 = "workspace"
        L59:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.ActivityIconColors.FILE_PURPLE
            return r0
        L62:
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.ActivityIconColors.SEARCH_GRAY
            return r0
        L65:
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.StatusColors.SUCCESS_GREEN
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.m863getActivityActionIconColorXeAY9LY(com.facebook.aura.status.repo.ActivityAction, X.BFM, int):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getActivityActionIconRes(com.facebook.aura.status.repo.ActivityAction r3, X.BFM r4, int r5) {
        /*
            r2 = this;
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)
            java.lang.String r0 = r3.tag
            if (r0 == 0) goto L13
            java.lang.String r1 = X.AnonymousClass001.A0u(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1354792126: goto L49;
                case -1077756671: goto L3d;
                case -887328209: goto L3a;
                case -409807663: goto L37;
                case -59919290: goto L34;
                case 200896764: goto L28;
                case 1108864149: goto L1c;
                default: goto L13;
            }
        L13:
            com.facebook.aura.status.repo.ActivityAction$ActivityType r0 = r2.getResolvedActivityType(r3)
            int r0 = r2.getActivityTypeIconRes(r0)
            return r0
        L1c:
            java.lang.String r0 = "workspace"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 2131231158(0x7f0801b6, float:1.807839E38)
            return r0
        L28:
            java.lang.String r0 = "heartbeat"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 2131231173(0x7f0801c5, float:1.807842E38)
            return r0
        L34:
            java.lang.String r0 = "sub_agent"
            goto L3f
        L37:
            java.lang.String r0 = "task_run"
            goto L3f
        L3a:
            java.lang.String r0 = "system"
            goto L4b
        L3d:
            java.lang.String r0 = "memory"
        L3f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 2131231157(0x7f0801b5, float:1.8078387E38)
            return r0
        L49:
            java.lang.String r0 = "config"
        L4b:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            int r0 = com.facebook.aura.file.utils.HatchFileUIUtils.Icons.GEAR
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.getActivityActionIconRes(com.facebook.aura.status.repo.ActivityAction, X.BFM, int):int");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final int getActivityLabelRes(ActivityAction activityAction, BFM bfm, int i) {
        boolean zEquals;
        int i2;
        C7384Etj.A0Y(activityAction, 0);
        String str = activityAction.tag;
        if (str != null) {
            String strA0u = AnonymousClass001.A0u(str);
            switch (strA0u.hashCode()) {
                case -1354792126:
                    zEquals = strA0u.equals("config");
                    i2 = R.string._name_removed__res_0x7f12003f;
                    break;
                case -1077756671:
                    zEquals = strA0u.equals(AuraDeeplinkRouteMapper.MEMORY_ROUTE);
                    i2 = R.string._name_removed__res_0x7f120042;
                    break;
                case -887328209:
                    zEquals = strA0u.equals(PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SYSTEM);
                    i2 = R.string._name_removed__res_0x7f120043;
                    break;
                case 200896764:
                    zEquals = strA0u.equals("heartbeat");
                    i2 = R.string._name_removed__res_0x7f120041;
                    break;
                case 1108864149:
                    zEquals = strA0u.equals("workspace");
                    i2 = R.string._name_removed__res_0x7f120044;
                    break;
            }
            if (zEquals) {
                return i2;
            }
        }
        return R.string._name_removed__res_0x7f120040;
    }

    public final int getWorkspaceEntryIconRes(WorkspaceEntry workspaceEntry, BFM bfm, int i) {
        C7384Etj.A0Y(workspaceEntry, 0);
        return getWorkspaceEntryIconRes(workspaceEntry.type, workspaceEntry.getFileExtension(), bfm, (i << 3) & 896);
    }

    public final Long parseModifiedAt(String str) {
        if (str != null && str.length() != 0) {
            try {
                return Long.valueOf(C60Q.A05(str));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[PHI: r1
  0x003a: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v6 java.lang.String) binds: [B:7:0x0021, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[PHI: r4
  0x003f: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v2 java.lang.String) binds: [B:3:0x0011, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String resolvePreviewPathFromUrl(java.lang.String r8) {
        /*
            r7 = this;
            r6 = 0
            X.C7384Etj.A0Y(r8, r6)
            com.facebook.aura.gateway.WorkspaceUriResolver r5 = com.facebook.aura.gateway.WorkspaceUriResolver.INSTANCE
            java.lang.String r4 = "fs/raw/"
            r3 = 0
            boolean r0 = X.C7BY.A0q(r8, r4, r6)
            java.lang.String r1 = "?"
            java.lang.String r2 = "workspace/"
            if (r0 != 0) goto L3f
            java.lang.String r4 = "fs/thumbnail/"
            boolean r0 = X.C7BY.A0q(r8, r4, r6)
            if (r0 != 0) goto L3f
            java.lang.String r1 = "hatch-slides://"
            boolean r0 = r8.startsWith(r1)
            if (r0 != 0) goto L3a
            java.lang.String r1 = "sandbox://"
            boolean r0 = r8.startsWith(r1)
            if (r0 != 0) goto L3a
            boolean r0 = r8.startsWith(r2)
            if (r0 != 0) goto L47
            java.lang.String r0 = "://"
            boolean r0 = X.C7BY.A0q(r8, r0, r6)
            if (r0 == 0) goto L47
            return r3
        L3a:
            java.lang.String r8 = X.C7BY.A0K(r1, r8)
            goto L47
        L3f:
            java.lang.String r0 = X.C7BY.A0U(r8, r4, r8)
            java.lang.String r8 = X.C7BY.A0W(r0, r1, r0)
        L47:
            java.lang.String r1 = r5.decodeWorkspacePath(r8)
            boolean r0 = X.AnonymousClass005.A1a(r1, r2)
            if (r0 != 0) goto L55
            java.lang.String r1 = X.FGI.A0M(r2, r1)
        L55:
            java.lang.String r0 = r7.resolveWorkspacePath(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.resolvePreviewPathFromUrl(java.lang.String):java.lang.String");
    }

    public final String resolveWorkspacePath(String str) {
        StringBuilder sbA0x;
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0q(C7BY.A0V(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str), ".", false)) {
            return str;
        }
        if (str.startsWith(FGI.A0U("workspace/", getArtifactsPathSegment(), CustomConnectorRegisterRepositoryKt.ROOT_PATH))) {
            sbA0x = C60O.A0w();
        } else {
            if (!str.startsWith(FGI.A0M(getArtifactsPathSegment(), CustomConnectorRegisterRepositoryKt.ROOT_PATH))) {
                return str;
            }
            sbA0x = C60O.A0x("workspace/");
        }
        return C60P.A1M(str, "/index.html", sbA0x);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shareFileWithChooser(android.content.Context r8, java.lang.String r9, java.lang.String r10, X.AbstractC3358CGz r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            r7 = this;
            r3 = r12
            boolean r0 = r12 instanceof com.facebook.aura.file.utils.HatchFileUIUtils.C119241
            if (r0 == 0) goto L5a
            r12 = r3
            com.facebook.aura.file.utils.HatchFileUIUtils$shareFileWithChooser$1 r12 = (com.facebook.aura.file.utils.HatchFileUIUtils.C119241) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r12.label = r2
        L13:
            java.lang.Object r6 = r12.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r12.label
            java.lang.String r4 = "share"
            r3 = 1
            if (r0 == 0) goto L42
            if (r0 != r3) goto L60
            long r0 = r12.J$0
            java.lang.Object r9 = r12.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r12.L$0
            android.content.Context r8 = X.C60P.A02(r2, r6)
        L2c:
            android.content.Intent r6 = (android.content.Intent) r6
            if (r6 == 0) goto L3f
            X.7n4 r3 = X.C60Q.A0S()
            r2 = 0
            android.content.Intent r2 = android.content.Intent.createChooser(r6, r2)
            r3.A05(r8, r2)
            X.C60R.A0u(r0, r4, r9)
        L3f:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L42:
            long r0 = X.C60R.A05(r6, r4, r9, r10)
            r12.L$0 = r8
            r12.L$1 = r9
            r2 = 0
            r12.L$2 = r2
            r12.L$3 = r2
            r12.J$0 = r0
            r12.label = r3
            java.lang.Object r6 = r7.downloadAndCreateShareIntent(r8, r9, r10, r11, r12)
            if (r6 != r5) goto L2c
            return r5
        L5a:
            com.facebook.aura.file.utils.HatchFileUIUtils$shareFileWithChooser$1 r12 = new com.facebook.aura.file.utils.HatchFileUIUtils$shareFileWithChooser$1
            r12.<init>(r3)
            goto L13
        L60:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.shareFileWithChooser(android.content.Context, java.lang.String, java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ActivityAction.ActivityType.values().length];
            try {
                AnonymousClass005.A0v(ActivityAction.ActivityType.WEB_SEARCH, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ActivityAction.ActivityType.EMAIL_SENT, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ActivityAction.ActivityType.MESSAGE_SENT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ActivityAction.ActivityType.TASK_RUNNING, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ActivityAction.ActivityType.FILE_CREATED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ActivityAction.ActivityType.FILE_UPDATED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(ActivityAction.ActivityType.GIT_COMMIT, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(ActivityAction.ActivityType.GOAL, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(ActivityAction.ActivityType.REMINDER_SET, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(ActivityAction.ActivityType.RUN, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(ActivityAction.ActivityType.HEARTBEAT, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(ActivityAction.ActivityType.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ActivityAction.ActivityStatus.values().length];
            try {
                AnonymousClass005.A0v(ActivityAction.ActivityStatus.SUCCESS, iArr2, 1);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass005.A0v(ActivityAction.ActivityStatus.ERROR, iArr2, 2);
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        Integer numValueOf = Integer.valueOf(R.drawable.hatch_file_types_agentic_40);
        Integer numValueOf2 = Integer.valueOf(R.drawable.hatch_file_types_artifact_40);
        Integer numValueOf3 = Integer.valueOf(R.drawable.hatch_file_types_audio_40);
        Integer numValueOf4 = Integer.valueOf(R.drawable.hatch_file_types_buildartifact_40);
        Integer numValueOf5 = Integer.valueOf(R.drawable.hatch_file_types_calendar_40);
        Integer numValueOf6 = Integer.valueOf(R.drawable.hatch_file_types_check_40);
        Integer numValueOf7 = Integer.valueOf(R.drawable.hatch_file_types_clock_40);
        Integer numValueOf8 = Integer.valueOf(R.drawable.hatch_file_types_code_40);
        Integer numValueOf9 = Integer.valueOf(R.drawable.hatch_file_types_document_40);
        Integer numValueOf10 = Integer.valueOf(R.drawable.hatch_file_types_documentsearch_40);
        Integer numValueOf11 = Integer.valueOf(R.drawable.hatch_file_types_emailsent_40);
        Integer numValueOf12 = Integer.valueOf(R.drawable.hatch_file_types_excelspreadsheet_40);
        Integer numValueOf13 = Integer.valueOf(R.drawable.hatch_file_types_folder_40);
        Integer numValueOf14 = Integer.valueOf(R.drawable.hatch_file_types_folderopen_40);
        Integer numValueOf15 = Integer.valueOf(R.drawable.hatch_file_types_git_40);
        Integer numValueOf16 = Integer.valueOf(R.drawable.hatch_file_types_googleslides_40);
        Integer numValueOf17 = Integer.valueOf(R.drawable.hatch_file_types_heart_40);
        Integer numValueOf18 = Integer.valueOf(R.drawable.hatch_file_types_html_40);
        Integer numValueOf19 = Integer.valueOf(R.drawable.hatch_file_types_imagefallback_40);
        Integer numValueOf20 = Integer.valueOf(R.drawable.hatch_file_types_markdown_40);
        Integer numValueOf21 = Integer.valueOf(R.drawable.hatch_file_types_message_40);
        Integer numValueOf22 = Integer.valueOf(R.drawable.hatch_file_types_pdf_40);
        Integer numValueOf23 = Integer.valueOf(R.drawable.hatch_file_types_powerpoint_40);
        Integer numValueOf24 = Integer.valueOf(R.drawable.hatch_file_types_reminder_40);
        Integer numValueOf25 = Integer.valueOf(R.drawable.hatch_file_types_shield_40);
        Integer numValueOf26 = Integer.valueOf(R.drawable.hatch_file_types_todo_40);
        Integer numValueOf27 = Integer.valueOf(R.drawable.hatch_file_types_unknown_40);
        Integer numValueOf28 = Integer.valueOf(R.drawable.hatch_file_types_videofallback_40);
        Integer numValueOf29 = Integer.valueOf(R.drawable.hatch_file_types_worddocument_40);
        Integer numValueOf30 = Integer.valueOf(R.drawable.hatch_file_types_zip_40);
        Integer[] numArr = new Integer[30];
        System.arraycopy(new Integer[]{numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, numValueOf10, numValueOf11, numValueOf12, numValueOf13, numValueOf14, numValueOf15, numValueOf16, numValueOf17, numValueOf18, numValueOf19, numValueOf20, numValueOf21, numValueOf22, numValueOf23, numValueOf24, numValueOf25, numValueOf26, numValueOf27}, 0, numArr, 0, 27);
        System.arraycopy(new Integer[]{numValueOf28, numValueOf29, numValueOf30}, 0, numArr, 27, 3);
        SELF_COLORED_ICONS = BFI.A0H(numArr);
        KNOWN_FILE_EXTENSIONS = BFI.A0H(new String[]{"html", "htm", "pdf", "json", "xml", "txt", "md", "css", "js", "svg", "png", "jpg", "jpeg", "gif", "webp", "csv", "yaml", "yml", "toml"});
        SPACE_EXPORT_NAME_SEPARATORS = BFI.A0H(new Character[]{'/', '\\', Character.valueOf(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object copyStagedFileToClipboard(android.content.Context r12, java.lang.String r13, kotlin.jvm.functions.Function0<java.lang.Boolean> r14, X.G0V<? super java.io.File, ? super X.HtJ<? super android.net.Uri>, ? extends java.lang.Object> r15, X.HtJ<? super kotlin.Unit> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.copyStagedFileToClipboard(android.content.Context, java.lang.String, kotlin.jvm.functions.Function0, X.G0V, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object downloadFileWithToast$default(HatchFileUIUtils hatchFileUIUtils, Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, boolean z, HatchSaveLogOrigin hatchSaveLogOrigin, HtJ htJ, int i, Object obj) {
        boolean zA1Q = C60Q.A1Q(i & 16, z);
        if ((i & 32) != 0) {
            hatchSaveLogOrigin = null;
        }
        return hatchFileUIUtils.downloadFileWithToast(context, str, str2, abstractC3358CGz, zA1Q, hatchSaveLogOrigin, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:13:0x002e, B:21:0x003d], limit reached: 32 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0067 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object firstExistingFile(java.util.List<java.lang.String> r8, X.AbstractC3358CGz r9, X.HtJ<? super java.lang.String> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.file.utils.HatchFileUIUtils.C119181
            if (r0 == 0) goto L6a
            r6 = r10
            com.facebook.aura.file.utils.HatchFileUIUtils$firstExistingFile$1 r6 = (com.facebook.aura.file.utils.HatchFileUIUtils.C119181) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L3f
            if (r0 != r5) goto L70
            java.lang.Object r3 = r6.L$4
            java.lang.Object r2 = r6.L$3
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r0 = r6.L$1
            X.CGz r9 = X.C60O.A0D(r0, r1)
        L2a:
            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchFileOperations.StatResult.Success
            if (r0 == 0) goto L3d
            com.facebook.aura.gateway.HatchFileOperations$StatResult$Success r1 = (com.facebook.aura.gateway.HatchFileOperations.StatResult.Success) r1
            if (r1 == 0) goto L3d
            com.facebook.aura.gateway.HatchFileOperations$FileEntry r0 = r1.entry
            if (r0 == 0) goto L3d
            com.facebook.aura.gateway.HatchFileOperations$FileEntryType r1 = r0.type
        L38:
            com.facebook.aura.gateway.HatchFileOperations$FileEntryType r0 = com.facebook.aura.gateway.HatchFileOperations.FileEntryType.FILE
            if (r1 != r0) goto L46
            return r3
        L3d:
            r1 = r4
            goto L38
        L3f:
            X.Hwg.A00(r1)
            java.util.Iterator r2 = r8.iterator()
        L46:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r3 = r2.next()
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            com.facebook.aura.gateway.HatchFileOperations r0 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            r6.L$0 = r4
            r6.L$1 = r9
            r6.L$2 = r4
            r6.L$3 = r2
            r6.L$4 = r3
            r6.L$5 = r4
            r6.label = r5
            java.lang.Object r1 = r0.statFile(r1, r9, r6)
            if (r1 != r7) goto L2a
            return r7
        L6a:
            com.facebook.aura.file.utils.HatchFileUIUtils$firstExistingFile$1 r6 = new com.facebook.aura.file.utils.HatchFileUIUtils$firstExistingFile$1
            r6.<init>(r10)
            goto L12
        L70:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L75:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.firstExistingFile(java.util.List, X.CGz, X.HtJ):java.lang.Object");
    }

    private final String getArtifactsPathSegmentRaw() {
        return (String) artifactsPathSegmentRaw$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final ActivityAction.ActivityType getResolvedActivityType(ActivityAction activityAction) {
        ActivityGoal activityGoal;
        ActivityAction.ActivityType activityType = activityAction.type;
        String str = null;
        if (activityType == ActivityAction.ActivityType.GOAL && activityAction.status != ActivityAction.ActivityStatus.PENDING) {
            ActivityDetails activityDetails = activityAction.details;
            if (activityDetails != null && (activityGoal = activityDetails.goal) != null) {
                str = activityGoal.icon;
            }
            ActivityAction.ActivityType activityTypeGoalIconTypeFromRawValue = goalIconTypeFromRawValue(str);
            if (activityTypeGoalIconTypeFromRawValue != null) {
                return activityTypeGoalIconTypeFromRawValue;
            }
        }
        return activityType;
    }

    private final ActivityAction.ActivityType goalIconTypeFromRawValue(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -2051171067:
                if (str.equals("task_running")) {
                    return ActivityAction.ActivityType.TASK_RUNNING;
                }
                return null;
            case -1286114096:
                if (str.equals("message_sent")) {
                    return ActivityAction.ActivityType.MESSAGE_SENT;
                }
                return null;
            case -30792939:
                if (str.equals("reminder_set")) {
                    return ActivityAction.ActivityType.REMINDER_SET;
                }
                return null;
            case 3178259:
                if (str.equals(ReplyAttributionSerializer.TYPE_GOAL)) {
                    return ActivityAction.ActivityType.GOAL;
                }
                return null;
            case 791101688:
                if (str.equals("file_updated")) {
                    return ActivityAction.ActivityType.FILE_UPDATED;
                }
                return null;
            case 1019277555:
                if (str.equals("web_search")) {
                    return ActivityAction.ActivityType.WEB_SEARCH;
                }
                return null;
            case 1318657627:
                if (str.equals("email_sent")) {
                    return ActivityAction.ActivityType.EMAIL_SENT;
                }
                return null;
            case 2054086437:
                if (str.equals("file_created")) {
                    return ActivityAction.ActivityType.FILE_CREATED;
                }
                return null;
            case 2085979716:
                if (str.equals("git_commit")) {
                    return ActivityAction.ActivityType.GIT_COMMIT;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r0 <= r11) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3 A[RETURN] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Number] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00a0 -> B:21:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00b4 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readFirstAvailable(java.util.List<java.lang.String> r12, X.AbstractC3358CGz r13, java.lang.Long r14, X.HtJ<? super java.lang.String> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.facebook.aura.file.utils.HatchFileUIUtils.C119191
            if (r0 == 0) goto Lb7
            r8 = r15
            com.facebook.aura.file.utils.HatchFileUIUtils$readFirstAvailable$1 r8 = (com.facebook.aura.file.utils.HatchFileUIUtils.C119191) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb7
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r3 = r8.result
            X.Hji r10 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r9 = 2
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L4c
            if (r0 == r7) goto L74
            if (r0 != r9) goto Lbe
            java.lang.Object r5 = r8.L$3
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r14 = r8.L$2
            java.lang.Number r14 = (java.lang.Number) r14
            java.lang.Object r0 = r8.L$1
            X.CGz r13 = X.C60O.A0D(r0, r3)
        L2f:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L53
            boolean r0 = X.C7BY.A0j(r3)
            if (r0 != 0) goto L53
            if (r14 == 0) goto L4b
            int r0 = r3.length()
            long r0 = (long) r0
            r11 = 2
            long r0 = r0 * r11
            long r11 = r14.longValue()
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L53
        L4b:
            return r3
        L4c:
            X.Hwg.A00(r3)
            java.util.Iterator r5 = r12.iterator()
        L53:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lc3
            java.lang.String r11 = X.AnonymousClass005.A0j(r5)
            if (r14 == 0) goto La2
            com.facebook.aura.gateway.HatchFileOperations r0 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            r8.L$0 = r6
            r8.L$1 = r13
            r8.L$2 = r14
            r8.L$3 = r5
            r8.L$4 = r11
            r8.label = r7
            java.lang.Object r3 = r0.statFile(r11, r13, r8)
            if (r3 != r10) goto L86
            return r10
        L74:
            java.lang.Object r11 = r8.L$4
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r5 = r8.L$3
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r14 = r8.L$2
            java.lang.Number r14 = (java.lang.Number) r14
            java.lang.Object r0 = r8.L$1
            X.CGz r13 = X.C60O.A0D(r0, r3)
        L86:
            boolean r0 = r3 instanceof com.facebook.aura.gateway.HatchFileOperations.StatResult.Success
            if (r0 == 0) goto La2
            com.facebook.aura.gateway.HatchFileOperations$StatResult$Success r3 = (com.facebook.aura.gateway.HatchFileOperations.StatResult.Success) r3
            if (r3 == 0) goto La2
            com.facebook.aura.gateway.HatchFileOperations$FileEntry r0 = r3.entry
            if (r0 == 0) goto La2
            java.lang.Long r0 = r0.size
            if (r0 == 0) goto La2
            long r3 = r0.longValue()
            long r1 = r14.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L53
        La2:
            com.facebook.aura.gateway.HatchFileOperations r0 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            r8.L$0 = r6
            r8.L$1 = r13
            r8.L$2 = r14
            r8.L$3 = r5
            r8.L$4 = r6
            r8.label = r9
            java.lang.Object r3 = r0.readFile(r11, r13, r8)
            if (r3 != r10) goto L2f
            return r10
        Lb7:
            com.facebook.aura.file.utils.HatchFileUIUtils$readFirstAvailable$1 r8 = new com.facebook.aura.file.utils.HatchFileUIUtils$readFirstAvailable$1
            r8.<init>(r15)
            goto L12
        Lbe:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lc3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.readFirstAvailable(java.util.List, X.CGz, java.lang.Long, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object readFirstAvailable$default(HatchFileUIUtils hatchFileUIUtils, List list, AbstractC3358CGz abstractC3358CGz, Long l, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        return hatchFileUIUtils.readFirstAvailable(list, abstractC3358CGz, l, htJ);
    }

    public static /* synthetic */ Object readHtmlContent$default(HatchFileUIUtils hatchFileUIUtils, String str, AbstractC3358CGz abstractC3358CGz, Long l, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        return hatchFileUIUtils.readHtmlContent(str, abstractC3358CGz, l, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String resolveHtmlFilePath(String str) {
        String strNormalizeWorkspacePath = WorkspaceUriResolver.INSTANCE.normalizeWorkspacePath(str, null);
        if (strNormalizeWorkspacePath == null) {
            strNormalizeWorkspacePath = C7BY.A0W(str, HatchOpenGraphRepository.UNKNOWN_HOST, str);
        }
        return KNOWN_FILE_EXTENSIONS.contains(C7BY.A0N(C7BY.A0R(strNormalizeWorkspacePath, strNormalizeWorkspacePath, '/'))) ? strNormalizeWorkspacePath : FGI.A0M(C7BY.A0Z(strNormalizeWorkspacePath, '/'), "/index.html");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runDownloadWithToast(android.content.Context r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, boolean r19, com.facebook.aura.file.utils.HatchSaveLogOrigin r20, X.G0U<? super X.HtJ<? super com.facebook.aura.file.utils.HatchFileUIUtils.DownloadOutcome>, ? extends java.lang.Object> r21, X.HtJ<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.runDownloadWithToast(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, com.facebook.aura.file.utils.HatchSaveLogOrigin, X.G0U, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object runDownloadWithToast$default(HatchFileUIUtils hatchFileUIUtils, Context context, String str, String str2, String str3, boolean z, HatchSaveLogOrigin hatchSaveLogOrigin, G0U g0u, HtJ htJ, int i, Object obj) {
        if ((i & 32) != 0) {
            hatchSaveLogOrigin = null;
        }
        return hatchFileUIUtils.runDownloadWithToast(context, str, str2, str3, z, hatchSaveLogOrigin, g0u, htJ);
    }

    private final Uri saveToDownloads(Context context, String str, String str2, byte[] bArr) {
        return MarkdownPdfRenderer.INSTANCE.saveToDownloads(context, str, str2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveWorkspaceFile(android.content.Context r11, java.lang.String r12, java.lang.String r13, X.AbstractC3358CGz r14, X.HtJ<? super com.facebook.aura.file.utils.HatchFileUIUtils.DownloadOutcome> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.facebook.aura.file.utils.HatchFileUIUtils.C119231
            if (r0 == 0) goto L47
            r9 = r15
            com.facebook.aura.file.utils.HatchFileUIUtils$saveWorkspaceFile$1 r9 = (com.facebook.aura.file.utils.HatchFileUIUtils.C119231) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r9.label = r2
        L12:
            java.lang.Object r4 = r9.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L8c
            X.Hwg.A00(r4)
        L20:
            com.facebook.aura.gateway.HatchFileOperations$DownloadResult r4 = (com.facebook.aura.gateway.HatchFileOperations.DownloadResult) r4
            boolean r0 = r4 instanceof com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Success
            if (r0 == 0) goto L6e
            com.facebook.aura.gateway.HatchFileOperations$DownloadResult$Success r4 = (com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Success) r4
            java.lang.String r0 = r4.localPath
            r2 = 0
            goto L4d
        L2c:
            X.Hwg.A00(r4)
            com.facebook.aura.gateway.HatchFileOperations r4 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            r0 = 0
            r9.L$0 = r0
            r9.L$1 = r0
            r9.L$2 = r0
            r9.L$3 = r0
            r9.label = r1
            r5 = r11
            r6 = r12
            r8 = r13
            r7 = r14
            java.lang.Object r4 = r4.downloadFile(r5, r6, r7, r8, r9)
            if (r4 != r3) goto L20
            return r3
        L47:
            com.facebook.aura.file.utils.HatchFileUIUtils$saveWorkspaceFile$1 r9 = new com.facebook.aura.file.utils.HatchFileUIUtils$saveWorkspaceFile$1
            r9.<init>(r15)
            goto L12
        L4d:
            android.net.Uri r2 = X.C7Je.A01(r0)     // Catch: java.lang.Throwable -> L51
        L51:
            if (r2 == 0) goto L6b
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6b
            java.lang.String r1 = r4.mimeType
            if (r1 != 0) goto L65
        */
        //  java.lang.String r1 = "*/*"
        /*
        L65:
            com.facebook.aura.file.utils.HatchFileUIUtils$DownloadOutcome$Saved r0 = new com.facebook.aura.file.utils.HatchFileUIUtils$DownloadOutcome$Saved
            r0.<init>(r2, r1)
            return r0
        L6b:
            com.facebook.aura.file.utils.HatchFileUIUtils$DownloadOutcome$SavedWithoutUri r0 = com.facebook.aura.file.utils.HatchFileUIUtils.DownloadOutcome.SavedWithoutUri.INSTANCE
            return r0
        L6e:
            boolean r0 = r4 instanceof com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Failed
            if (r0 == 0) goto L87
            com.facebook.aura.gateway.HatchFileOperations$DownloadResult$Failed r4 = (com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Failed) r4
            java.lang.String r2 = r4.errorType
            java.lang.String r1 = r4.message
            java.lang.String r0 = "download_failed: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            r0 = 2131890568(0x7f121188, float:1.9415831E38)
            com.facebook.aura.file.utils.HatchFileUIUtils$DownloadOutcome$Failed r3 = new com.facebook.aura.file.utils.HatchFileUIUtils$DownloadOutcome$Failed
            r3.<init>(r2, r0, r1)
            return r3
        L87:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L8c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.saveWorkspaceFile(android.content.Context, java.lang.String, java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }

    private final String spaceExportFileName(String str, String str2) {
        String strA0l = str != null ? AnonymousClass002.A0l(str) : null;
        if (strA0l == null) {
            strA0l = "";
        }
        if (strA0l.length() == 0) {
            strA0l = AnonymousClass002.A0l(str2);
        }
        int length = strA0l.length();
        ArrayList arrayListA11 = C60O.A11(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = strA0l.charAt(i);
            if (SPACE_EXPORT_NAME_SEPARATORS.contains(Character.valueOf(cCharAt))) {
                cCharAt = '-';
            }
            arrayListA11.add(Character.valueOf(cCharAt));
        }
        String strTruncateToUtf8Bytes = truncateToUtf8Bytes(AnonymousClass002.A0l(AbstractC0878AGe.A0L("", "", "", arrayListA11, null)), 255 - C3cG.A1S(HTML_SUFFIX).length);
        return strTruncateToUtf8Bytes.length() == 0 ? "space.html" : FGI.A0M(strTruncateToUtf8Bytes, HTML_SUFFIX);
    }

    private final String truncateToUtf8Bytes(String str, int i) {
        Charset charset = DCl.A05;
        if (str.getBytes(charset).length <= i) {
            return str;
        }
        StringBuilder sbA0w = C60O.A0w();
        int i2 = 0;
        int length = 0;
        while (i2 < str.length()) {
            int iOffsetByCodePoints = str.offsetByCodePoints(i2, 1);
            length += str.substring(i2, iOffsetByCodePoints).getBytes(charset).length;
            if (length > i) {
                break;
            }
            sbA0w.append((CharSequence) str, i2, iOffsetByCodePoints);
            i2 = iOffsetByCodePoints;
        }
        return sbA0w.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de A[Catch: Exception -> 0x00f8, CancellationException -> 0x011c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x011c, blocks: (B:36:0x00ca, B:41:0x00de, B:29:0x00a5, B:49:0x00fc), top: B:74:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[Catch: Exception -> 0x011a, CancellationException -> 0x011c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x011c, blocks: (B:36:0x00ca, B:41:0x00de, B:29:0x00a5, B:49:0x00fc), top: B:74:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadHtmlAsPdf(android.content.Context r16, java.lang.String r17, java.lang.String r18, X.AbstractC3358CGz r19, X.HtJ<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.downloadHtmlAsPdf(android.content.Context, java.lang.String, java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }

    public final Object downloadHtmlFile(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        String strA0M = str2;
        if (!FileExtensions.HTML.contains(C7BY.A0N(strA0M))) {
            strA0M = FGI.A0M(strA0M, HTML_SUFFIX);
        }
        Object objRunDownloadWithToast = runDownloadWithToast(context, "download_html", str, strA0M, false, null, new C119142(str, abstractC3358CGz, context, strA0M, null), htJ);
        return objRunDownloadWithToast != EnumC10460Hji.A02 ? Unit.INSTANCE : objRunDownloadWithToast;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00be: ARITH (r20 I:long) = (r20v1 ?? I:long) - (r12 I:long) (LINE:190), block:B:27:0x00b6 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadMarkdownAsPdf(android.content.Context r17, java.lang.String r18, java.lang.String r19, X.AbstractC3358CGz r20, X.HtJ<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.downloadMarkdownAsPdf(android.content.Context, java.lang.String, java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String fileExtensionToLanguage(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.fileExtensionToLanguage(java.lang.String):java.lang.String");
    }

    public final String formatFileSize(Long l) {
        if (l == null) {
            return "0 B";
        }
        long jLongValue = l.longValue();
        if (jLongValue <= 0) {
            return "0 B";
        }
        String[] strArr = {"B", "KB", "MB", "GB"};
        double d = jLongValue;
        int i = 0;
        while (true) {
            if (d >= 1024.0d) {
                if (i >= 3) {
                    break;
                }
                d /= 1024.0d;
                i++;
            } else if (i == 0) {
                String str = strArr[i];
                StringBuilder sbA0w = C60O.A0w();
                sbA0w.append((int) d);
                return C60P.A1M(InviteCodeScratcherKt.CODE_SEPARATOR, str, sbA0w);
            }
        }
        return String.format(Locale.US, "%.1f %s", Arrays.copyOf(new Object[]{Double.valueOf(d), strArr[i]}, 2));
    }

    public final Set<Integer> getSELF_COLORED_ICONS() {
        return SELF_COLORED_ICONS;
    }

    public final boolean isSelfColoredIcon(int i) {
        return C60Q.A1W(SELF_COLORED_ICONS, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveToGoogleDrive(android.content.Context r12, java.lang.String r13, java.lang.String r14, X.AbstractC3358CGz r15, X.HtJ<? super kotlin.Unit> r16) {
        /*
            r11 = this;
            r3 = r16
            r8 = r13
            r7 = r12
            boolean r0 = r3 instanceof com.facebook.aura.file.utils.HatchFileUIUtils.C119221
            r6 = r11
            if (r0 == 0) goto L92
            r11 = r3
            com.facebook.aura.file.utils.HatchFileUIUtils$saveToGoogleDrive$1 r11 = (com.facebook.aura.file.utils.HatchFileUIUtils.C119221) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L92
            int r2 = r2 - r1
            r11.label = r2
        L17:
            java.lang.Object r3 = r11.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r11.label
            java.lang.String r12 = "save_to_google_drive"
            r4 = 1
            if (r0 == 0) goto L78
            if (r0 != r4) goto L98
            long r0 = r11.J$0
            java.lang.Object r8 = r11.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r11.L$0
            android.content.Context r7 = X.C60P.A02(r2, r3)
        L30:
            android.content.Intent r3 = (android.content.Intent) r3
            if (r3 == 0) goto L51
            java.lang.String r2 = "com.google.android.apps.docs"
            r3.setPackage(r2)
            android.content.pm.PackageManager r2 = r7.getPackageManager()
            android.content.ComponentName r2 = r3.resolveActivity(r2)
            if (r2 == 0) goto L54
            X.7mU r2 = X.C7mU.A00()
            X.7n2 r2 = r2.A02()
            r2.A05(r7, r3)
            X.C60R.A0u(r0, r12, r8)
        L51:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L54:
            com.facebook.aura.file.utils.HatchShareDownloadLogger r11 = com.facebook.aura.file.utils.HatchShareDownloadLogger.INSTANCE
            X.DK9 r2 = com.facebook.aura.file.utils.HatchShareDownloadLogger.clock
            long r15 = r2.now()
            long r15 = r15 - r0
            java.lang.String r14 = "drive_not_installed_fallback_to_chooser"
            r13 = r8
            r11.logActionFailed(r12, r13, r14, r15)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r3)
            r0 = 0
            r2.setPackage(r0)
            X.7n4 r1 = X.C60Q.A0S()
            android.content.Intent r0 = android.content.Intent.createChooser(r2, r0)
            r1.A05(r7, r0)
            goto L51
        L78:
            r9 = r14
            long r0 = X.C60R.A05(r3, r12, r13, r14)
            r11.L$0 = r7
            r11.L$1 = r13
            r2 = 0
            r11.L$2 = r2
            r11.L$3 = r2
            r11.J$0 = r0
            r11.label = r4
            r10 = r15
            java.lang.Object r3 = r6.downloadAndCreateShareIntent(r7, r8, r9, r10, r11)
            if (r3 != r5) goto L30
            return r5
        L92:
            com.facebook.aura.file.utils.HatchFileUIUtils$saveToGoogleDrive$1 r11 = new com.facebook.aura.file.utils.HatchFileUIUtils$saveToGoogleDrive$1
            r11.<init>(r3)
            goto L17
        L98:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HatchFileUIUtils.saveToGoogleDrive(android.content.Context, java.lang.String, java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }

    /* renamed from: getActivityTypeIconColor-vNxB06k, reason: not valid java name */
    private final long m861getActivityTypeIconColorvNxB06k(ActivityAction.ActivityType activityType) {
        switch (activityType.ordinal()) {
            case 0:
                return ActivityIconColors.VIOLET;
            case 1:
                return ActivityIconColors.ORANGE;
            case 2:
                return ActivityIconColors.EMERALD;
            case 3:
                return ActivityIconColors.PINK;
            case 4:
                return ActivityIconColors.GOAL;
            case 5:
                return ActivityIconColors.MESSAGE_BLUE;
            case 6:
                return ActivityIconColors.CYAN;
            case 7:
                return ActivityIconColors.AMBER;
            case 8:
                return ActivityIconColors.BLUE;
            case 9:
                return ActivityIconColors.RUN_GREEN;
            case 10:
                return ActivityIconColors.HEARTBEAT_RED;
            case 11:
                return ActivityIconColors.SEARCH_GRAY;
            default:
                throw C3cG.A0q();
        }
    }

    private final int getActivityTypeIconRes(ActivityAction.ActivityType activityType) {
        switch (activityType.ordinal()) {
            case 0:
                return R.drawable.hatch_file_types_emailsent_40;
            case 1:
            case 2:
                return R.drawable.hatch_file_types_artifact_40;
            case 3:
                return R.drawable.hatch_file_types_git_40;
            case 4:
                return R.drawable.hatch_file_types_todo_40;
            case 5:
                return R.drawable.hatch_file_types_message_40;
            case 6:
                return R.drawable.hatch_file_types_reminder_40;
            case 7:
            case 11:
                return R.drawable.hatch_file_types_agentic_40;
            case 8:
                return R.drawable.globe_search_outline_28;
            case 9:
                return R.drawable.hatch_file_types_check_40;
            case 10:
                return R.drawable.hatch_file_types_heart_40;
            default:
                throw C3cG.A0q();
        }
    }

    private final void notifyDownloadComplete(Context context, Uri uri, String str, String str2) {
        String strA04 = FXS.A03().A04(str2);
        boolean zSavesToGallery = HatchFileOperations.INSTANCE.savesToGallery(str);
        int i = R.string._name_removed__res_0x7f12118a;
        if (zSavesToGallery) {
            i = R.string._name_removed__res_0x7f12118b;
        }
        HatchDownloadCompletion.INSTANCE.onDownloadComplete(context, uri, str, str2, C60Q.A0b(context, strA04, i));
    }

    private final int utf8Size(String str) {
        return C3cG.A1S(str).length;
    }

    public final Object copyLocalUriToClipboard(Context context, String str, String str2, Function0<Boolean> function0, HtJ<? super Unit> htJ) {
        if (C7BY.A0j(str2)) {
            str2 = "image";
        }
        String name = new File(str2).getName();
        C7384Etj.A0X(name);
        return C3cG.A0U(copyStagedFileToClipboard(context, name, function0, new C119082(str, name, context, null), htJ));
    }

    public final String getArtifactsPathSegment() {
        String artifactsPathSegmentRaw = getArtifactsPathSegmentRaw();
        return artifactsPathSegmentRaw.length() == 0 ? "your_files" : artifactsPathSegmentRaw;
    }

    public final Object readHtmlContent(String str, AbstractC3358CGz abstractC3358CGz, Long l, HtJ<? super String> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C119202(str, abstractC3358CGz, l, null));
    }

    public final int getWorkspaceEntryIconRes(WorkspaceEntry.EntryType entryType, String str, BFM bfm, int i) {
        C7384Etj.A0Y(entryType, 0);
        if (entryType == WorkspaceEntry.EntryType.DIRECTORY) {
            return R.drawable.hatch_file_types_folder_40;
        }
        if ("md".equals(str)) {
            return R.drawable.hatch_file_types_markdown_40;
        }
        if (!"txt".equals(str) && !"text".equals(str) && !"rtf".equals(str)) {
            if (!"json".equals(str) && !"yaml".equals(str) && !"yml".equals(str) && !"toml".equals(str) && !"xml".equals(str) && !"plist".equals(str) && !"swift".equals(str) && !"ts".equals(str) && !"js".equals(str) && !"py".equals(str) && !"rs".equals(str) && !"go".equals(str) && !"rb".equals(str) && !"java".equals(str) && !"c".equals(str) && !"cpp".equals(str) && !"h".equals(str) && !"kt".equals(str) && !"php".equals(str) && !"sh".equals(str)) {
                if (AbstractC0878AGe.A0k(FileExtensions.IMAGE, str)) {
                    return R.drawable.hatch_file_types_imagefallback_40;
                }
                if ("pdf".equals(str)) {
                    return R.drawable.hatch_file_types_pdf_40;
                }
                if (!"doc".equals(str) && !"docx".equals(str)) {
                    if (!"xlsx".equals(str) && !"xls".equals(str) && !"csv".equals(str) && !"tsv".equals(str)) {
                        if (!"ppt".equals(str) && !"pptx".equals(str)) {
                            if (!"mp3".equals(str) && !"m4a".equals(str) && !"wav".equals(str) && !"ogg".equals(str) && !"aac".equals(str)) {
                                if (!"html".equals(str) && !"htm".equals(str) && !"css".equals(str)) {
                                    if ("mp4".equals(str) || "mov".equals(str) || "avi".equals(str) || "mkv".equals(str)) {
                                        return R.drawable.hatch_file_types_videofallback_40;
                                    }
                                    return ("zip".equals(str) || "rar".equals(str) || "tar".equals(str) || "gz".equals(str) || "7z".equals(str)) ? R.drawable.hatch_file_types_zip_40 : R.drawable.hatch_file_types_unknown_40;
                                }
                                return R.drawable.hatch_file_types_html_40;
                            }
                            return R.drawable.hatch_file_types_audio_40;
                        }
                        return R.drawable.hatch_file_types_powerpoint_40;
                    }
                    return R.drawable.hatch_file_types_excelspreadsheet_40;
                }
                return R.drawable.hatch_file_types_worddocument_40;
            }
            return R.drawable.hatch_file_types_code_40;
        }
        return R.drawable.hatch_file_types_document_40;
    }
}
