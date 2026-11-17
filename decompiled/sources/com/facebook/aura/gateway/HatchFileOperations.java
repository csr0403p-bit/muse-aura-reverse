package com.facebook.aura.gateway;

import X.AGH;
import X.AII;
import X.AIM;
import X.AbstractC07127nr;
import X.AbstractC07979sd;
import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.C7Je;
import X.C9jH;
import X.C9sU;
import X.C9tI;
import X.CEV;
import X.CFK;
import X.DCl;
import X.EnumC10460Hji;
import X.Ey9;
import X.F0H;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import com.facebook.aura.audio.podcast.PodcastPresentationResolver;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.file.core.HatchMimeResolver;
import com.facebook.aura.file.view.ArtifactFileActionMenuKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.model.ExternalLinkPresentationJsonKt;
import com.facebook.aura.model.HatchMessageKt;
import com.facebook.aura.network.api.HatchUrlSegments;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.state.NoNetworkException;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchHttpResponseBody;
import com.facebook.aura.network.transport.HatchMultipartFilePart;
import com.facebook.aura.network.transport.HatchMultipartPart;
import com.facebook.aura.network.transport.HatchRequestBody;
import com.facebook.aura.network.transport.HatchRequestCategory;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import com.facebook.aura.network.transport.HatchResponseBodyPolicy;
import com.facebook.aura.network.transport.HatchTransportException;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContextKt;
import com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker;
import com.facebook.aura.settings.HatchDataExportRepositoryKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.utils.MC;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchFileOperations {
    public static final int $stable = 0;
    public static final long MAX_STAGED_FILE_BYTES = 67108864;
    public static final long STAGED_FILE_MAX_AGE_MS = 3600000;
    public static final HatchFileOperations INSTANCE = new HatchFileOperations();
    public static final String[] SUPPORTED_ATTACHMENT_MIME_TYPES = HatchMimeResolver.SUPPORTED_ATTACHMENT_MIME_TYPES;

    public final class CountingOutputStream extends OutputStream {
        public long count;
        public final OutputStream delegate;
        public boolean writeFailed;

        public CountingOutputStream(OutputStream outputStream) {
            C7384Etj.A0Y(outputStream, 0);
            this.delegate = outputStream;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            C7384Etj.A0Y(bArr, 0);
            try {
                this.delegate.write(bArr, i, i2);
                this.count += i2;
            } catch (IOException e) {
                this.writeFailed = true;
                throw e;
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.delegate.flush();
        }

        public final long getCount() {
            return this.count;
        }

        public final boolean getWriteFailed() {
            return this.writeFailed;
        }

        private final void recordingFailure(Function0<Unit> function0) throws IOException {
            try {
                function0.invoke();
            } catch (IOException e) {
                this.writeFailed = true;
                throw e;
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            try {
                this.delegate.write(i);
                this.count++;
            } catch (IOException e) {
                this.writeFailed = true;
                throw e;
            }
        }
    }

    public interface ExclusiveWriteResult {

        public final class NotStarted implements ExclusiveWriteResult {
            public static final int $stable = 0;
            public static final NotStarted INSTANCE = new NotStarted();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NotStarted);
            }

            public String toString() {
                return "NotStarted";
            }

            public int hashCode() {
                return -1052564258;
            }
        }

        public final class Unknown implements ExclusiveWriteResult {
            public static final int $stable = 0;
            public static final Unknown INSTANCE = new Unknown();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Unknown);
            }

            public String toString() {
                return "Unknown";
            }

            public int hashCode() {
                return 1352855450;
            }
        }

        public final class Written implements ExclusiveWriteResult {
            public static final int $stable = 0;
            public final long bytesWritten;

            public final long getBytesWritten() {
                return this.bytesWritten;
            }

            public Written(long j) {
                this.bytesWritten = j;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class FileEntry extends C06G {
        public static final int $stable = 0;
        public final String modifiedAt;
        public final String name;
        public final Long size;
        public final FileEntryType type;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FileEntry) {
                    FileEntry fileEntry = (FileEntry) obj;
                    if (!C7384Etj.areEqual(this.name, fileEntry.name) || this.type != fileEntry.type || !C7384Etj.areEqual(this.size, fileEntry.size) || !C7384Etj.areEqual(this.modifiedAt, fileEntry.modifiedAt)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ FileEntry copy$default(FileEntry fileEntry, String str, FileEntryType fileEntryType, Long l, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fileEntry.name;
            }
            if ((i & 2) != 0) {
                fileEntryType = fileEntry.type;
            }
            if ((i & 4) != 0) {
                l = fileEntry.size;
            }
            if ((i & 8) != 0) {
                str2 = fileEntry.modifiedAt;
            }
            AnonymousClass003.A0u(str, fileEntryType);
            return new FileEntry(str, fileEntryType, l, str2);
        }

        public final String component1() {
            return this.name;
        }

        public final FileEntryType component2() {
            return this.type;
        }

        public final Long component3() {
            return this.size;
        }

        public final String component4() {
            return this.modifiedAt;
        }

        public final String getModifiedAt() {
            return this.modifiedAt;
        }

        public final String getName() {
            return this.name;
        }

        public final Long getSize() {
            return this.size;
        }

        public final FileEntryType getType() {
            return this.type;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0F(this.type, AnonymousClass001.A0G(this.name)) + AnonymousClass006.A0D(this.size)) * 31) + AnonymousClass005.A0H(this.modifiedAt);
        }

        public FileEntry(String str, FileEntryType fileEntryType, Long l, String str2) {
            AnonymousClass003.A0u(str, fileEntryType);
            this.name = str;
            this.type = fileEntryType;
            this.size = l;
            this.modifiedAt = str2;
        }

        public final FileEntry copy(String str, FileEntryType fileEntryType, Long l, String str2) {
            AnonymousClass003.A0u(str, fileEntryType);
            return new FileEntry(str, fileEntryType, l, str2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ FileEntry(String str, FileEntryType fileEntryType, Long l, String str2, int i, C06H c06h) {
            this(str, fileEntryType, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FileEntryType {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ FileEntryType[] $VALUES;
        public static final FileEntryType DIRECTORY;
        public static final FileEntryType FILE;

        static {
            FileEntryType fileEntryType = new FileEntryType("FILE", 0);
            FILE = fileEntryType;
            FileEntryType fileEntryType2 = new FileEntryType("DIRECTORY", 1);
            DIRECTORY = fileEntryType2;
            FileEntryType[] fileEntryTypeArr = {fileEntryType, fileEntryType2};
            $VALUES = fileEntryTypeArr;
            $ENTRIES = C3cG.A0w(fileEntryTypeArr);
        }

        public static Ey9<FileEntryType> getEntries() {
            return $ENTRIES;
        }

        public static FileEntryType valueOf(String str) {
            return (FileEntryType) Enum.valueOf(FileEntryType.class, str);
        }

        public static FileEntryType[] values() {
            return (FileEntryType[]) $VALUES.clone();
        }

        public FileEntryType(String str, int i) {
        }
    }

    public final class LibraryEntry extends C06G {
        public static final int $stable = 0;
        public final long modifiedMs;
        public final String name;
        public final String path;
        public final long size;

        public static /* synthetic */ LibraryEntry copy$default(LibraryEntry libraryEntry, String str, String str2, long j, long j2, int i, Object obj) {
            String str3 = str;
            String str4 = str2;
            long j3 = j;
            long j4 = j2;
            if ((i & 1) != 0) {
                str3 = libraryEntry.name;
            }
            if ((i & 2) != 0) {
                str4 = libraryEntry.path;
            }
            if ((i & 4) != 0) {
                j3 = libraryEntry.size;
            }
            if ((i & 8) != 0) {
                j4 = libraryEntry.modifiedMs;
            }
            AnonymousClass003.A0u(str3, str4);
            return new LibraryEntry(str3, str4, j3, j4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LibraryEntry) {
                    LibraryEntry libraryEntry = (LibraryEntry) obj;
                    if (!C7384Etj.areEqual(this.name, libraryEntry.name) || !C7384Etj.areEqual(this.path, libraryEntry.path) || this.size != libraryEntry.size || this.modifiedMs != libraryEntry.modifiedMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.path;
        }

        public final long component3() {
            return this.size;
        }

        public final long component4() {
            return this.modifiedMs;
        }

        public final String getModifiedAtIso() {
            long j = this.modifiedMs;
            if (j > 0) {
                return C60R.A0k("yyyy-MM-dd'T'HH:mm:ss'Z'").format(new Date(j));
            }
            return null;
        }

        public final long getModifiedMs() {
            return this.modifiedMs;
        }

        public final String getName() {
            return this.name;
        }

        public final String getNormalizedPath() {
            boolean zA1X = C60O.A1X(this.path, CustomConnectorRegisterRepositoryKt.ROOT_PATH);
            String str = this.path;
            return zA1X ? str.substring(1) : str;
        }

        public final String getPath() {
            return this.path;
        }

        public final long getSize() {
            return this.size;
        }

        public final Long getSizeOrNull() {
            long j = this.size;
            Long lValueOf = Long.valueOf(j);
            if (j <= 0) {
                return null;
            }
            return lValueOf;
        }

        public int hashCode() {
            return AnonymousClass006.A06(this.size, AnonymousClass005.A0I(this.path, AnonymousClass001.A0G(this.name))) + C3cG.A02(this.modifiedMs);
        }

        public LibraryEntry(String str, String str2, long j, long j2) {
            AnonymousClass003.A0u(str, str2);
            this.name = str;
            this.path = str2;
            this.size = j;
            this.modifiedMs = j2;
        }

        public final LibraryEntry copy(String str, String str2, long j, long j2) {
            AnonymousClass003.A0u(str, str2);
            return new LibraryEntry(str, str2, j, j2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LibraryPreset {
        public static final int $stable = 0;
        public static final LibraryPreset INSTANCE = new LibraryPreset();
        public static final String artifacts = "artifacts";
        public static final String media = "media";
        public static final String recents = "recents";
    }

    public final class MediaStoreDestination {
        public final Uri collection;
        public final String relativePath;

        public final Uri getCollection() {
            return this.collection;
        }

        public final String getRelativePath() {
            return this.relativePath;
        }

        public MediaStoreDestination(Uri uri, String str) {
            AnonymousClass003.A0u(uri, str);
            this.collection = uri;
            this.relativePath = str;
        }
    }

    public final class SpaceShareDisclosure extends C06G {
        public static final int $stable = 0;
        public final boolean containsChatHistory;
        public final boolean containsPersonalInformation;
        public final boolean containsSecretsOrCredentials;
        public final boolean containsUserSharedMedia;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SpaceShareDisclosure) {
                    SpaceShareDisclosure spaceShareDisclosure = (SpaceShareDisclosure) obj;
                    if (this.containsPersonalInformation != spaceShareDisclosure.containsPersonalInformation || this.containsChatHistory != spaceShareDisclosure.containsChatHistory || this.containsUserSharedMedia != spaceShareDisclosure.containsUserSharedMedia || this.containsSecretsOrCredentials != spaceShareDisclosure.containsSecretsOrCredentials) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SpaceShareDisclosure copy$default(SpaceShareDisclosure spaceShareDisclosure, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = spaceShareDisclosure.containsPersonalInformation;
            }
            if ((i & 2) != 0) {
                z2 = spaceShareDisclosure.containsChatHistory;
            }
            if ((i & 4) != 0) {
                z3 = spaceShareDisclosure.containsUserSharedMedia;
            }
            if ((i & 8) != 0) {
                z4 = spaceShareDisclosure.containsSecretsOrCredentials;
            }
            return new SpaceShareDisclosure(z, z2, z3, z4);
        }

        public final boolean component1() {
            return this.containsPersonalInformation;
        }

        public final boolean component2() {
            return this.containsChatHistory;
        }

        public final boolean component3() {
            return this.containsUserSharedMedia;
        }

        public final boolean component4() {
            return this.containsSecretsOrCredentials;
        }

        public final SpaceShareDisclosure copy(boolean z, boolean z2, boolean z3, boolean z4) {
            return new SpaceShareDisclosure(z, z2, z3, z4);
        }

        public final boolean getContainsChatHistory() {
            return this.containsChatHistory;
        }

        public final boolean getContainsPersonalInformation() {
            return this.containsPersonalInformation;
        }

        public final boolean getContainsSecretsOrCredentials() {
            return this.containsSecretsOrCredentials;
        }

        public final boolean getContainsUserSharedMedia() {
            return this.containsUserSharedMedia;
        }

        public final boolean getHasWarning() {
            return this.containsPersonalInformation || this.containsChatHistory || this.containsUserSharedMedia || this.containsSecretsOrCredentials;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A02(this.containsPersonalInformation), this.containsChatHistory), this.containsUserSharedMedia), this.containsSecretsOrCredentials);
        }

        public SpaceShareDisclosure(boolean z, boolean z2, boolean z3, boolean z4) {
            this.containsPersonalInformation = z;
            this.containsChatHistory = z2;
            this.containsUserSharedMedia = z3;
            this.containsSecretsOrCredentials = z4;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class StagedWorkspaceFile extends C06G {
        public static final int $stable = 8;
        public final String mimeType;
        public final Uri uri;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof StagedWorkspaceFile) {
                    StagedWorkspaceFile stagedWorkspaceFile = (StagedWorkspaceFile) obj;
                    if (!C7384Etj.areEqual(this.uri, stagedWorkspaceFile.uri) || !C7384Etj.areEqual(this.mimeType, stagedWorkspaceFile.mimeType)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ StagedWorkspaceFile copy$default(StagedWorkspaceFile stagedWorkspaceFile, Uri uri, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = stagedWorkspaceFile.uri;
            }
            if ((i & 2) != 0) {
                str = stagedWorkspaceFile.mimeType;
            }
            AnonymousClass003.A0u(uri, str);
            return new StagedWorkspaceFile(uri, str);
        }

        public final Uri component1() {
            return this.uri;
        }

        public final String component2() {
            return this.mimeType;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.mimeType, AnonymousClass005.A0E(this.uri));
        }

        public StagedWorkspaceFile(Uri uri, String str) {
            AnonymousClass003.A0u(uri, str);
            this.uri = uri;
            this.mimeType = str;
        }

        public final StagedWorkspaceFile copy(Uri uri, String str) {
            AnonymousClass003.A0u(uri, str);
            return new StagedWorkspaceFile(uri, str);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes.dex */
    public interface ThumbnailFetchOutcome {

        /* loaded from: classes3.dex */
        public final class NotFound implements ThumbnailFetchOutcome {
            public static final int $stable = 0;
            public static final NotFound INSTANCE = new NotFound();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NotFound);
            }

            public String toString() {
                return "NotFound";
            }

            public int hashCode() {
                return -1571910919;
            }
        }

        /* loaded from: classes3.dex */
        public final class Pending extends C06G implements ThumbnailFetchOutcome {
            public static final int $stable = 0;
            public final Long retryAfterSeconds;

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Pending) && C7384Etj.areEqual(this.retryAfterSeconds, ((Pending) obj).retryAfterSeconds));
            }

            public static /* synthetic */ Pending copy$default(Pending pending, Long l, int i, Object obj) {
                if ((i & 1) != 0) {
                    l = pending.retryAfterSeconds;
                }
                return new Pending(l);
            }

            public final Long component1() {
                return this.retryAfterSeconds;
            }

            public final Pending copy(Long l) {
                return new Pending(l);
            }

            public final Long getRetryAfterSeconds() {
                return this.retryAfterSeconds;
            }

            public int hashCode() {
                return AnonymousClass006.A0D(this.retryAfterSeconds);
            }

            public Pending(Long l) {
                this.retryAfterSeconds = l;
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success extends C06G implements ThumbnailFetchOutcome {
            public static final int $stable = 8;
            public final ThumbnailResult result;

            public Success(ThumbnailResult thumbnailResult) {
                C7384Etj.A0Y(thumbnailResult, 0);
                this.result = thumbnailResult;
            }

            public final Success copy(ThumbnailResult thumbnailResult) {
                C7384Etj.A0Y(thumbnailResult, 0);
                return new Success(thumbnailResult);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.result, ((Success) obj).result));
            }

            public static /* synthetic */ Success copy$default(Success success, ThumbnailResult thumbnailResult, int i, Object obj) {
                if ((i & 1) != 0) {
                    thumbnailResult = success.result;
                }
                C7384Etj.A0Y(thumbnailResult, 0);
                return new Success(thumbnailResult);
            }

            public final ThumbnailResult component1() {
                return this.result;
            }

            public final ThumbnailResult getResult() {
                return this.result;
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    /* loaded from: classes.dex */
    public final class ThumbnailResult {
        public static final int $stable = 8;
        public final byte[] bytes;
        public final String fileTitle;

        public ThumbnailResult(byte[] bArr, String str) {
            C7384Etj.A0Y(bArr, 0);
            this.bytes = bArr;
            this.fileTitle = str;
        }

        public final byte[] getBytes() {
            return this.bytes;
        }

        public final String getFileTitle() {
            return this.fileTitle;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$deleteFile$2", f = "HatchFileOperations.kt", l = {2653}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$deleteFile$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DeleteResult>, Object> {
        public final /* synthetic */ boolean $recursive;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, boolean z, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$relativePath = str;
            this.$recursive = z;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$relativePath, this.$recursive, this.$userSession, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
        
            if ("not_found".equals(r3) != false) goto L32;
         */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchFileOperations.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DeleteResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$downloadFile$2", f = "HatchFileOperations.kt", l = {2000, 2037, 2072}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$downloadFile$2, reason: invalid class name and case insensitive filesystem */
    public final class C120672 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DownloadResult>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120672(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120672> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$relativePath = str;
            this.$fileName = str2;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C120672 c120672 = new C120672(this.$context, this.$relativePath, this.$fileName, this.$userSession, htJ);
            c120672.L$0 = obj;
            return c120672;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0134 A[Catch: Exception -> 0x0194, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0194, blocks: (B:10:0x0036, B:15:0x0043, B:17:0x004e, B:14:0x0040, B:63:0x0190, B:64:0x0193, B:44:0x0134, B:50:0x0147, B:55:0x016d, B:57:0x0173, B:58:0x017c, B:49:0x0144, B:54:0x0169, B:30:0x00b0, B:32:0x00dd, B:34:0x00ee, B:37:0x00fe, B:47:0x013b, B:52:0x0152, B:8:0x002f, B:41:0x012c, B:42:0x012f, B:38:0x0108, B:61:0x018e, B:12:0x003b), top: B:72:0x001b, inners: #0, #1, #3, #4, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v27, types: [android.content.ContentResolver] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int, java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r2v11, types: [android.content.ContentResolver] */
        /* JADX WARN: Type inference failed for: r2v14, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4 */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 430
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchFileOperations.C120672.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DownloadResult> htJ) {
            return ((C120672) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$downloadFileToCache$2", f = "HatchFileOperations.kt", l = {1855, 1867}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$downloadFileToCache$2, reason: invalid class name and case insensitive filesystem */
    public final class C120682 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DownloadResult>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ File $directory;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ long $maxBytes;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120682(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, File file, long j, HtJ<? super C120682> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$relativePath = str;
            this.$fileName = str2;
            this.$userSession = abstractC3358CGz;
            this.$directory = file;
            this.$maxBytes = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C120682 c120682 = new C120682(this.$context, this.$relativePath, this.$fileName, this.$userSession, this.$directory, this.$maxBytes, htJ);
            c120682.L$0 = obj;
            return c120682;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00db A[Catch: Exception -> 0x0134, CancellationException -> 0x015c, TRY_ENTER, TryCatch #8 {CancellationException -> 0x015c, Exception -> 0x0134, blocks: (B:28:0x00db, B:33:0x00e8, B:35:0x00f5, B:40:0x0107, B:42:0x0116, B:39:0x0104, B:32:0x00e5, B:14:0x0058, B:15:0x005b, B:17:0x0069, B:18:0x0075, B:20:0x007b, B:21:0x007e, B:47:0x0130, B:48:0x0133, B:11:0x0040), top: B:71:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f5 A[Catch: Exception -> 0x0134, CancellationException -> 0x015c, TryCatch #8 {CancellationException -> 0x015c, Exception -> 0x0134, blocks: (B:28:0x00db, B:33:0x00e8, B:35:0x00f5, B:40:0x0107, B:42:0x0116, B:39:0x0104, B:32:0x00e5, B:14:0x0058, B:15:0x005b, B:17:0x0069, B:18:0x0075, B:20:0x007b, B:21:0x007e, B:47:0x0130, B:48:0x0133, B:11:0x0040), top: B:71:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r13v1, types: [T, java.io.File, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v0, types: [X.Hqv, int] */
        /* JADX WARN: Type inference failed for: r9v7, types: [java.io.Closeable] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchFileOperations.C120682.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DownloadResult> htJ) {
            return ((C120682) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$encodeRelativePath$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final CharSequence invoke(String str) throws UnsupportedEncodingException {
            C7384Etj.A0Y(str, 0);
            String strEncode = URLEncoder.encode(str, HatchWebPageParserKt.UTF_8);
            C7384Etj.A0U(strEncode);
            return AbstractC2159Azp.A0z(strEncode, "+", "%20");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$exportPdf$2", f = "HatchFileOperations.kt", l = {2628}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$exportPdf$2, reason: invalid class name and case insensitive filesystem */
    public final class C120692 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120692(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120692> htJ) {
            super(2, htJ);
            this.$relativePath = str;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120692(this.$relativePath, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            byte[] bArrBodyBytes;
            Object objMakeJarvisHttpRequestInternal = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(objMakeJarvisHttpRequestInternal);
                JarvisPath.FsExport fsExport = JarvisPath.FsExport.INSTANCE;
                FsExportRequestJson fsExportRequestJson = new FsExportRequestJson(this.$relativePath, "pdf");
                C9jH c9jHA0E = AGH.A0E();
                String strA02 = HatchJsonKt.HatchJson.A02(fsExportRequestJson, FsExportRequestJson$$serializer.INSTANCE);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = 1;
                this.label = 1;
                objMakeJarvisHttpRequestInternal = hatchHttpApiA06.makeJarvisHttpRequestInternal(fsExport, strA02, RequestType.POST, this.$userSession, C3cG.A0S(60L), null, new HxE[0], true, c9jHA0E, false, true, this);
                if (objMakeJarvisHttpRequestInternal == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objMakeJarvisHttpRequestInternal);
            }
            HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) objMakeJarvisHttpRequestInternal;
            if (hatchHttpResponse != null) {
                String strHeader = hatchHttpResponse.header("Content-Type");
                if (hatchHttpResponse.isSuccessful && strHeader != null && strHeader.startsWith("application/pdf")) {
                    try {
                        bArrBodyBytes = hatchHttpResponse.bodyBytes();
                    } catch (IOException e) {
                        CFK.A0A(HatchFileOperationsKt.TAG, "POST /fs/export body read failed", e);
                        bArrBodyBytes = null;
                    }
                    if (bArrBodyBytes != null && bArrBodyBytes.length != 0) {
                        return bArrBodyBytes;
                    }
                } else {
                    CFK.A06(HatchFileOperationsKt.TAG, FGI.A0W("POST /fs/export returned HTTP ", " type=", strHeader, hatchHttpResponse.statusCode));
                }
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
            return ((C120692) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$fetchArtifactUrl$2", f = "HatchFileOperations.kt", l = {2629}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$fetchArtifactUrl$2, reason: invalid class name and case insensitive filesystem */
    public final class C120702 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super FetchArtifactUrlResult>, Object> {
        public final /* synthetic */ String $projectDir;
        public final /* synthetic */ AbstractC3358CGz $userSession;
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
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120702(AbstractC3358CGz abstractC3358CGz, String str, HtJ<? super C120702> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$projectDir = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120702(this.$userSession, this.$projectDir, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            String message;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
                JarvisPath.ArtifactsFetchUrl artifactsFetchUrl = JarvisPath.ArtifactsFetchUrl.INSTANCE;
                RequestType requestType = RequestType.GET;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                HxE<String, ? extends Object>[] hxEArr = {C3cG.A0r("project_dir", this.$projectDir)};
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchFileOperations$fetchArtifactUrl$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchFileOperations$fetchArtifactUrl$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchFileOperations$fetchArtifactUrl$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApiA06.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchFileOperations$fetchArtifactUrl$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, artifactsFetchUrl, requestType, abstractC3358CGz, null, hxEArr, null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            Throwable thA00 = HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
            if (thA00 == null) {
                ArtifactFetchUrlPayloadJson artifactFetchUrlPayloadJson = (ArtifactFetchUrlPayloadJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
                String str = artifactFetchUrlPayloadJson.url;
                if (str.length() != 0 && !HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(str)) {
                    String str2 = artifactFetchUrlPayloadJson.last_updated;
                    if (str2.length() == 0 || HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(str2)) {
                        str2 = null;
                    }
                    return new FetchArtifactUrlResult.Success(str, str2);
                }
                message = "No deployed URL found";
            } else {
                message = thA00.getMessage();
                if (message == null) {
                    message = "Failed to execute request";
                }
            }
            return new FetchArtifactUrlResult.Failed(message);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super FetchArtifactUrlResult> htJ) {
            return ((C120702) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$fetchMediaBytes$2", f = "HatchFileOperations.kt", l = {374}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$fetchMediaBytes$2, reason: invalid class name and case insensitive filesystem */
    public final class C120712 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ Long $timeoutSeconds;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120712(String str, AbstractC3358CGz abstractC3358CGz, Long l, HtJ<? super C120712> htJ) {
            super(2, htJ);
            this.$relativePath = str;
            this.$userSession = abstractC3358CGz;
            this.$timeoutSeconds = l;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120712(this.$relativePath, this.$userSession, this.$timeoutSeconds, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String strEncodeRelativePath = HatchFileOperations.INSTANCE.encodeRelativePath(this.$relativePath);
                this.L$0 = null;
                this.label = 1;
                obj = HatchHttpApi.INSTANCE.makeJarvisHttpRequest__EXCEPTIONAL_USE_CASES_ONLY(new JarvisPath.FsRaw(strEncodeRelativePath), RequestType.GET, this.$userSession, this.$timeoutSeconds, new HxE[0], null, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) obj;
            if (hatchHttpResponse == null) {
                CFK.A04(HatchFileOperationsKt.TAG, "Failed to execute Jarvis HTTP request for fs/raw");
                return null;
            }
            String str = this.$relativePath;
            try {
                int i2 = hatchHttpResponse.statusCode;
                if (200 > i2 || i2 >= 300) {
                    CFK.A06(HatchFileOperationsKt.TAG, FGI.A0W("GET /fs/raw/ returned HTTP ", " for ", str, i2));
                    return null;
                }
                HatchHttpResponseBody hatchHttpResponseBodyBody = hatchHttpResponse.body();
                byte[] bArrBytes = hatchHttpResponseBodyBody != null ? hatchHttpResponseBodyBody.bytes() : null;
                if (bArrBytes != null && bArrBytes.length != 0) {
                    return bArrBytes;
                }
                C3cG.A1G("GET /fs/raw/ returned empty body for ", this.$relativePath, HatchFileOperationsKt.TAG);
                return null;
            } catch (Exception e) {
                CFK.A08(HatchFileOperationsKt.TAG, C60P.A1L("GET /fs/raw/ failed for ", this.$relativePath, e.getMessage()), e);
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
            return ((C120712) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$fetchMediaPrefixBytes$2", f = "HatchFileOperations.kt", l = {2653}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$fetchMediaPrefixBytes$2, reason: invalid class name and case insensitive filesystem */
    public final class C120722 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
        public final /* synthetic */ int $maxBytes;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120722(String str, int i, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120722> htJ) {
            super(2, htJ);
            this.$relativePath = str;
            this.$maxBytes = i;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120722(this.$relativePath, this.$maxBytes, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            String str;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    Set<Integer> setA18 = AnonymousClass004.A18();
                    C9jH c9jHA0E = AGH.A0E();
                    HatchFileOperations$fetchMediaPrefixBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchFileOperations$fetchMediaPrefixBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchFileOperations$fetchMediaPrefixBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                    HatchFileOperations$fetchMediaPrefixBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchFileOperations$fetchMediaPrefixBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchFileOperations$fetchMediaPrefixBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = 1;
                    this.I$1 = 1;
                    this.I$2 = 0;
                    this.I$3 = 1;
                    this.I$4 = 0;
                    this.I$5 = 0;
                    this.I$6 = 0;
                    this.label = 1;
                    objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(hatchFileOperations$fetchMediaPrefixBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchFileOperations$fetchMediaPrefixBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, JarvisPath.FsRead.INSTANCE, new FsReadRequestJson(this.$relativePath, 0L, this.$maxBytes), RequestType.POST, this.$userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                    if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
                }
                if (objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud) {
                    objM1599executeJarvisRequestWithFof5HsY = null;
                }
                FsReadPayloadJson fsReadPayloadJson = (FsReadPayloadJson) objM1599executeJarvisRequestWithFof5HsY;
                if (fsReadPayloadJson == null || (str = fsReadPayloadJson.data_base64) == null) {
                    return null;
                }
                return Base64.decode(str, 0);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(HatchFileOperationsKt.TAG, FGI.A0M("fs/read prefix fetch failed: ", e2.getMessage()), e2);
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
            return ((C120722) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$fetchMediaToFile$2", f = "HatchFileOperations.kt", l = {528}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$fetchMediaToFile$2, reason: invalid class name and case insensitive filesystem */
    public final class C120732 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ File $targetFile;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120732(File file, String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120732> htJ) {
            super(2, htJ);
            this.$targetFile = file;
            this.$relativePath = str;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C120732 c120732 = new C120732(this.$targetFile, this.$relativePath, this.$userSession, htJ);
            c120732.L$0 = obj;
            return c120732;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            FileOutputStream fileOutputStream;
            Object obj2 = this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    FileOutputStream fileOutputStream2 = new FileOutputStream(this.$targetFile);
                    String str = this.$relativePath;
                    AbstractC3358CGz abstractC3358CGz = this.$userSession;
                    HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                    this.L$0 = obj2;
                    this.L$1 = fileOutputStream2;
                    this.L$2 = null;
                    this.label = 1;
                    obj = hatchFileOperations.fetchMediaToStream(str, fileOutputStream2, abstractC3358CGz, this);
                    fileOutputStream = fileOutputStream2;
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    ?? r4 = (Closeable) this.L$1;
                    Hwg.A00(obj);
                    fileOutputStream = r4;
                }
                boolean z = obj == null;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (!z) {
                    try {
                        this.$targetFile.delete();
                    } catch (Throwable th) {
                        C3cG.A0s(th);
                    }
                }
                return Boolean.valueOf(z);
            } finally {
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C120732) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$fetchMediaToStream$2", f = "HatchFileOperations.kt", l = {MC.hatch_message_bubble.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$fetchMediaToStream$2, reason: invalid class name and case insensitive filesystem */
    public final class C120742 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ OutputStream $sink;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120742(OutputStream outputStream, String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120742> htJ) {
            super(2, htJ);
            this.$sink = outputStream;
            this.$relativePath = str;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120742(this.$sink, this.$relativePath, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            CountingOutputStream countingOutputStream;
            Object objFetchMediaToStreamDetailed = obj;
            Object obj2 = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objFetchMediaToStreamDetailed);
                countingOutputStream = new CountingOutputStream(this.$sink);
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                String str = this.$relativePath;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                Long lA0S = C3cG.A0S(0L);
                Long lA0S2 = C3cG.A0S(30L);
                this.L$0 = countingOutputStream;
                this.label = 1;
                objFetchMediaToStreamDetailed = hatchFileOperations.fetchMediaToStreamDetailed(str, countingOutputStream, abstractC3358CGz, lA0S, null, false, true, lA0S2, this);
                if (objFetchMediaToStreamDetailed != obj2) {
                }
                return obj2;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            countingOutputStream = (CountingOutputStream) this.L$0;
            Hwg.A00(objFetchMediaToStreamDetailed);
            HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) objFetchMediaToStreamDetailed;
            if (countingOutputStream.writeFailed) {
                CFK.A06(HatchFileOperationsKt.TAG, FGI.A0J("GET /fs/raw/ (stream) write failed after ", countingOutputStream.count, " bytes"));
                return "write_failed";
            }
            obj2 = HatchCallJoinContextKt.COSMOS_JOIN_NO_RESPONSE;
            if (hatchHttpResponse == null) {
                CFK.A04(HatchFileOperationsKt.TAG, "Failed to execute Jarvis HTTP request for fs/raw (stream)");
                return HatchCallJoinContextKt.COSMOS_JOIN_NO_RESPONSE;
            }
            int i2 = hatchHttpResponse.statusCode;
            if (i2 == -1) {
                CFK.A06(HatchFileOperationsKt.TAG, "GET /fs/raw/ (stream) failed before a response");
                Throwable th = hatchHttpResponse.cause;
                if (th instanceof NoNetworkException) {
                    return VoiceCallConnectionTracker.END_REASON_NO_NETWORK;
                }
                if (th instanceof HatchTransportException) {
                    return FGI.A0M("transport:", ((HatchTransportException) th).failureKind);
                }
                return obj2;
            }
            if (200 > i2 || i2 >= 300) {
                CFK.A06(HatchFileOperationsKt.TAG, FGI.A0H("GET /fs/raw/ (stream) returned HTTP ", i2));
                return FGI.A0H("http:", i2);
            }
            boolean z = hatchHttpResponse.isSuccessful;
            long j = countingOutputStream.count;
            if (!z) {
                CFK.A06(HatchFileOperationsKt.TAG, FGI.A0J("GET /fs/raw/ (stream) ended early after ", j, " bytes"));
                return "truncated";
            }
            if (j != 0) {
                return null;
            }
            CFK.A06(HatchFileOperationsKt.TAG, "GET /fs/raw/ (stream) returned empty body");
            return "empty_body";
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((C120742) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$fetchSpaceShareUrl$2", f = "HatchFileOperations.kt", l = {2629}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$fetchSpaceShareUrl$2, reason: invalid class name and case insensitive filesystem */
    public final class C120752 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SpaceShareResult>, Object> {
        public final /* synthetic */ String $slug;
        public final /* synthetic */ AbstractC3358CGz $userSession;
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
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120752(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120752> htJ) {
            super(2, htJ);
            this.$slug = str;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120752(this.$slug, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchFileOperations$fetchSpaceShareUrl$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchFileOperations$fetchSpaceShareUrl$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchFileOperations$fetchSpaceShareUrl$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = C60O.A06(obj).m1595executeBodylessJarvisRequestWithp3iPjrY(hatchFileOperations$fetchSpaceShareUrl$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, new JarvisPath.SpaceShare(this.$slug), RequestType.GET, this.$userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            Throwable thA00 = HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
            if (thA00 != null) {
                return new SpaceShareResult.Failed(AbstractC07127nr.A08(thA00), null, null);
            }
            ArtifactSharePayloadJson artifactSharePayloadJson = (ArtifactSharePayloadJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
            String str = artifactSharePayloadJson.url;
            String str2 = null;
            if (str.length() == 0 || HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(str)) {
                str = null;
            }
            String str3 = artifactSharePayloadJson.share_type;
            if (str3 != null && str3.length() != 0) {
                str2 = str3;
            }
            return new SpaceShareResult.Success(str, str2);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SpaceShareResult> htJ) {
            return ((C120752) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$fetchThumbnailBytes$2", f = "HatchFileOperations.kt", l = {461}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$fetchThumbnailBytes$2, reason: invalid class name and case insensitive filesystem */
    public final class C120762 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ThumbnailFetchOutcome>, Object> {
        public final /* synthetic */ HatchThumbnailDisplaySize $displaySize;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120762(String str, HatchThumbnailDisplaySize hatchThumbnailDisplaySize, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120762> htJ) {
            super(2, htJ);
            this.$relativePath = str;
            this.$displaySize = hatchThumbnailDisplaySize;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120762(this.$relativePath, this.$displaySize, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            byte[] bArrBytes;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                String strEncodeRelativePath = hatchFileOperations.encodeRelativePath(this.$relativePath);
                JarvisPath fsThumbnail = this.$displaySize == null ? new JarvisPath.FsThumbnail(strEncodeRelativePath) : new JarvisPath.Raw(FGI.A0U(new JarvisPath.FsThumbnail(strEncodeRelativePath).getValue(), "?p=", hatchFileOperations.presetValue(this.$displaySize)));
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = hatchHttpApi.makeJarvisHttpRequest__EXCEPTIONAL_USE_CASES_ONLY(fsThumbnail, RequestType.GET, this.$userSession, null, new HxE[0], null, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) obj;
            if (hatchHttpResponse == null) {
                return ThumbnailFetchOutcome.NotFound.INSTANCE;
            }
            try {
                int i2 = hatchHttpResponse.statusCode;
                String str = null;
                str = null;
                if (i2 == 202) {
                    String strHeader = hatchHttpResponse.header("Retry-After");
                    return new ThumbnailFetchOutcome.Pending(strHeader != null ? C9tI.A0s(strHeader) : null);
                }
                if (200 > i2 || i2 >= 300) {
                    return ThumbnailFetchOutcome.NotFound.INSTANCE;
                }
                HatchHttpResponseBody hatchHttpResponseBodyBody = hatchHttpResponse.body();
                if (hatchHttpResponseBodyBody == null || (bArrBytes = hatchHttpResponseBodyBody.bytes()) == null || bArrBytes.length == 0) {
                    return ThumbnailFetchOutcome.NotFound.INSTANCE;
                }
                String strHeader2 = hatchHttpResponse.header("File-Title");
                if (strHeader2 != null && !C7BY.A0j(strHeader2)) {
                    str = strHeader2;
                }
                return new ThumbnailFetchOutcome.Success(new ThumbnailResult(bArrBytes, str));
            } catch (Exception e) {
                CFK.A0A(HatchFileOperationsKt.TAG, C60P.A1L("[ServerThumbnail] Failed for ", this.$relativePath, e.getMessage()), e);
                return ThumbnailFetchOutcome.NotFound.INSTANCE;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ThumbnailFetchOutcome> htJ) {
            return ((C120762) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$isImageContent$2", f = "HatchFileOperations.kt", l = {2401}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$isImageContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C120772 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120772(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120772> htJ) {
            super(2, htJ);
            this.$relativePath = str;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120772(this.$relativePath, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                String str = this.$relativePath;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.label = 1;
                obj = hatchFileOperations.fetchMediaPrefixBytes(str, 32, abstractC3358CGz, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            byte[] bArr = (byte[]) obj;
            return Boolean.valueOf((bArr == null || HatchMimeResolver.INSTANCE.mimeFromBytes(bArr) == null) ? false : true);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C120772) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$libraryFiles$2", f = "HatchFileOperations.kt", l = {2653}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$libraryFiles$2, reason: invalid class name and case insensitive filesystem */
    public final class C120782 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super LibraryResult>, Object> {
        public final /* synthetic */ Integer $limit;
        public final /* synthetic */ Integer $offset;
        public final /* synthetic */ String $preset;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120782(String str, Integer num, Integer num2, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120782> htJ) {
            super(2, htJ);
            this.$preset = str;
            this.$limit = num;
            this.$offset = num2;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120782(this.$preset, this.$limit, this.$offset, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchFileOperations$libraryFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchFileOperations$libraryFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchFileOperations$libraryFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchFileOperations$libraryFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchFileOperations$libraryFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchFileOperations$libraryFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = C60O.A06(obj).m1599executeJarvisRequestWithFof5HsY(hatchFileOperations$libraryFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchFileOperations$libraryFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, JarvisPath.FsLibrary.INSTANCE, new FsLibraryRequestJson(this.$preset, this.$limit, this.$offset), RequestType.POST, this.$userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            if (thA00 != null) {
                return new LibraryResult.Failed(AbstractC07127nr.A08(thA00));
            }
            return HatchFileOperations.INSTANCE.toLibraryResult((FsLibraryPayloadJson) objM1599executeJarvisRequestWithFof5HsY);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super LibraryResult> htJ) {
            return ((C120782) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$listDirectory$2", f = "HatchFileOperations.kt", l = {2629}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$listDirectory$2, reason: invalid class name and case insensitive filesystem */
    public final class C120792 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ListResult>, Object> {
        public final /* synthetic */ List<String> $extensions;
        public final /* synthetic */ String $path;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120792(String str, List<String> list, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120792> htJ) {
            super(2, htJ);
            this.$path = str;
            this.$extensions = list;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120792(this.$path, this.$extensions, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String strA08;
            FsErrorJson fsErrorJson;
            Object objMakeJarvisHttpRequestInternal = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(objMakeJarvisHttpRequestInternal);
                JarvisPath.FsList fsList = JarvisPath.FsList.INSTANCE;
                String str = this.$path;
                List<String> list = this.$extensions;
                if (list == null || list.isEmpty()) {
                    list = null;
                }
                FsListRequestJson fsListRequestJson = new FsListRequestJson(str, list);
                C9jH c9jHA0E = AGH.A0E();
                String strA02 = HatchJsonKt.HatchJson.A02(fsListRequestJson, FsListRequestJson$$serializer.INSTANCE);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = 1;
                this.label = 1;
                objMakeJarvisHttpRequestInternal = hatchHttpApiA06.makeJarvisHttpRequestInternal(fsList, strA02, RequestType.POST, this.$userSession, null, null, new HxE[0], true, c9jHA0E, false, true, this);
                if (objMakeJarvisHttpRequestInternal == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objMakeJarvisHttpRequestInternal);
            }
            HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) objMakeJarvisHttpRequestInternal;
            if (hatchHttpResponse == null) {
                CFK.A04(HatchFileOperationsKt.TAG, "Failed to execute Jarvis HTTP request for fs/list");
                strA08 = "Failed to execute request";
            } else {
                try {
                    int i2 = hatchHttpResponse.statusCode;
                    HatchHttpResponseBody hatchHttpResponseBodyBody = hatchHttpResponse.body();
                    String strString = hatchHttpResponseBodyBody != null ? hatchHttpResponseBodyBody.string() : null;
                    if (i2 != 200) {
                        CFK.A04(HatchFileOperationsKt.TAG, FGI.A0W("Jarvis /fs/list error: HTTP ", " - ", strString, i2));
                        return new ListResult.Failed(FGI.A0H("HTTP ", i2));
                    }
                    if (strString == null || C7BY.A0j(strString)) {
                        CFK.A04(HatchFileOperationsKt.TAG, "Jarvis /fs/list returned empty response");
                        return new ListResult.Failed("Empty response");
                    }
                    C9sU c9sU = HatchJsonKt.HatchJson;
                    int i3 = FsListResponseJson.$stable;
                    FsListResponseJson fsListResponseJson = (FsListResponseJson) c9sU.A00(strString, FsListResponseJson$$serializer.INSTANCE);
                    if (fsListResponseJson.entries.isEmpty() && (fsErrorJson = fsListResponseJson.error) != null) {
                        String str2 = fsErrorJson.message;
                        if (str2 == null) {
                            str2 = "No entries in response";
                        }
                        C60O.A1P("Jarvis /fs/list failed: ", str2, HatchFileOperationsKt.TAG);
                        return new ListResult.Failed(str2);
                    }
                    List<FsEntryJson> list2 = fsListResponseJson.entries;
                    ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
                    for (FsEntryJson fsEntryJson : list2) {
                        String str3 = fsEntryJson.name;
                        String str4 = fsEntryJson.type;
                        FileEntryType fileEntryType = "directory".equals(str4) ? FileEntryType.DIRECTORY : "file".equals(str4) ? FileEntryType.FILE : FileEntryType.FILE;
                        Long lA0S = C3cG.A0S(fsEntryJson.size);
                        if (lA0S.longValue() <= 0) {
                            lA0S = null;
                        }
                        arrayListA0i.add(new FileEntry(str3, fileEntryType, lA0S, fsEntryJson.modifiedAt));
                    }
                    return new ListResult.Success(this.$path, arrayListA0i);
                } catch (Exception e) {
                    C3cH.A1B("Jarvis /fs/list failed: ", e.getMessage(), HatchFileOperationsKt.TAG, e);
                    strA08 = AbstractC07127nr.A08(e);
                }
            }
            return new ListResult.Failed(strA08);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ListResult> htJ) {
            return ((C120792) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations", f = "HatchFileOperations.kt", l = {331}, m = "openMediaStream", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$openMediaStream$1, reason: invalid class name and case insensitive filesystem */
    public final class C120801 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C120801(HtJ<? super C120801> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileOperations.this.openMediaStream(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations", f = "HatchFileOperations.kt", l = {1974}, m = "pruneStagedFiles", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$pruneStagedFiles$1, reason: invalid class name and case insensitive filesystem */
    public final class C120811 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C120811(HtJ<? super C120811> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileOperations.this.pruneStagedFiles(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$pruneStagedFiles$2", f = "HatchFileOperations.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$pruneStagedFiles$2, reason: invalid class name and case insensitive filesystem */
    public final class C120822 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $maxAgeMs;
        public final /* synthetic */ File $root;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120822(File file, long j, HtJ<? super C120822> htJ) {
            super(2, htJ);
            this.$root = file;
            this.$maxAgeMs = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120822(this.$root, this.$maxAgeMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            File[] fileArrListFiles = this.$root.listFiles();
            if (fileArrListFiles == null) {
                return null;
            }
            long j = this.$maxAgeMs;
            ArrayList arrayListA0h = C3cG.A0h();
            for (File file : fileArrListFiles) {
                if (jCurrentTimeMillis - file.lastModified() >= j) {
                    arrayListA0h.add(file);
                }
            }
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                C60R.A1Q(it);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C120822) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$readFile$2", f = "HatchFileOperations.kt", l = {2653}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$readFile$2, reason: invalid class name and case insensitive filesystem */
    public final class C120832 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120832(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120832> htJ) {
            super(2, htJ);
            this.$relativePath = str;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120832(this.$relativePath, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchFileOperations$readFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchFileOperations$readFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchFileOperations$readFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchFileOperations$readFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchFileOperations$readFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchFileOperations$readFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = C60O.A06(obj).m1599executeJarvisRequestWithFof5HsY(hatchFileOperations$readFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchFileOperations$readFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, JarvisPath.FsRead.INSTANCE, new FsReadRequestJson(this.$relativePath, 0L, 1048576L), RequestType.POST, this.$userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            if (thA00 != null) {
                NetworkException networkException = thA00 instanceof NetworkException ? (NetworkException) thA00 : null;
                if (networkException != null && networkException.httpResponseCode == 404) {
                    return "";
                }
                if ("not_found".equals(networkException != null ? networkException.errorCode : null)) {
                    return "";
                }
                return null;
            }
            FsReadPayloadJson fsReadPayloadJson = (FsReadPayloadJson) objM1599executeJarvisRequestWithFof5HsY;
            String str = fsReadPayloadJson.text;
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    return str;
                }
            }
            String str2 = fsReadPayloadJson.data_base64;
            if (str2 != null) {
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str2, 0);
                        C7384Etj.A0X(bArrDecode);
                        return new String(bArrDecode, DCl.A05);
                    } catch (Exception unused) {
                    }
                }
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((C120832) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$readFile$4", f = "HatchFileOperations.kt", l = {2653}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$readFile$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ String $expectedGatewayUrl;
        public final /* synthetic */ long $maxBytes;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public int I$7;
        public long J$0;
        public long J$1;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(long j, String str, AbstractC3358CGz abstractC3358CGz, String str2, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$maxBytes = j;
            this.$relativePath = str;
            this.$userSession = abstractC3358CGz;
            this.$expectedGatewayUrl = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$maxBytes, this.$relativePath, this.$userSession, this.$expectedGatewayUrl, htJ);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x013e -> B:6:0x0026). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r46) {
            /*
                Method dump skipped, instructions count: 503
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchFileOperations.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$readFileFromVm$2", f = "HatchFileOperations.kt", l = {640}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$readFileFromVm$2, reason: invalid class name and case insensitive filesystem */
    public final class C120842 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ String $authToken;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ String $vmUrl;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120842(String str, String str2, String str3, HtJ<? super C120842> htJ) {
            super(2, htJ);
            this.$relativePath = str;
            this.$vmUrl = str2;
            this.$authToken = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120842(this.$relativePath, this.$vmUrl, this.$authToken, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchHttpResponseBody hatchHttpResponseBodyBody;
            String strString;
            FsReadPayloadJson fsReadPayloadJson;
            String str;
            Object objMakeJarvisHttpRequestWithCredentials = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(objMakeJarvisHttpRequestWithCredentials);
                JarvisPath.FsRead fsRead = JarvisPath.FsRead.INSTANCE;
                String strBuildFsReadRequestBody = HatchFileOperationsJsonKt.buildFsReadRequestBody(this.$relativePath, 0L, 1048576L);
                RequestType requestType = RequestType.POST;
                String str2 = this.$vmUrl;
                String str3 = this.$authToken;
                this.label = 1;
                objMakeJarvisHttpRequestWithCredentials = hatchHttpApiA06.makeJarvisHttpRequestWithCredentials(fsRead, strBuildFsReadRequestBody, requestType, str2, str3, null, new HxE[0], this);
                if (objMakeJarvisHttpRequestWithCredentials == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objMakeJarvisHttpRequestWithCredentials);
            }
            HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) objMakeJarvisHttpRequestWithCredentials;
            if (hatchHttpResponse != null) {
                try {
                    if (hatchHttpResponse.statusCode == 200 && (hatchHttpResponseBodyBody = hatchHttpResponse.body()) != null && (strString = hatchHttpResponseBodyBody.string()) != null) {
                        FsReadResponseJson fsReadResponseJson = (FsReadResponseJson) HatchJsonKt.HatchJson.A00(strString, FsReadResponseJson$$serializer.INSTANCE);
                        if (fsReadResponseJson.ok && (fsReadPayloadJson = fsReadResponseJson.result) != null && (str = fsReadPayloadJson.text) != null) {
                            if (str.length() > 0) {
                                return str;
                            }
                        }
                    }
                } catch (Exception e) {
                    CFK.A08(HatchFileOperationsKt.TAG, FGI.A0M("readFileFromVm failed: ", e.getMessage()), e);
                    return null;
                }
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((C120842) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$removeArtifact$2", f = "HatchFileOperations.kt", l = {2654}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$removeArtifact$2, reason: invalid class name and case insensitive filesystem */
    public final class C120852 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super RemoveArtifactResult>, Object> {
        public final /* synthetic */ String $projectDir;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public int I$7;
        public long J$0;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120852(AbstractC3358CGz abstractC3358CGz, String str, HtJ<? super C120852> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$projectDir = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120852(this.$userSession, this.$projectDir, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            long jNow;
            Object objM1599executeJarvisRequestWithFof5HsY;
            Exception runtimeException;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String strA0m = C60O.A0m(HatchGatewayPrefsStore.Companion, this.$userSession);
                if (strA0m == null) {
                    strA0m = "";
                }
                boolean z = !C7BY.A0j(VmAuthTokenKt.vmBoundAuthToken(this.$userSession));
                HatchArtifactPublishLogger hatchArtifactPublishLogger = HatchArtifactPublishLogger.INSTANCE;
                hatchArtifactPublishLogger.logRemoveStarting(this.$projectDir, strA0m, z);
                ProjectDirRequestJson projectDirRequestJson = new ProjectDirRequestJson(this.$projectDir);
                hatchArtifactPublishLogger.logRemoveRequestBody(HatchJsonKt.HatchJson.A02(projectDirRequestJson, ProjectDirRequestJson$$serializer.INSTANCE));
                jNow = HatchArtifactPublishLogger.clock.now();
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchFileOperations$removeArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchFileOperations$removeArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchFileOperations$removeArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchFileOperations$removeArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchFileOperations$removeArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchFileOperations$removeArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.I$0 = z ? 1 : 0;
                this.J$0 = jNow;
                this.I$1 = 1;
                this.I$2 = 1;
                this.I$3 = 0;
                this.I$4 = 1;
                this.I$5 = 0;
                this.I$6 = 0;
                this.I$7 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(hatchFileOperations$removeArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchFileOperations$removeArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, JarvisPath.ArtifactsRemove.INSTANCE, projectDirRequestJson, RequestType.POST, this.$userSession, C3cG.A0S(60L), null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                jNow = this.J$0;
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            HatchArtifactPublishLogger hatchArtifactPublishLogger2 = HatchArtifactPublishLogger.INSTANCE;
            long jNow2 = HatchArtifactPublishLogger.clock.now() - jNow;
            String str = this.$projectDir;
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            if (thA00 == null) {
                ArtifactRemovePayloadJson artifactRemovePayloadJson = (ArtifactRemovePayloadJson) objM1599executeJarvisRequestWithFof5HsY;
                hatchArtifactPublishLogger2.logRemoveSuccess(str, artifactRemovePayloadJson.destroyed, jNow2, null);
                return new RemoveArtifactResult.Success(artifactRemovePayloadJson.destroyed);
            }
            if (!(thA00 instanceof Exception) || (runtimeException = (Exception) thA00) == null) {
                runtimeException = new RuntimeException(thA00);
            }
            hatchArtifactPublishLogger2.logRemoveException(str, jNow2, runtimeException);
            return new RemoveArtifactResult.Failed(AbstractC07127nr.A08(thA00));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super RemoveArtifactResult> htJ) {
            return ((C120852) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$removeSpaceShare$2", f = "HatchFileOperations.kt", l = {2629}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$removeSpaceShare$2, reason: invalid class name and case insensitive filesystem */
    public final class C120862 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $slug;
        public final /* synthetic */ AbstractC3358CGz $userSession;
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
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120862(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120862> htJ) {
            super(2, htJ);
            this.$slug = str;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120862(this.$slug, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchFileOperations$removeSpaceShare$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchFileOperations$removeSpaceShare$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchFileOperations$removeSpaceShare$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = C60O.A06(obj).m1595executeBodylessJarvisRequestWithp3iPjrY(hatchFileOperations$removeSpaceShare$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, true, new JarvisPath.SpaceShare(this.$slug), RequestType.DELETE, this.$userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            return C3cG.A0P(objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C120862) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$renameFile$2", f = "HatchFileOperations.kt", l = {2653}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$renameFile$2, reason: invalid class name and case insensitive filesystem */
    public final class C120872 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super RenameResult>, Object> {
        public final /* synthetic */ boolean $createParent;
        public final /* synthetic */ String $destinationPath;
        public final /* synthetic */ String $sourcePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120872(String str, String str2, boolean z, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120872> htJ) {
            super(2, htJ);
            this.$sourcePath = str;
            this.$destinationPath = str2;
            this.$createParent = z;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120872(this.$sourcePath, this.$destinationPath, this.$createParent, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchFileOperations$renameFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchFileOperations$renameFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchFileOperations$renameFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchFileOperations$renameFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchFileOperations$renameFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchFileOperations$renameFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = C60O.A06(obj).m1599executeJarvisRequestWithFof5HsY(hatchFileOperations$renameFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchFileOperations$renameFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, JarvisPath.FsRename.INSTANCE, new FsRenameRequestJson(this.$sourcePath, this.$destinationPath, this.$createParent), RequestType.POST, this.$userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            String str = this.$sourcePath;
            String str2 = this.$destinationPath;
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            if (thA00 != null) {
                return new RenameResult.Failed(AbstractC07127nr.A08(thA00));
            }
            FsRenamePayloadJson fsRenamePayloadJson = (FsRenamePayloadJson) objM1599executeJarvisRequestWithFof5HsY;
            String str3 = fsRenamePayloadJson.source;
            if (str3 != null) {
                str = str3;
            }
            String str4 = fsRenamePayloadJson.destination;
            if (str4 != null) {
                str2 = str4;
            }
            return new RenameResult.Success(str, str2);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super RenameResult> htJ) {
            return ((C120872) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations", f = "HatchFileOperations.kt", l = {1813}, m = "resolveOutputNameAndMime", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$resolveOutputNameAndMime$1, reason: invalid class name and case insensitive filesystem */
    public final class C120881 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C120881(HtJ<? super C120881> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileOperations.this.resolveOutputNameAndMime(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$searchFiles$2", f = "HatchFileOperations.kt", l = {2654}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$searchFiles$2, reason: invalid class name and case insensitive filesystem */
    public final class C120912 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super LibraryResult>, Object> {
        public final /* synthetic */ List<String> $extensions;
        public final /* synthetic */ Integer $limit;
        public final /* synthetic */ String $nameContains;
        public final /* synthetic */ Integer $offset;
        public final /* synthetic */ String $path;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120912(String str, String str2, List<String> list, Integer num, Integer num2, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120912> htJ) {
            super(2, htJ);
            this.$path = str;
            this.$nameContains = str2;
            this.$extensions = list;
            this.$limit = num;
            this.$offset = num2;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120912(this.$path, this.$nameContains, this.$extensions, this.$limit, this.$offset, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
                JarvisPath.FsSearch fsSearch = JarvisPath.FsSearch.INSTANCE;
                String str = this.$path;
                String str2 = this.$nameContains;
                FsSearchNameJson fsSearchNameJson = str2 != null ? new FsSearchNameJson(str2) : null;
                List<String> list = this.$extensions;
                if (list == null || list.isEmpty()) {
                    list = null;
                }
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchFileOperations$searchFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchFileOperations$searchFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchFileOperations$searchFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchFileOperations$searchFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchFileOperations$searchFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchFileOperations$searchFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = hatchHttpApiA06.m1599executeJarvisRequestWithFof5HsY(hatchFileOperations$searchFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchFileOperations$searchFiles$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, fsSearch, new FsSearchRequestJson(str, fsSearchNameJson, list, this.$limit, this.$offset), RequestType.POST, this.$userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            if (thA00 == null) {
                return HatchFileOperations.INSTANCE.toLibraryResult((FsLibraryPayloadJson) objM1599executeJarvisRequestWithFof5HsY);
            }
            return new LibraryResult.Failed(AbstractC07127nr.A08(thA00));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super LibraryResult> htJ) {
            return ((C120912) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$shareArtifact$2", f = "HatchFileOperations.kt", l = {2653}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$shareArtifact$2, reason: invalid class name and case insensitive filesystem */
    public final class C120922 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ShareArtifactResult>, Object> {
        public final /* synthetic */ String $projectDir;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120922(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120922> htJ) {
            super(2, htJ);
            this.$projectDir = str;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120922(this.$projectDir, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchFileOperations$shareArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchFileOperations$shareArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchFileOperations$shareArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchFileOperations$shareArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchFileOperations$shareArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchFileOperations$shareArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = C60O.A06(obj).m1599executeJarvisRequestWithFof5HsY(hatchFileOperations$shareArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchFileOperations$shareArtifact$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, JarvisPath.ArtifactsShare.INSTANCE, new ProjectDirRequestJson(this.$projectDir), RequestType.POST, this.$userSession, C3cG.A0S(120L), null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            return thA00 == null ? new ShareArtifactResult.Success(((ArtifactSharePayloadJson) objM1599executeJarvisRequestWithFof5HsY).url) : new ShareArtifactResult.Failed(AbstractC07127nr.A08(thA00));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ShareArtifactResult> htJ) {
            return ((C120922) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$shareSpace$2", f = "HatchFileOperations.kt", l = {2629}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$shareSpace$2, reason: invalid class name and case insensitive filesystem */
    public final class C120932 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SpaceShareResult>, Object> {
        public final /* synthetic */ String $disclosureToken;
        public final /* synthetic */ boolean $requireDisclosureConfirmation;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public /* synthetic */ Object L$0;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120932(String str, boolean z, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120932> htJ) {
            super(2, htJ);
            this.$slug = str;
            this.$requireDisclosureConfirmation = z;
            this.$disclosureToken = str2;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C120932 c120932 = new C120932(this.$slug, this.$requireDisclosureConfirmation, this.$disclosureToken, this.$userSession, htJ);
            c120932.L$0 = obj;
            return c120932;
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Integer, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v2 */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String message;
            ?? r2;
            Object objA0s;
            FsErrorJson fsErrorJson;
            String str;
            SpaceShareDisclosureConfirmationJson spaceShareDisclosureConfirmationJson;
            String strA0l;
            String str2;
            Object objMakeJarvisHttpRequestInternal = obj;
            Object obj2 = this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            String str3 = "cloudflare";
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(objMakeJarvisHttpRequestInternal);
                JarvisPath.SpaceShare spaceShare = new JarvisPath.SpaceShare(this.$slug);
                boolean z = this.$requireDisclosureConfirmation;
                Boolean boolValueOf = Boolean.valueOf(z);
                if (!z) {
                    boolValueOf = null;
                }
                SpaceShareRequestJson spaceShareRequestJson = new SpaceShareRequestJson("cloudflare", boolValueOf, this.$disclosureToken);
                C9jH c9jHA0E = AGH.A0E();
                String strA02 = HatchJsonKt.HatchJson.A02(spaceShareRequestJson, SpaceShareRequestJson$$serializer.INSTANCE);
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.I$0 = 1;
                this.label = 1;
                objMakeJarvisHttpRequestInternal = hatchHttpApiA06.makeJarvisHttpRequestInternal(spaceShare, strA02, RequestType.POST, this.$userSession, C3cG.A0S(60L), null, new HxE[0], true, c9jHA0E, false, true, this);
                if (objMakeJarvisHttpRequestInternal == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objMakeJarvisHttpRequestInternal);
            }
            HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) objMakeJarvisHttpRequestInternal;
            if (hatchHttpResponse == null) {
                C60O.A1P("Failed to execute POST /spaces/share/", this.$slug, HatchFileOperationsKt.TAG);
                r2 = 0;
                message = "Failed to execute request";
            } else {
                try {
                    int i2 = hatchHttpResponse.statusCode;
                    HatchHttpResponseBody hatchHttpResponseBodyBody = hatchHttpResponse.body();
                    String strString = hatchHttpResponseBodyBody != null ? hatchHttpResponseBodyBody.string() : null;
                    if (i2 != 200 || strString == null || C7BY.A0j(strString)) {
                        CFK.A04(HatchFileOperationsKt.TAG, FGI.A0V("POST /spaces/share/", this.$slug, " error: HTTP ", i2));
                        if (strString != null) {
                            try {
                                objA0s = ((ArtifactShareResponseJson) HatchJsonKt.HatchJson.A00(strString, ArtifactShareResponseJson$$serializer.INSTANCE)).error;
                            } catch (Throwable th) {
                                objA0s = C3cG.A0s(th);
                            }
                            if (objA0s instanceof C10571Hud) {
                                objA0s = null;
                            }
                            fsErrorJson = (FsErrorJson) objA0s;
                        } else {
                            fsErrorJson = null;
                        }
                        SpaceShareResult.PolicyRefused spaceSharePolicyRefusal = HatchFileOperations.INSTANCE.toSpaceSharePolicyRefusal(fsErrorJson);
                        if (spaceSharePolicyRefusal != null) {
                            return spaceSharePolicyRefusal;
                        }
                        String strA0H = FGI.A0H("HTTP ", i2);
                        Integer numA0R = C3cG.A0R(i2);
                        if (fsErrorJson == null || (str = fsErrorJson.message) == null || C7BY.A0j(str)) {
                            str = null;
                        }
                        return new SpaceShareResult.Failed(strA0H, numA0R, str);
                    }
                    ArtifactShareResponseJson artifactShareResponseJson = (ArtifactShareResponseJson) HatchJsonKt.HatchJson.A00(strString, ArtifactShareResponseJson$$serializer.INSTANCE);
                    if (!artifactShareResponseJson.ok) {
                        SpaceShareResult.PolicyRefused spaceSharePolicyRefusal2 = HatchFileOperations.INSTANCE.toSpaceSharePolicyRefusal(artifactShareResponseJson.error);
                        if (spaceSharePolicyRefusal2 != null) {
                            return spaceSharePolicyRefusal2;
                        }
                        FsErrorJson fsErrorJson2 = artifactShareResponseJson.error;
                        if (fsErrorJson2 == null || (str2 = fsErrorJson2.message) == null) {
                            str2 = "Unknown error";
                        }
                        return new SpaceShareResult.Failed(str2, C3cG.A0R(200), fsErrorJson2 != null ? fsErrorJson2.message : null);
                    }
                    ArtifactSharePayloadJson artifactSharePayloadJson = artifactShareResponseJson.result;
                    if (artifactSharePayloadJson == null || (spaceShareDisclosureConfirmationJson = artifactSharePayloadJson.disclosure_confirmation) == null) {
                        String strResolvedUrl = artifactShareResponseJson.resolvedUrl();
                        if (strResolvedUrl.length() == 0 || HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(strResolvedUrl)) {
                            strResolvedUrl = null;
                            str3 = null;
                        } else {
                            String strResolvedShareType = artifactShareResponseJson.resolvedShareType();
                            if (strResolvedShareType != null && !AnonymousClass002.A1M(strResolvedShareType.length())) {
                                str3 = strResolvedShareType;
                            }
                        }
                        return new SpaceShareResult.Success(strResolvedUrl, str3);
                    }
                    SpaceShareDisclosureJson spaceShareDisclosureJson = spaceShareDisclosureConfirmationJson.disclosure;
                    SpaceShareDisclosure spaceShareDisclosure = new SpaceShareDisclosure(spaceShareDisclosureJson.contains_personal_information, spaceShareDisclosureJson.contains_chat_history, spaceShareDisclosureJson.contains_user_shared_media, spaceShareDisclosureJson.contains_secrets_or_credentials);
                    String str4 = spaceShareDisclosureConfirmationJson.token;
                    if (str4.length() <= 0 || !spaceShareDisclosure.getHasWarning()) {
                        CFK.A04(HatchFileOperationsKt.TAG, FGI.A0U("POST /spaces/share/", this.$slug, " returned an unusable disclosure confirmation"));
                        return new SpaceShareResult.Failed("Unusable disclosure confirmation", C3cG.A0R(200), null);
                    }
                    String str5 = spaceShareDisclosureConfirmationJson.summary;
                    if (str5 == null || (strA0l = AnonymousClass002.A0l(str5)) == null || strA0l.length() <= 0) {
                        strA0l = null;
                    }
                    return new SpaceShareResult.NeedsDisclosureConfirmation(str4, spaceShareDisclosure, strA0l);
                } catch (Exception e) {
                    CFK.A08(HatchFileOperationsKt.TAG, FGI.A0d("POST /spaces/share/", this.$slug, " failed: ", e.getMessage()), e);
                    message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    r2 = 0;
                }
            }
            return new SpaceShareResult.Failed(message, r2, r2);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SpaceShareResult> htJ) {
            return ((C120932) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations", f = "HatchFileOperations.kt", l = {1917}, m = "stageWorkspaceFile", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$stageWorkspaceFile$1, reason: invalid class name and case insensitive filesystem */
    public final class C120941 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C120941(HtJ<? super C120941> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchFileOperations.this.stageWorkspaceFile(null, null, null, null, null, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$statFile$2", f = "HatchFileOperations.kt", l = {2628}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$statFile$2, reason: invalid class name and case insensitive filesystem */
    public final class C120952 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super StatResult>, Object> {
        public final /* synthetic */ String $path;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120952(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120952> htJ) {
            super(2, htJ);
            this.$path = str;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120952(this.$path, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objMakeJarvisHttpRequestInternal = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(objMakeJarvisHttpRequestInternal);
                JarvisPath.FsStat fsStat = JarvisPath.FsStat.INSTANCE;
                FsPathRequestJson fsPathRequestJson = new FsPathRequestJson(this.$path);
                C9jH c9jHA0E = AGH.A0E();
                String strA02 = HatchJsonKt.HatchJson.A02(fsPathRequestJson, FsPathRequestJson$$serializer.INSTANCE);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = 1;
                this.label = 1;
                objMakeJarvisHttpRequestInternal = hatchHttpApiA06.makeJarvisHttpRequestInternal(fsStat, strA02, RequestType.POST, this.$userSession, null, null, new HxE[0], true, c9jHA0E, false, true, this);
                if (objMakeJarvisHttpRequestInternal == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objMakeJarvisHttpRequestInternal);
            }
            HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) objMakeJarvisHttpRequestInternal;
            if (hatchHttpResponse == null) {
                CFK.A04(HatchFileOperationsKt.TAG, "Failed to execute Jarvis HTTP request for fs/stat");
                return new StatResult.Failed("Failed to execute request", null);
            }
            try {
                int i2 = hatchHttpResponse.statusCode;
                HatchHttpResponseBody hatchHttpResponseBodyBody = hatchHttpResponse.body();
                String strString = hatchHttpResponseBodyBody != null ? hatchHttpResponseBodyBody.string() : null;
                if (i2 != 200) {
                    CFK.A04(HatchFileOperationsKt.TAG, FGI.A0W("Jarvis /fs/stat error: HTTP ", " - ", strString, i2));
                    return new StatResult.Failed(FGI.A0H("HTTP ", i2), C3cG.A0R(i2));
                }
                if (strString == null || C7BY.A0j(strString)) {
                    CFK.A04(HatchFileOperationsKt.TAG, "Jarvis /fs/stat returned empty response");
                    return new StatResult.Failed("Empty response", null);
                }
                FsStatResponseJson fsStatResponseJson = (FsStatResponseJson) HatchJsonKt.HatchJson.A00(strString, FsStatResponseJson$$serializer.INSTANCE);
                FsErrorJson fsErrorJson = fsStatResponseJson.error;
                if (fsErrorJson != null) {
                    String str = fsErrorJson.message;
                    if (str == null) {
                        str = "Unknown error";
                    }
                    C60O.A1P("Jarvis /fs/stat failed: ", str, HatchFileOperationsKt.TAG);
                    return new StatResult.Failed(str, null);
                }
                FsStatPayloadJson fsStatPayloadJsonResultOrFlat = fsStatResponseJson.resultOrFlat();
                String str2 = fsStatPayloadJsonResultOrFlat.path;
                String str3 = this.$path;
                if (str2.length() == 0) {
                    str2 = str3;
                }
                String str4 = fsStatPayloadJsonResultOrFlat.kind;
                FileEntryType fileEntryType = (!"file".equals(str4) && "dir".equals(str4)) ? FileEntryType.DIRECTORY : FileEntryType.FILE;
                long jLongValue = C3cG.A0S(fsStatPayloadJsonResultOrFlat.modified_ms).longValue();
                String string = jLongValue >= 0 ? Instant.ofEpochMilli(jLongValue).toString() : null;
                String strA0M = C7BY.A0M(str2);
                if (strA0M.length() == 0) {
                    strA0M = str2;
                }
                Long lA0S = C3cG.A0S(fsStatPayloadJsonResultOrFlat.size);
                if (lA0S.longValue() <= 0) {
                    lA0S = null;
                }
                return new StatResult.Success(str2, new FileEntry(strA0M, fileEntryType, lA0S, string));
            } catch (Exception e) {
                C3cH.A1B("Jarvis /fs/stat failed: ", e.getMessage(), HatchFileOperationsKt.TAG, e);
                String message = e.getMessage();
                return new StatResult.Failed(message != null ? message : "Unknown error", null);
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super StatResult> htJ) {
            return ((C120952) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$uploadFile$2", f = "HatchFileOperations.kt", l = {1130, 1161}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$uploadFile$2, reason: invalid class name and case insensitive filesystem */
    public final class C120962 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super WriteResult>, Object> {
        public final /* synthetic */ Map<String, String> $extraFormFields;
        public final /* synthetic */ File $file;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120962(AbstractC3358CGz abstractC3358CGz, String str, File file, Map<String, String> map, HtJ<? super C120962> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$relativePath = str;
            this.$file = file;
            this.$extraFormFields = map;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C120962 c120962 = new C120962(this.$userSession, this.$relativePath, this.$file, this.$extraFormFields, htJ);
            c120962.L$0 = obj;
            return c120962;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00be A[Catch: Exception -> 0x016b, TryCatch #2 {Exception -> 0x016b, blocks: (B:29:0x00b0, B:30:0x00b3, B:32:0x00be, B:34:0x00c4, B:39:0x00da, B:42:0x00df, B:48:0x00ea, B:50:0x00ee, B:53:0x00f9, B:55:0x0105, B:56:0x0111, B:59:0x0122, B:61:0x0126, B:64:0x012e, B:66:0x0139, B:68:0x013d, B:78:0x0152, B:79:0x015a, B:82:0x0165, B:63:0x012a, B:38:0x00d6, B:26:0x009a, B:36:0x00ca), top: B:87:0x0010, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x012a A[Catch: Exception -> 0x016b, TryCatch #2 {Exception -> 0x016b, blocks: (B:29:0x00b0, B:30:0x00b3, B:32:0x00be, B:34:0x00c4, B:39:0x00da, B:42:0x00df, B:48:0x00ea, B:50:0x00ee, B:53:0x00f9, B:55:0x0105, B:56:0x0111, B:59:0x0122, B:61:0x0126, B:64:0x012e, B:66:0x0139, B:68:0x013d, B:78:0x0152, B:79:0x015a, B:82:0x0165, B:63:0x012a, B:38:0x00d6, B:26:0x009a, B:36:0x00ca), top: B:87:0x0010, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0139 A[Catch: Exception -> 0x016b, TryCatch #2 {Exception -> 0x016b, blocks: (B:29:0x00b0, B:30:0x00b3, B:32:0x00be, B:34:0x00c4, B:39:0x00da, B:42:0x00df, B:48:0x00ea, B:50:0x00ee, B:53:0x00f9, B:55:0x0105, B:56:0x0111, B:59:0x0122, B:61:0x0126, B:64:0x012e, B:66:0x0139, B:68:0x013d, B:78:0x0152, B:79:0x015a, B:82:0x0165, B:63:0x012a, B:38:0x00d6, B:26:0x009a, B:36:0x00ca), top: B:87:0x0010, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0164  */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Integer, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v5 */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 390
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchFileOperations.C120962.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super WriteResult> htJ) {
            return ((C120962) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$uploadFileBytes$2", f = "HatchFileOperations.kt", l = {968, 1015}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$uploadFileBytes$2, reason: invalid class name and case insensitive filesystem */
    public final class C120972 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super WriteResult>, Object> {
        public final /* synthetic */ byte[] $data;
        public final /* synthetic */ Map<String, String> $extraFormFields;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120972(AbstractC3358CGz abstractC3358CGz, String str, byte[] bArr, Map<String, String> map, HtJ<? super C120972> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$relativePath = str;
            this.$data = bArr;
            this.$extraFormFields = map;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C120972 c120972 = new C120972(this.$userSession, this.$relativePath, this.$data, this.$extraFormFields, htJ);
            c120972.L$0 = obj;
            return c120972;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0143 A[Catch: Exception -> 0x01c8, TryCatch #1 {Exception -> 0x01c8, blocks: (B:33:0x0136, B:34:0x0139, B:36:0x0143, B:38:0x0149, B:43:0x015f, B:46:0x0164, B:52:0x016f, B:54:0x0173, B:57:0x017e, B:59:0x018a, B:60:0x018d, B:63:0x01a0, B:65:0x01a4, B:68:0x01ae, B:70:0x01bb, B:72:0x01bf, B:73:0x01c1, B:67:0x01a8, B:42:0x015b, B:30:0x011d, B:40:0x014f), top: B:78:0x000f, inners: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x016d  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01a8 A[Catch: Exception -> 0x01c8, TryCatch #1 {Exception -> 0x01c8, blocks: (B:33:0x0136, B:34:0x0139, B:36:0x0143, B:38:0x0149, B:43:0x015f, B:46:0x0164, B:52:0x016f, B:54:0x0173, B:57:0x017e, B:59:0x018a, B:60:0x018d, B:63:0x01a0, B:65:0x01a4, B:68:0x01ae, B:70:0x01bb, B:72:0x01bf, B:73:0x01c1, B:67:0x01a8, B:42:0x015b, B:30:0x011d, B:40:0x014f), top: B:78:0x000f, inners: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01bb A[Catch: Exception -> 0x01c8, TryCatch #1 {Exception -> 0x01c8, blocks: (B:33:0x0136, B:34:0x0139, B:36:0x0143, B:38:0x0149, B:43:0x015f, B:46:0x0164, B:52:0x016f, B:54:0x0173, B:57:0x017e, B:59:0x018a, B:60:0x018d, B:63:0x01a0, B:65:0x01a4, B:68:0x01ae, B:70:0x01bb, B:72:0x01bf, B:73:0x01c1, B:67:0x01a8, B:42:0x015b, B:30:0x011d, B:40:0x014f), top: B:78:0x000f, inners: #2 }] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Integer, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v6 */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 477
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchFileOperations.C120972.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super WriteResult> htJ) {
            return ((C120972) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$uploadFileWithoutOverwrite$2", f = "HatchFileOperations.kt", l = {1081}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$uploadFileWithoutOverwrite$2, reason: invalid class name and case insensitive filesystem */
    public final class C120982 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ExclusiveWriteResult>, Object> {
        public final /* synthetic */ String $expectedGatewayUrl;
        public final /* synthetic */ File $file;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ long $timeoutMs;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120982(long j, String str, String str2, File file, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120982> htJ) {
            super(2, htJ);
            this.$timeoutMs = j;
            this.$relativePath = str;
            this.$expectedGatewayUrl = str2;
            this.$file = file;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120982(this.$timeoutMs, this.$relativePath, this.$expectedGatewayUrl, this.$file, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            Object obj2;
            Object objExecute = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objExecute);
                    if (invokeSuspend$isCurrent(this.$expectedGatewayUrl, this.$userSession) && this.$timeoutMs > 0) {
                        List listA0h = C7BY.A0h(this.$relativePath, new char[1], '/');
                        if (!(listA0h instanceof Collection) || !listA0h.isEmpty()) {
                            Iterator it = listA0h.iterator();
                            while (it.hasNext()) {
                                String strA0j = AnonymousClass005.A0j(it);
                                if (strA0j.length() == 0 || ".".equals(strA0j) || "..".equals(strA0j) || C7BY.A0k(strA0j, (char) 0) || C7BY.A0k(strA0j, '\\')) {
                                    break;
                                }
                            }
                        }
                        String strJarvisHttpBaseUrl = HatchHttpApi.INSTANCE.jarvisHttpBaseUrl(this.$expectedGatewayUrl);
                        if (strJarvisHttpBaseUrl != null) {
                            HatchHttpRequest.Companion companion = HatchHttpRequest.Companion;
                            String strA0M = FGI.A0M(strJarvisHttpBaseUrl, JarvisPath.FsUpload.INSTANCE.getValue());
                            HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                            String str = this.$relativePath;
                            File file = this.$file;
                            C9jH c9jHA0E = AGH.A0E();
                            HatchRequestBody.Multipart multipartBuildUploadFileBody$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway = hatchFileOperations.buildUploadFileBody$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(str, file, c9jHA0E, false);
                            HatchResponseBodyPolicy hatchResponseBodyPolicy = new HatchResponseBodyPolicy(65536L);
                            long j = this.$timeoutMs;
                            HatchHttpRequest hatchHttpRequestPost = companion.post(strA0M, multipartBuildUploadFileBody$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway, c9jHA0E, null, C3cG.A0S(j), C3cG.A0S(j), HatchRequestCategory.API, HatchRequestPurpose.FETCH, null, false, false, false, hatchResponseBodyPolicy, null, true, false);
                            if (invokeSuspend$isCurrent(this.$expectedGatewayUrl, this.$userSession)) {
                                HatchHttpClient hatchHttpClientA08 = C60O.A08();
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 1;
                                objExecute = hatchHttpClientA08.execute(hatchHttpRequestPost, this);
                                if (objExecute == enumC10460Hji) {
                                    return enumC10460Hji;
                                }
                            }
                        }
                    }
                    return ExclusiveWriteResult.NotStarted.INSTANCE;
                }
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objExecute);
                HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) objExecute;
                InputStream inputStreamBoundedBodyStream = hatchHttpResponse.boundedBodyStream();
                String str2 = this.$expectedGatewayUrl;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                try {
                    if (hatchHttpResponse.statusCode == 409) {
                        obj2 = ExclusiveWriteResult.NotStarted.INSTANCE;
                    } else {
                        if (hatchHttpResponse.isSuccessful && invokeSuspend$isCurrent(str2, abstractC3358CGz) && inputStreamBoundedBodyStream != null) {
                            FsExclusiveUploadResponseJson fsExclusiveUploadResponseJson = (FsExclusiveUploadResponseJson) AbstractC07979sd.A00(inputStreamBoundedBodyStream, FsExclusiveUploadResponseJson$$serializer.INSTANCE, HatchJsonKt.HatchJson);
                            FsExclusiveUploadWrittenJson fsExclusiveUploadWrittenJson = fsExclusiveUploadResponseJson.result;
                            Long l = fsExclusiveUploadWrittenJson != null ? fsExclusiveUploadWrittenJson.bytes_written : null;
                            Long l2 = fsExclusiveUploadResponseJson.bytes_written;
                            if (l != null) {
                                if (l2 != null && !l.equals(l2)) {
                                    obj2 = ExclusiveWriteResult.Unknown.INSTANCE;
                                }
                                inputStreamBoundedBodyStream.close();
                                return obj2;
                            }
                            l = l2;
                            if (fsExclusiveUploadResponseJson.ok && l != null) {
                                long jLongValue = l.longValue();
                                if (jLongValue >= 0) {
                                    ExclusiveWriteResult.Written written = new ExclusiveWriteResult.Written(jLongValue);
                                    inputStreamBoundedBodyStream.close();
                                    return written;
                                }
                            }
                            obj2 = ExclusiveWriteResult.Unknown.INSTANCE;
                            inputStreamBoundedBodyStream.close();
                            return obj2;
                        }
                        obj2 = ExclusiveWriteResult.Unknown.INSTANCE;
                    }
                    if (inputStreamBoundedBodyStream != null) {
                        inputStreamBoundedBodyStream.close();
                    }
                    return obj2;
                } finally {
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                return ExclusiveWriteResult.Unknown.INSTANCE;
            }
        }

        public static final boolean invokeSuspend$isCurrent(String str, AbstractC3358CGz abstractC3358CGz) {
            return !C7BY.A0j(str) && AuraSessionManager.INSTANCE.isCurrentSession(abstractC3358CGz) && C7384Etj.areEqual(C60P.A1K(abstractC3358CGz), str);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ExclusiveWriteResult> htJ) {
            return ((C120982) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$writeFile$2", f = "HatchFileOperations.kt", l = {2653}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$writeFile$2, reason: invalid class name and case insensitive filesystem */
    public final class C120992 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super WriteResult>, Object> {
        public final /* synthetic */ boolean $append;
        public final /* synthetic */ String $content;
        public final /* synthetic */ boolean $createParent;
        public final /* synthetic */ String $expectedGatewayUrl;
        public final /* synthetic */ boolean $overwrite;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120992(String str, String str2, boolean z, boolean z2, boolean z3, String str3, AbstractC3358CGz abstractC3358CGz, HtJ<? super C120992> htJ) {
            super(2, htJ);
            this.$content = str;
            this.$relativePath = str2;
            this.$overwrite = z;
            this.$append = z2;
            this.$createParent = z3;
            this.$expectedGatewayUrl = str3;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120992(this.$content, this.$relativePath, this.$overwrite, this.$append, this.$createParent, this.$expectedGatewayUrl, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String strEncodeToString = Base64.encodeToString(C3cG.A1S(this.$content), 2);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                JarvisPath.FsWrite fsWrite = JarvisPath.FsWrite.INSTANCE;
                String str = this.$relativePath;
                C7384Etj.A0X(strEncodeToString);
                FsWriteRequestJson fsWriteRequestJson = new FsWriteRequestJson(str, strEncodeToString, this.$overwrite, this.$append, this.$createParent);
                RequestType requestType = RequestType.POST;
                String str2 = this.$expectedGatewayUrl;
                boolean zA1Y = AnonymousClass002.A1Y(str2);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchFileOperations$writeFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchFileOperations$writeFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchFileOperations$writeFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchFileOperations$writeFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchFileOperations$writeFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchFileOperations$writeFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.I$0 = 1;
                this.I$1 = zA1Y ? 1 : 0;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1599executeJarvisRequestWithFof5HsY(hatchFileOperations$writeFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchFileOperations$writeFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, fsWrite, fsWriteRequestJson, requestType, this.$userSession, null, null, new HxE[0], setA18, true, zA1Y, c9jHA0E, str2, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            String str3 = this.$relativePath;
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            if (thA00 != null) {
                return new WriteResult.Failed(AbstractC07127nr.A08(thA00), null, null, null);
            }
            FsWritePayloadJson fsWritePayloadJson = (FsWritePayloadJson) objM1599executeJarvisRequestWithFof5HsY;
            String str4 = fsWritePayloadJson.path;
            if (str4 != null) {
                str3 = str4;
            }
            return new WriteResult.Success(str3, fsWritePayloadJson.bytes_written);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super WriteResult> htJ) {
            return ((C120992) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchFileOperations$writeFileBytes$2", f = "HatchFileOperations.kt", l = {2653}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchFileOperations$writeFileBytes$2, reason: invalid class name and case insensitive filesystem */
    public final class C121002 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super WriteResult>, Object> {
        public final /* synthetic */ boolean $append;
        public final /* synthetic */ boolean $createParent;
        public final /* synthetic */ byte[] $data;
        public final /* synthetic */ boolean $overwrite;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121002(byte[] bArr, String str, boolean z, boolean z2, boolean z3, AbstractC3358CGz abstractC3358CGz, HtJ<? super C121002> htJ) {
            super(2, htJ);
            this.$data = bArr;
            this.$relativePath = str;
            this.$overwrite = z;
            this.$append = z2;
            this.$createParent = z3;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C121002(this.$data, this.$relativePath, this.$overwrite, this.$append, this.$createParent, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String strEncodeToString = Base64.encodeToString(this.$data, 2);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                JarvisPath.FsWrite fsWrite = JarvisPath.FsWrite.INSTANCE;
                String str = this.$relativePath;
                C7384Etj.A0X(strEncodeToString);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchFileOperations$writeFileBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchFileOperations$writeFileBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchFileOperations$writeFileBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchFileOperations$writeFileBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchFileOperations$writeFileBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchFileOperations$writeFileBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1599executeJarvisRequestWithFof5HsY(hatchFileOperations$writeFileBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchFileOperations$writeFileBytes$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, fsWrite, new FsWriteRequestJson(str, strEncodeToString, this.$overwrite, this.$append, this.$createParent), RequestType.POST, this.$userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            String str2 = this.$relativePath;
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            if (thA00 != null) {
                return new WriteResult.Failed(AbstractC07127nr.A08(thA00), null, null, null);
            }
            FsWritePayloadJson fsWritePayloadJson = (FsWritePayloadJson) objM1599executeJarvisRequestWithFof5HsY;
            String str3 = fsWritePayloadJson.path;
            if (str3 != null) {
                str2 = str3;
            }
            return new WriteResult.Success(str2, fsWritePayloadJson.bytes_written);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super WriteResult> htJ) {
            return ((C121002) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String encodeRelativePath(String str) {
        return AbstractC0878AGe.A0L(CustomConnectorRegisterRepositoryKt.ROOT_PATH, "", "", C7BY.A0i(str, new String[]{CustomConnectorRegisterRepositoryKt.ROOT_PATH}, 0), AnonymousClass1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveOutputNameAndMime(android.content.Context r11, java.lang.String r12, java.lang.String r13, X.AbstractC3358CGz r14, X.HtJ<? super X.HxE<java.lang.String, java.lang.String>> r15) {
        /*
            r10 = this;
            r4 = r15
            r2 = r13
            boolean r0 = r15 instanceof com.facebook.aura.gateway.HatchFileOperations.C120881
            if (r0 == 0) goto La4
            r15 = r4
            com.facebook.aura.gateway.HatchFileOperations$resolveOutputNameAndMime$1 r15 = (com.facebook.aura.gateway.HatchFileOperations.C120881) r15
            int r3 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto La4
            int r3 = r3 - r1
            r15.label = r3
        L14:
            java.lang.Object r9 = r15.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r15.label
            java.lang.String r6 = ""
            r8 = 1
            java.lang.String r4 = "."
            r5 = 46
            r3 = 0
            if (r0 == 0) goto L62
            if (r0 != r8) goto Lab
            java.lang.Object r3 = r15.L$5
            java.lang.Object r0 = r15.L$4
            java.lang.String r2 = X.C3cG.A0d(r0, r9)
        L2e:
            byte[] r9 = (byte[]) r9
            if (r9 == 0) goto L60
            com.facebook.aura.file.core.HatchMimeResolver r0 = com.facebook.aura.file.core.HatchMimeResolver.INSTANCE
            java.lang.String r1 = r0.mimeFromBytes(r9)
            if (r1 == 0) goto L60
            java.lang.String r3 = r0.extensionForMime(r1)
            if (r3 == 0) goto L56
            java.lang.String r0 = X.C7BY.A0R(r2, r6, r5)
            int r0 = r0.length()
            if (r0 <= 0) goto L5b
            java.lang.String r0 = X.C7BY.A0T(r2, r2, r5)
            java.lang.StringBuilder r0 = X.C3cG.A0g(r0)
        L52:
            java.lang.String r2 = X.C60P.A1M(r4, r3, r0)
        L56:
            X.HxE r0 = X.C3cG.A0r(r2, r1)
            return r0
        L5b:
            java.lang.StringBuilder r0 = X.C3cG.A0g(r2)
            goto L52
        L60:
            r1 = r3
            goto L56
        L62:
            X.Hwg.A00(r9)
            boolean r0 = X.C7BY.A0k(r13, r5)
            if (r0 != 0) goto L7d
            java.lang.String r0 = X.C7BY.A0M(r12)
            java.lang.String r1 = X.C7BY.A0R(r0, r6, r5)
            int r0 = r1.length()
            if (r0 <= 0) goto L7d
            java.lang.String r2 = X.FGI.A0U(r13, r4, r1)
        L7d:
            com.facebook.aura.file.core.HatchMimeResolver r0 = com.facebook.aura.file.core.HatchMimeResolver.INSTANCE
            java.lang.String r1 = r0.mimeForName(r2)
            java.lang.String r0 = "application/octet-stream"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L56
            r15.L$0 = r3
            r15.L$1 = r3
            r15.L$2 = r3
            r15.L$3 = r3
            r15.L$4 = r2
            r15.L$5 = r1
            r15.label = r8
            r13 = 32
            java.lang.Object r9 = r10.readPrefixForDownload(r11, r12, r13, r14, r15)
            if (r9 != r7) goto La2
            return r7
        La2:
            r3 = r1
            goto L2e
        La4:
            com.facebook.aura.gateway.HatchFileOperations$resolveOutputNameAndMime$1 r15 = new com.facebook.aura.gateway.HatchFileOperations$resolveOutputNameAndMime$1
            r15.<init>(r4)
            goto L14
        Lab:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchFileOperations.resolveOutputNameAndMime(android.content.Context, java.lang.String, java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpaceShareResult.PolicyRefused toSpaceSharePolicyRefusal(FsErrorJson fsErrorJson) {
        String strA0l;
        String strA0l2;
        String str = null;
        if (fsErrorJson != null) {
            String str2 = fsErrorJson.message;
            if (str2 == null || !C7BY.A0q(str2, HatchFileOperationsKt.SPACE_SHARE_PRIVACY_ISSUES_MARKER, false)) {
                String str3 = fsErrorJson.code;
                if (str3 != null && (strA0l = AnonymousClass002.A0l(str3)) != null) {
                    if (HatchFileOperationsKt.SPACE_SHARE_POLICY_REFUSAL_CODES.contains(AnonymousClass001.A0u(strA0l))) {
                        if (str2 != null && (strA0l2 = AnonymousClass002.A0l(str2)) != null) {
                        }
                        return new SpaceShareResult.PolicyRefused(str);
                    }
                }
            } else {
                strA0l2 = AnonymousClass002.A0l(C7BY.A0W(str2, HatchFileOperationsKt.SPACE_SHARE_PRIVACY_ISSUES_MARKER, str2));
            }
            if (strA0l2.length() > 0) {
                str = strA0l2;
            }
            return new SpaceShareResult.PolicyRefused(str);
        }
        return null;
    }

    public final String buildFSRawFileUrl(String str, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(abstractC3358CGz, 1);
        return buildFSUrl(HatchUrlSegments.FS_RAW_BASE, str, abstractC3358CGz, null);
    }

    public final HatchRequestBody.Multipart buildUploadFileBody$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(String str, File file, Map<String, String> map, boolean z) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0x(file, map);
        String strA0V = C7BY.A0V(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str);
        if (C7BY.A0j(strA0V)) {
            strA0V = file.getName();
        }
        AII aiiA17 = AIM.A17();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            aiiA17.add(INSTANCE.formField(C60O.A0t(entryA0l), (String) entryA0l.getValue()));
        }
        HatchFileOperations hatchFileOperations = INSTANCE;
        aiiA17.add(hatchFileOperations.formField("path", str));
        aiiA17.add(hatchFileOperations.formField("create_parent", "true"));
        aiiA17.add(hatchFileOperations.formField("overwrite", String.valueOf(z)));
        return new HatchRequestBody.Multipart(AIM.A18(aiiA17), Collections.singletonList(new HatchMultipartFilePart("file", strA0V, "application/octet-stream", file)));
    }

    public final HatchHttpRequest buildUploadFileRequest$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(String str, String str2, File file, Map<String, String> map) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(str2, file, map, 1);
        return HatchHttpRequest.Companion.post(FGI.A0M(str, JarvisPath.FsUpload.INSTANCE.getValue()), buildUploadFileBody$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(str2, file, map, true), AGH.A0E(), null, Long.valueOf(uploadDeadlineMs(file.length())), 0L, HatchRequestCategory.API, HatchRequestPurpose.FETCH, null, false, false, true, HatchResponseBodyPolicy.DEFAULT, null, false, true);
    }

    public final boolean fileModifiedAfterDeploy(String str, Long l) {
        Long iso8601ToMs;
        if (str == null || str.length() == 0 || l == null) {
            return true;
        }
        long jLongValue = l.longValue();
        return jLongValue <= 0 || (iso8601ToMs = parseIso8601ToMs(str)) == null || jLongValue > iso8601ToMs.longValue();
    }

    public final Long parseIso8601ToMs(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            return Long.valueOf(C60Q.A05(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public final String resolveProjectDirFromPath(String str) {
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0q(C7BY.A0V(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str), ".", false)) {
            str = C7BY.A0X(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str);
        }
        return !AnonymousClass005.A1a(str, "workspace/") ? FGI.A0M("workspace/", str) : str;
    }

    public final boolean savesToGallery(String str) {
        C7384Etj.A0Y(str, 0);
        return str.startsWith("image/") || str.startsWith("video/");
    }

    public final void scheduleStagedDirDeletion(final File file, long j) {
        C7384Etj.A0Y(file, 0);
        AuraExecutors.INSTANCE.getUiThreadHandler().postDelayed(new Runnable() { // from class: com.facebook.aura.gateway.HatchFileOperations.scheduleStagedDirDeletion.1
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorService executorServiceA1D = C60O.A1D();
                final File file2 = file;
                executorServiceA1D.execute(new Runnable() { // from class: com.facebook.aura.gateway.HatchFileOperations.scheduleStagedDirDeletion.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            CEV.A03(file2);
                        } catch (Exception unused) {
                            CFK.A06(HatchFileOperationsKt.TAG, "Scheduled staged folder deletion failed");
                        }
                    }
                });
            }
        }, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stageWorkspaceFile(android.content.Context r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, X.AbstractC3358CGz r16, java.io.File r17, long r18, X.HtJ<? super com.facebook.aura.gateway.HatchFileOperations.StagedWorkspaceFile> r20) {
        /*
            r11 = this;
            r5 = r15
            r3 = r20
            r10 = r14
            boolean r0 = r3 instanceof com.facebook.aura.gateway.HatchFileOperations.C120941
            r7 = r11
            if (r0 == 0) goto L5d
            r15 = r3
            com.facebook.aura.gateway.HatchFileOperations$stageWorkspaceFile$1 r15 = (com.facebook.aura.gateway.HatchFileOperations.C120941) r15
            int r2 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r15.label = r2
        L17:
            java.lang.Object r6 = r15.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r2 = r15.label
            r0 = 1
            r1 = 0
            if (r2 == 0) goto L35
            if (r2 != r0) goto L82
            java.lang.Object r0 = r15.L$3
            java.lang.String r5 = X.C3cG.A0d(r0, r6)
        L29:
            boolean r0 = r6 instanceof com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Success
            if (r0 == 0) goto L81
            com.facebook.aura.gateway.HatchFileOperations$DownloadResult$Success r6 = (com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Success) r6
            if (r6 == 0) goto L81
            java.lang.String r0 = r6.localPath
            r3 = 0
            goto L63
        L35:
            X.Hwg.A00(r6)
            r9 = r13
            if (r14 != 0) goto L3f
            java.lang.String r10 = X.C7BY.A0M(r13)
        L3f:
            r15.L$0 = r1
            r15.L$1 = r1
            r15.L$2 = r1
            r15.L$3 = r5
            r15.L$4 = r1
            r15.L$5 = r1
            r13 = r18
            r15.J$0 = r13
            r15.label = r0
            r8 = r12
            r11 = r16
            r12 = r17
            java.lang.Object r6 = r7.downloadFileToCache(r8, r9, r10, r11, r12, r13, r15)
            if (r6 != r4) goto L29
            return r4
        L5d:
            com.facebook.aura.gateway.HatchFileOperations$stageWorkspaceFile$1 r15 = new com.facebook.aura.gateway.HatchFileOperations$stageWorkspaceFile$1
            r15.<init>(r3)
            goto L17
        L63:
            android.net.Uri r3 = X.C7Je.A01(r0)     // Catch: java.lang.Throwable -> L67
        L67:
            if (r3 != 0) goto L6a
            return r1
        L6a:
            java.lang.String r2 = r6.mimeType
            java.lang.String r1 = "application/octet-stream"
            if (r2 == 0) goto L7d
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L7d
            r5 = r2
        L77:
            com.facebook.aura.gateway.HatchFileOperations$StagedWorkspaceFile r4 = new com.facebook.aura.gateway.HatchFileOperations$StagedWorkspaceFile
            r4.<init>(r3, r5)
            return r4
        L7d:
            if (r5 != 0) goto L77
            r5 = r1
            goto L77
        L81:
            return r1
        L82:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchFileOperations.stageWorkspaceFile(android.content.Context, java.lang.String, java.lang.String, java.lang.String, X.CGz, java.io.File, long, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchThumbnailDisplaySize.values().length];
            try {
                AnonymousClass002.A13(HatchThumbnailDisplaySize.SMALL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchThumbnailDisplaySize.MEDIUM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchThumbnailDisplaySize.LARGE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ String buildAuthenticatedImageUrl$default(HatchFileOperations hatchFileOperations, String str, AbstractC3358CGz abstractC3358CGz, HatchThumbnailDisplaySize hatchThumbnailDisplaySize, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchThumbnailDisplaySize = null;
        }
        return hatchFileOperations.buildAuthenticatedImageUrl(str, abstractC3358CGz, hatchThumbnailDisplaySize);
    }

    public static /* synthetic */ List buildAuthenticatedVideoThumbnailUrls$default(HatchFileOperations hatchFileOperations, String str, AbstractC3358CGz abstractC3358CGz, HatchThumbnailDisplaySize hatchThumbnailDisplaySize, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchThumbnailDisplaySize = null;
        }
        return hatchFileOperations.buildAuthenticatedVideoThumbnailUrls(str, abstractC3358CGz, hatchThumbnailDisplaySize);
    }

    public static /* synthetic */ String buildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway$default(HatchFileOperations hatchFileOperations, String str, AbstractC3358CGz abstractC3358CGz, HatchThumbnailDisplaySize hatchThumbnailDisplaySize, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchThumbnailDisplaySize = null;
        }
        return hatchFileOperations.buildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(str, abstractC3358CGz, hatchThumbnailDisplaySize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildFSUrl(String str, String str2, AbstractC3358CGz abstractC3358CGz, String str3) {
        StringBuilder sb;
        String strA0d = null;
        C7384Etj.A0Y(str2, 0);
        if (str2.startsWith(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX) || str2.startsWith("https://") || str2.startsWith("content://")) {
            CFK.A06(HatchFileOperationsKt.TAG, FGI.A0d("buildFSUrl: passing through absolute URL; not wrapping as fs/", str, " scheme=", C7BY.A0W(str2, "://", str2)));
            return str2;
        }
        String gatewayUrl = HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz).getGatewayUrl();
        if (C7BY.A0j(gatewayUrl)) {
            sb = new StringBuilder("buildFSUrl: returning null \u2014 gatewayUrl is blank endpoint=");
            sb.append(str);
            sb.append(" relativePath=");
            sb.append(str2);
        } else {
            String strJarvisHttpBaseUrl = HatchHttpApi.INSTANCE.jarvisHttpBaseUrl(gatewayUrl);
            if (strJarvisHttpBaseUrl != null) {
                strA0d = FGI.A0d(strJarvisHttpBaseUrl, str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, encodeRelativePath(str2));
                if (str3 != null && str3.length() != 0) {
                    return FGI.A0U(strA0d, HatchOpenGraphRepository.UNKNOWN_HOST, str3);
                }
                return strA0d;
            }
            String strRedactedGatewayUrlForLog = HatcheryVMIdUtilsKt.redactedGatewayUrlForLog(gatewayUrl);
            sb = new StringBuilder("buildFSUrl: returning null \u2014 jarvisHttpBaseUrl null endpoint=");
            sb.append(str);
            sb.append(" relativePath=");
            sb.append(str2);
            sb.append(" wsUrl=");
            sb.append(strRedactedGatewayUrlForLog);
        }
        CFK.A06(HatchFileOperationsKt.TAG, sb.toString());
        return strA0d;
    }

    public static /* synthetic */ HatchRequestBody.Multipart buildUploadFileBody$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway$default(HatchFileOperations hatchFileOperations, String str, File file, Map map, boolean z, int i, Object obj) {
        Map<String, String> mapA0o = C3cH.A0o(map, i & 4);
        if ((i & 8) != 0) {
            z = true;
        }
        return hatchFileOperations.buildUploadFileBody$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(str, file, mapA0o, z);
    }

    private final String detectMimeTypeFromBytes(byte[] bArr) {
        return HatchMimeResolver.INSTANCE.mimeFromBytes(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String downloadErrorType(Exception exc) {
        return exc instanceof SecurityException ? "security_exception" : exc instanceof IOException ? "io_exception" : "exception";
    }

    public static /* synthetic */ Object downloadFileToCache$default(HatchFileOperations hatchFileOperations, Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, File file, long j, HtJ htJ, int i, Object obj) {
        if ((i & 16) != 0) {
            file = null;
        }
        if ((i & 32) != 0) {
            j = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
        return hatchFileOperations.downloadFileToCache(context, str, str2, abstractC3358CGz, file, j, htJ);
    }

    private final String extractWorkspaceMediaPath(String str) {
        String strA0K = C7BY.A0K(PodcastPresentationResolver.VM_HOME_PREFIX, str);
        String str2 = ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX;
        if (!C60O.A1X(strA0K, ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX)) {
            if (strA0K.startsWith("workspace/")) {
                return strA0K;
            }
            str2 = "~/";
            if (!strA0K.startsWith("~/")) {
                return null;
            }
        }
        return C7BY.A0K(str2, strA0K);
    }

    public static /* synthetic */ Object fetchMediaBytes$default(HatchFileOperations hatchFileOperations, String str, AbstractC3358CGz abstractC3358CGz, Long l, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        return hatchFileOperations.fetchMediaBytes(str, abstractC3358CGz, l, htJ);
    }

    public static /* synthetic */ Object fetchMediaToStreamDetailed$default(HatchFileOperations hatchFileOperations, String str, OutputStream outputStream, AbstractC3358CGz abstractC3358CGz, Long l, String str2, boolean z, boolean z2, Long l2, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            z2 = true;
        }
        if ((i & 128) != 0) {
            l2 = null;
        }
        return hatchFileOperations.fetchMediaToStreamDetailed(str, outputStream, abstractC3358CGz, l, str2, z, z2, l2, htJ);
    }

    public static /* synthetic */ Object fetchThumbnailBytes$default(HatchFileOperations hatchFileOperations, String str, AbstractC3358CGz abstractC3358CGz, HatchThumbnailDisplaySize hatchThumbnailDisplaySize, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchThumbnailDisplaySize = null;
        }
        return hatchFileOperations.fetchThumbnailBytes(str, abstractC3358CGz, hatchThumbnailDisplaySize, htJ);
    }

    private final String getMimeTypeFromFileName(String str) {
        return HatchMimeResolver.INSTANCE.mimeForName(str);
    }

    public static /* synthetic */ Object libraryFiles$default(HatchFileOperations hatchFileOperations, String str, AbstractC3358CGz abstractC3358CGz, Integer num, Integer num2, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        return hatchFileOperations.libraryFiles(str, abstractC3358CGz, num, num2, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object listDirectory$default(HatchFileOperations hatchFileOperations, String str, AbstractC3358CGz abstractC3358CGz, List list, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        return hatchFileOperations.listDirectory(str, abstractC3358CGz, list, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaStoreDestination mediaStoreDestination(String str) {
        Uri uri;
        String strA0M = FGI.A0M(Environment.DIRECTORY_DCIM, "/Muse");
        if (C60O.A1X(str, "image/")) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else {
            if (!str.startsWith("video/")) {
                Uri uri2 = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                C7384Etj.A0V(uri2);
                String str2 = Environment.DIRECTORY_DOWNLOADS;
                C7384Etj.A0V(str2);
                return new MediaStoreDestination(uri2, str2);
            }
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        C7384Etj.A0V(uri);
        return new MediaStoreDestination(uri, strA0M);
    }

    private final String mimeTypeToExtension(String str) {
        return HatchMimeResolver.INSTANCE.extensionForMime(str);
    }

    public static /* synthetic */ Object openMediaStream$default(HatchFileOperations hatchFileOperations, String str, AbstractC3358CGz abstractC3358CGz, Long l, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        return hatchFileOperations.openMediaStream(str, abstractC3358CGz, l, htJ);
    }

    private final byte[] readLocalUriPrefixBytes(Context context, String str, int i) throws IOException {
        Uri uriA01 = null;
        try {
            try {
                uriA01 = C7Je.A01(str);
            } catch (Exception e) {
                C3cH.A1B("Failed to read local URI prefix: ", e.getMessage(), HatchFileOperationsKt.TAG, e);
                return null;
            }
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 == null) {
            C60O.A1P("Failed to parse local URI: ", str, HatchFileOperationsKt.TAG);
            return null;
        }
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriA01);
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        try {
            byte[] prefix = INSTANCE.readPrefix(inputStreamOpenInputStream, i);
            inputStreamOpenInputStream.close();
            return prefix;
        } finally {
        }
    }

    private final byte[] readPrefix(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        if (i2 == i) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        C7384Etj.A0U(bArrCopyOf);
        return bArrCopyOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readPrefixForDownload(Context context, String str, int i, AbstractC3358CGz abstractC3358CGz, HtJ<? super byte[]> htJ) {
        return (C60O.A1X(str, "content://") || str.startsWith(HatchMessageKt.FILE_DISCUSSION_SCHEME)) ? readLocalUriPrefixBytes(context, str, i) : fetchMediaPrefixBytes(str, i, abstractC3358CGz, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object searchFiles$default(HatchFileOperations hatchFileOperations, AbstractC3358CGz abstractC3358CGz, String str, String str2, List list, Integer num, Integer num2, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        return hatchFileOperations.searchFiles(abstractC3358CGz, str, str2, list, num, num2, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object streamForDownload(Context context, String str, OutputStream outputStream, AbstractC3358CGz abstractC3358CGz, HtJ<? super String> htJ) {
        if (!C60O.A1X(str, "content://") && !str.startsWith(HatchMessageKt.FILE_DISCUSSION_SCHEME)) {
            return fetchMediaToStream(str, outputStream, abstractC3358CGz, htJ);
        }
        CountingOutputStream countingOutputStream = new CountingOutputStream(outputStream);
        if (streamLocalUriToStream(context, str, countingOutputStream)) {
            return null;
        }
        return countingOutputStream.writeFailed ? "write_failed" : "local_read_failed";
    }

    private final boolean streamLocalUriToStream(Context context, String str, OutputStream outputStream) throws IOException {
        Uri uriA01 = null;
        try {
            try {
                uriA01 = C7Je.A01(str);
            } catch (Exception e) {
                C3cH.A1B("Failed to stream local URI bytes: ", e.getMessage(), HatchFileOperationsKt.TAG, e);
                return false;
            }
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 == null) {
            C60O.A1P("Failed to parse local URI: ", str, HatchFileOperationsKt.TAG);
            return false;
        }
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriA01);
        if (inputStreamOpenInputStream == null) {
            return false;
        }
        try {
            F0H.A00(inputStreamOpenInputStream, outputStream);
            inputStreamOpenInputStream.close();
            return true;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LibraryResult toLibraryResult(FsLibraryPayloadJson fsLibraryPayloadJson) {
        List<FsLibraryEntryJson> list = fsLibraryPayloadJson.entries;
        ArrayList arrayListA0h = C3cG.A0h();
        for (FsLibraryEntryJson fsLibraryEntryJson : list) {
            String str = fsLibraryEntryJson.path;
            if (!C7BY.A0j(str)) {
                arrayListA0h.add(new LibraryEntry(fsLibraryEntryJson.name, str, fsLibraryEntryJson.size, fsLibraryEntryJson.modified_ms));
            }
        }
        Long l = fsLibraryPayloadJson.total;
        return new LibraryResult.Success(arrayListA0h, l != null ? l.longValue() : arrayListA0h.size(), fsLibraryPayloadJson.has_more);
    }

    private final long uploadDeadlineMs(long j) {
        if (j < 0) {
            j = 0;
        }
        return ((j * 1000) / 65536) + 180000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String uploadTransportErrorClass(Throwable th) {
        return th instanceof CancellationException ? "cancelled" : ((th instanceof NoNetworkException) || (th instanceof HatchTransportException)) ? HatchDataExportRepositoryKt.FAILURE_TRANSPORT : "exception";
    }

    public static /* synthetic */ Object writeFile$default(HatchFileOperations hatchFileOperations, String str, String str2, AbstractC3358CGz abstractC3358CGz, boolean z, boolean z2, boolean z3, String str3, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        boolean zA1Q = AnonymousClass005.A1Q(i, z2);
        if ((i & 32) != 0) {
            z3 = true;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        return hatchFileOperations.writeFile(str, str2, abstractC3358CGz, z, zA1Q, z3, str3, htJ);
    }

    public static /* synthetic */ Object writeFileBytes$default(HatchFileOperations hatchFileOperations, String str, byte[] bArr, AbstractC3358CGz abstractC3358CGz, boolean z, boolean z2, boolean z3, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        if ((i & 32) != 0) {
            z3 = true;
        }
        return hatchFileOperations.writeFileBytes(str, bArr, abstractC3358CGz, z, z2, z3, htJ);
    }

    public final Object fetchMediaToStreamDetailed(String str, OutputStream outputStream, AbstractC3358CGz abstractC3358CGz, Long l, String str2, boolean z, boolean z2, Long l2, HtJ<? super HatchHttpResponse> htJ) {
        return HatchHttpApi.INSTANCE.makeJarvisHttpRequestStreamingInternal(new JarvisPath.FsRaw(encodeRelativePath(str)), null, outputStream, RequestType.GET, abstractC3358CGz, l, AGH.A0E(), new HxE[0], str2, z, z2, l2, htJ);
    }

    public final String[] getSUPPORTED_ATTACHMENT_MIME_TYPES() {
        return SUPPORTED_ATTACHMENT_MIME_TYPES;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object openMediaStream(java.lang.String r13, X.AbstractC3358CGz r14, java.lang.Long r15, X.HtJ<? super java.io.InputStream> r16) {
        /*
            r12 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.gateway.HatchFileOperations.C120801
            if (r0 == 0) goto L64
            r11 = r3
            com.facebook.aura.gateway.HatchFileOperations$openMediaStream$1 r11 = (com.facebook.aura.gateway.HatchFileOperations.C120801) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r11.label = r2
        L14:
            java.lang.Object r3 = r11.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r1 = 1
            if (r0 == 0) goto L3f
            if (r0 != r1) goto L92
            java.lang.Object r0 = r11.L$0
            java.lang.String r13 = X.C3cG.A0d(r0, r3)
        L25:
            com.facebook.aura.network.http.HatchHttpStreamRequestResult r3 = (com.facebook.aura.network.http.HatchHttpStreamRequestResult) r3
            boolean r0 = r3 instanceof com.facebook.aura.network.http.HatchHttpStreamRequestSuccess
            r5 = 0
            java.lang.String r4 = "HatchFileOperations"
            if (r0 == 0) goto L7b
            com.facebook.aura.network.http.HatchHttpStreamRequestSuccess r3 = (com.facebook.aura.network.http.HatchHttpStreamRequestSuccess) r3
            com.facebook.aura.network.transport.HatchHttpResponseStream r3 = r3.response
            boolean r0 = r3.isSuccessful
            if (r0 == 0) goto L6a
            java.io.InputStream r0 = r3.body
            if (r0 == 0) goto L6a
            java.io.InputStream r2 = com.facebook.aura.network.transport.HatchHttpClientKt.selfClosingBody(r3)
            return r2
        L3f:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r3)
            java.lang.String r0 = r12.encodeRelativePath(r13)
            com.facebook.aura.network.api.JarvisPath$FsRaw r4 = new com.facebook.aura.network.api.JarvisPath$FsRaw
            r4.<init>(r0)
            com.facebook.aura.network.http.RequestType r5 = com.facebook.aura.network.http.RequestType.GET
            r0 = 0
            X.HxE[] r10 = new X.HxE[r0]
            r11.L$0 = r13
            r8 = 0
            r11.L$1 = r8
            r11.L$2 = r8
            r11.label = r1
            r6 = r14
            r7 = r15
            r9 = r8
            java.lang.Object r3 = r3.openJarvisHttpResponseStreamDetailedInternal(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r2) goto L25
            return r2
        L64:
            com.facebook.aura.gateway.HatchFileOperations$openMediaStream$1 r11 = new com.facebook.aura.gateway.HatchFileOperations$openMediaStream$1
            r11.<init>(r3)
            goto L14
        L6a:
            int r2 = r3.statusCode
            java.lang.String r1 = "GET /fs/raw/ (stream) returned HTTP "
            java.lang.String r0 = " for "
            java.lang.String r0 = X.FGI.A0W(r1, r0, r13, r2)
            X.CFK.A06(r4, r0)
            r3.close()
            return r5
        L7b:
            boolean r0 = r3 instanceof com.facebook.aura.network.http.HatchHttpStreamRequestFailure
            if (r0 == 0) goto L8d
            com.facebook.aura.network.http.HatchHttpStreamRequestFailure r3 = (com.facebook.aura.network.http.HatchHttpStreamRequestFailure) r3
            com.facebook.aura.network.http.HatchHttpFailure r0 = r3.failure
            java.lang.String r1 = r0.getLogValue()
            java.lang.String r0 = "Failed to open GET /fs/raw/ stream: "
            X.C60O.A1P(r0, r1, r4)
            return r5
        L8d:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L92:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchFileOperations.openMediaStream(java.lang.String, X.CGz, java.lang.Long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pruneStagedFiles(java.io.File r7, long r8, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.gateway.HatchFileOperations.C120811
            if (r0 == 0) goto L3a
            r5 = r10
            com.facebook.aura.gateway.HatchFileOperations$pruneStagedFiles$1 r5 = (com.facebook.aura.gateway.HatchFileOperations.C120811) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L40
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.gateway.HatchFileOperations$pruneStagedFiles$2 r0 = new com.facebook.aura.gateway.HatchFileOperations$pruneStagedFiles$2
            r0.<init>(r7, r8, r1)
            r5.L$0 = r1
            r5.J$0 = r8
            r5.label = r3
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)
            if (r0 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.gateway.HatchFileOperations$pruneStagedFiles$1 r5 = new com.facebook.aura.gateway.HatchFileOperations$pruneStagedFiles$1
            r5.<init>(r10)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchFileOperations.pruneStagedFiles(java.io.File, long, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes.dex */
    public abstract class DeleteResult {
        public static final int $stable = 8;

        public final class Failed extends DeleteResult {
            public static final int $stable = 0;
            public final String message;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
            }

            public final Failed copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.message, ((Failed) obj).message));
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.message;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public final String component1() {
                return this.message;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success extends DeleteResult {
            public static final int $stable = 0;
            public final String path;

            public Success(String str) {
                C7384Etj.A0Y(str, 0);
                this.path = str;
            }

            public final Success copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Success(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.path, ((Success) obj).path));
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.path;
                }
                C7384Etj.A0Y(str, 0);
                return new Success(str);
            }

            public final String component1() {
                return this.path;
            }

            public final String getPath() {
                return this.path;
            }

            public int hashCode() {
                return this.path.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public /* synthetic */ DeleteResult(C06H c06h) {
        }

        public DeleteResult() {
        }
    }

    public abstract class DownloadResult {
        public static final int $stable = 8;

        public final class Failed extends DownloadResult {
            public static final int $stable = 0;
            public final String errorType;
            public final String message;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Failed) {
                        Failed failed = (Failed) obj;
                        if (!C7384Etj.areEqual(this.message, failed.message) || !C7384Etj.areEqual(this.errorType, failed.errorType)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.message;
                }
                if ((i & 2) != 0) {
                    str2 = failed.errorType;
                }
                AnonymousClass003.A0u(str, str2);
                return new Failed(str, str2);
            }

            public final String component1() {
                return this.message;
            }

            public final String component2() {
                return this.errorType;
            }

            public final String getErrorType() {
                return this.errorType;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return AnonymousClass001.A0H(this.errorType, AnonymousClass001.A0G(this.message));
            }

            public Failed(String str, String str2) {
                AnonymousClass003.A0u(str, str2);
                this.message = str;
                this.errorType = str2;
            }

            public final Failed copy(String str, String str2) {
                AnonymousClass003.A0u(str, str2);
                return new Failed(str, str2);
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success extends DownloadResult {
            public static final int $stable = 0;
            public final String localPath;
            public final String mimeType;

            public Success(String str, String str2) {
                C7384Etj.A0Y(str, 0);
                this.localPath = str;
                this.mimeType = str2;
            }

            public final Success copy(String str, String str2) {
                C7384Etj.A0Y(str, 0);
                return new Success(str, str2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Success) {
                        Success success = (Success) obj;
                        if (!C7384Etj.areEqual(this.localPath, success.localPath) || !C7384Etj.areEqual(this.mimeType, success.mimeType)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.localPath;
                }
                if ((i & 2) != 0) {
                    str2 = success.mimeType;
                }
                C7384Etj.A0Y(str, 0);
                return new Success(str, str2);
            }

            public final String component1() {
                return this.localPath;
            }

            public final String component2() {
                return this.mimeType;
            }

            public final String getLocalPath() {
                return this.localPath;
            }

            public final String getMimeType() {
                return this.mimeType;
            }

            public int hashCode() {
                return AnonymousClass001.A0G(this.localPath) + AnonymousClass006.A0G(this.mimeType);
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ Success(String str, String str2, int i, C06H c06h) {
                this(str, AnonymousClass006.A0s(i, str2));
            }
        }

        public /* synthetic */ DownloadResult(C06H c06h) {
        }

        public DownloadResult() {
        }
    }

    /* loaded from: classes4.dex */
    public abstract class FetchArtifactUrlResult {
        public static final int $stable = 8;

        /* loaded from: classes.dex */
        public final class Failed extends FetchArtifactUrlResult {
            public static final int $stable = 0;
            public final String reason;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.reason = str;
            }

            public final Failed copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.reason, ((Failed) obj).reason));
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.reason;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public final String component1() {
                return this.reason;
            }

            public final String getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        /* loaded from: classes.dex */
        public final class Success extends FetchArtifactUrlResult {
            public static final int $stable = 0;
            public final String lastUpdated;
            public final String url;

            public Success(String str, String str2) {
                C7384Etj.A0Y(str, 0);
                this.url = str;
                this.lastUpdated = str2;
            }

            public final Success copy(String str, String str2) {
                C7384Etj.A0Y(str, 0);
                return new Success(str, str2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Success) {
                        Success success = (Success) obj;
                        if (!C7384Etj.areEqual(this.url, success.url) || !C7384Etj.areEqual(this.lastUpdated, success.lastUpdated)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.url;
                }
                if ((i & 2) != 0) {
                    str2 = success.lastUpdated;
                }
                C7384Etj.A0Y(str, 0);
                return new Success(str, str2);
            }

            public final String component1() {
                return this.url;
            }

            public final String component2() {
                return this.lastUpdated;
            }

            public final String getLastUpdated() {
                return this.lastUpdated;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return AnonymousClass001.A0G(this.url) + AnonymousClass006.A0G(this.lastUpdated);
            }

            public String toString() {
                return super.toString();
            }
        }

        public /* synthetic */ FetchArtifactUrlResult(C06H c06h) {
        }

        public FetchArtifactUrlResult() {
        }
    }

    public abstract class LibraryResult {
        public static final int $stable = 8;

        public final class Failed extends LibraryResult {
            public static final int $stable = 0;
            public final String message;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
            }

            public final Failed copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.message, ((Failed) obj).message));
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.message;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public final String component1() {
                return this.message;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success extends LibraryResult {
            public static final int $stable = 8;
            public final List<LibraryEntry> entries;
            public final boolean hasMore;
            public final long total;

            public Success(List<LibraryEntry> list, long j, boolean z) {
                C7384Etj.A0Y(list, 0);
                this.entries = list;
                this.total = j;
                this.hasMore = z;
            }

            public final Success copy(List<LibraryEntry> list, long j, boolean z) {
                C7384Etj.A0Y(list, 0);
                return new Success(list, j, z);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Success) {
                        Success success = (Success) obj;
                        if (!C7384Etj.areEqual(this.entries, success.entries) || this.total != success.total || this.hasMore != success.hasMore) {
                        }
                    }
                    return false;
                }
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Success copy$default(Success success, List list, long j, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = success.entries;
                }
                if ((i & 2) != 0) {
                    j = success.total;
                }
                if ((i & 4) != 0) {
                    z = success.hasMore;
                }
                return success.copy(list, j, z);
            }

            public final List<LibraryEntry> component1() {
                return this.entries;
            }

            public final long component2() {
                return this.total;
            }

            public final boolean component3() {
                return this.hasMore;
            }

            public final List<LibraryEntry> getEntries() {
                return this.entries;
            }

            public final boolean getHasMore() {
                return this.hasMore;
            }

            public final long getTotal() {
                return this.total;
            }

            public int hashCode() {
                return C0KA.A00(C60R.A00(this.total, AnonymousClass005.A0E(this.entries)), this.hasMore);
            }

            public String toString() {
                return super.toString();
            }
        }

        public /* synthetic */ LibraryResult(C06H c06h) {
        }

        public LibraryResult() {
        }
    }

    /* loaded from: classes.dex */
    public abstract class ListResult {
        public static final int $stable = 8;

        public final class Failed extends ListResult {
            public static final int $stable = 0;
            public final String message;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
            }

            public final Failed copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.message, ((Failed) obj).message));
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.message;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public final String component1() {
                return this.message;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success extends ListResult {
            public static final int $stable = 8;
            public final List<FileEntry> entries;
            public final String path;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Success) {
                        Success success = (Success) obj;
                        if (!C7384Etj.areEqual(this.path, success.path) || !C7384Etj.areEqual(this.entries, success.entries)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.path;
                }
                if ((i & 2) != 0) {
                    list = success.entries;
                }
                AnonymousClass003.A0u(str, list);
                return new Success(str, list);
            }

            public final String component1() {
                return this.path;
            }

            public final List<FileEntry> component2() {
                return this.entries;
            }

            public final List<FileEntry> getEntries() {
                return this.entries;
            }

            public final String getPath() {
                return this.path;
            }

            public int hashCode() {
                return AnonymousClass005.A0G(this.entries, AnonymousClass001.A0G(this.path));
            }

            public Success(String str, List<FileEntry> list) {
                AnonymousClass003.A0u(str, list);
                this.path = str;
                this.entries = list;
            }

            public final Success copy(String str, List<FileEntry> list) {
                AnonymousClass003.A0u(str, list);
                return new Success(str, list);
            }

            public String toString() {
                return super.toString();
            }
        }

        public /* synthetic */ ListResult(C06H c06h) {
        }

        public ListResult() {
        }
    }

    public abstract class RemoveArtifactResult {
        public static final int $stable = 8;

        public final class Failed extends RemoveArtifactResult {
            public static final int $stable = 0;
            public final String reason;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.reason = str;
            }

            public final Failed copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.reason, ((Failed) obj).reason));
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.reason;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public final String component1() {
                return this.reason;
            }

            public final String getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success extends RemoveArtifactResult {
            public static final int $stable = 0;
            public final String destroyed;

            public Success(String str) {
                C7384Etj.A0Y(str, 0);
                this.destroyed = str;
            }

            public final Success copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Success(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.destroyed, ((Success) obj).destroyed));
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.destroyed;
                }
                C7384Etj.A0Y(str, 0);
                return new Success(str);
            }

            public final String component1() {
                return this.destroyed;
            }

            public final String getDestroyed() {
                return this.destroyed;
            }

            public int hashCode() {
                return this.destroyed.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public /* synthetic */ RemoveArtifactResult(C06H c06h) {
        }

        public RemoveArtifactResult() {
        }
    }

    public abstract class RenameResult {
        public static final int $stable = 8;

        public final class Failed extends RenameResult {
            public static final int $stable = 0;
            public final String message;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
            }

            public final Failed copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.message, ((Failed) obj).message));
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.message;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public final String component1() {
                return this.message;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success extends RenameResult {
            public static final int $stable = 0;
            public final String destination;
            public final String source;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Success) {
                        Success success = (Success) obj;
                        if (!C7384Etj.areEqual(this.source, success.source) || !C7384Etj.areEqual(this.destination, success.destination)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.source;
                }
                if ((i & 2) != 0) {
                    str2 = success.destination;
                }
                AnonymousClass003.A0u(str, str2);
                return new Success(str, str2);
            }

            public final String component1() {
                return this.source;
            }

            public final String component2() {
                return this.destination;
            }

            public final String getDestination() {
                return this.destination;
            }

            public final String getSource() {
                return this.source;
            }

            public int hashCode() {
                return AnonymousClass001.A0H(this.destination, AnonymousClass001.A0G(this.source));
            }

            public Success(String str, String str2) {
                AnonymousClass003.A0u(str, str2);
                this.source = str;
                this.destination = str2;
            }

            public final Success copy(String str, String str2) {
                AnonymousClass003.A0u(str, str2);
                return new Success(str, str2);
            }

            public String toString() {
                return super.toString();
            }
        }

        public /* synthetic */ RenameResult(C06H c06h) {
        }

        public RenameResult() {
        }
    }

    public abstract class ShareArtifactResult {
        public static final int $stable = 8;

        public final class Failed extends ShareArtifactResult {
            public static final int $stable = 0;
            public final String reason;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.reason = str;
            }

            public final Failed copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.reason, ((Failed) obj).reason));
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.reason;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public final String component1() {
                return this.reason;
            }

            public final String getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success extends ShareArtifactResult {
            public static final int $stable = 0;
            public final String url;

            public Success(String str) {
                C7384Etj.A0Y(str, 0);
                this.url = str;
            }

            public final Success copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Success(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.url, ((Success) obj).url));
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.url;
                }
                C7384Etj.A0Y(str, 0);
                return new Success(str);
            }

            public final String component1() {
                return this.url;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public /* synthetic */ ShareArtifactResult(C06H c06h) {
        }

        public ShareArtifactResult() {
        }
    }

    /* loaded from: classes4.dex */
    public abstract class SpaceShareResult {
        public static final int $stable = 8;

        public final class Failed extends SpaceShareResult {
            public static final int $stable = 0;
            public final String reason;
            public final String serverMessage;
            public final Integer statusCode;

            public Failed(String str, Integer num, String str2) {
                C7384Etj.A0Y(str, 0);
                this.reason = str;
                this.statusCode = num;
                this.serverMessage = str2;
            }

            public final Failed copy(String str, Integer num, String str2) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str, num, str2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Failed) {
                        Failed failed = (Failed) obj;
                        if (!C7384Etj.areEqual(this.reason, failed.reason) || !C7384Etj.areEqual(this.statusCode, failed.statusCode) || !C7384Etj.areEqual(this.serverMessage, failed.serverMessage)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, Integer num, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.reason;
                }
                if ((i & 2) != 0) {
                    num = failed.statusCode;
                }
                if ((i & 4) != 0) {
                    str2 = failed.serverMessage;
                }
                return failed.copy(str, num, str2);
            }

            public final String component1() {
                return this.reason;
            }

            public final Integer component2() {
                return this.statusCode;
            }

            public final String component3() {
                return this.serverMessage;
            }

            public final String getReason() {
                return this.reason;
            }

            public final String getServerMessage() {
                return this.serverMessage;
            }

            public final Integer getStatusCode() {
                return this.statusCode;
            }

            public int hashCode() {
                return ((AnonymousClass001.A0G(this.reason) + AnonymousClass006.A0D(this.statusCode)) * 31) + AnonymousClass005.A0H(this.serverMessage);
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ Failed(String str, Integer num, String str2, int i, C06H c06h) {
                this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
            }
        }

        public final class NeedsDisclosureConfirmation extends SpaceShareResult {
            public static final int $stable = 0;
            public final SpaceShareDisclosure disclosure;
            public final String summary;
            public final String token;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof NeedsDisclosureConfirmation) {
                        NeedsDisclosureConfirmation needsDisclosureConfirmation = (NeedsDisclosureConfirmation) obj;
                        if (!C7384Etj.areEqual(this.token, needsDisclosureConfirmation.token) || !C7384Etj.areEqual(this.disclosure, needsDisclosureConfirmation.disclosure) || !C7384Etj.areEqual(this.summary, needsDisclosureConfirmation.summary)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ NeedsDisclosureConfirmation copy$default(NeedsDisclosureConfirmation needsDisclosureConfirmation, String str, SpaceShareDisclosure spaceShareDisclosure, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = needsDisclosureConfirmation.token;
                }
                if ((i & 2) != 0) {
                    spaceShareDisclosure = needsDisclosureConfirmation.disclosure;
                }
                if ((i & 4) != 0) {
                    str2 = needsDisclosureConfirmation.summary;
                }
                return needsDisclosureConfirmation.copy(str, spaceShareDisclosure, str2);
            }

            public final String component1() {
                return this.token;
            }

            public final SpaceShareDisclosure component2() {
                return this.disclosure;
            }

            public final String component3() {
                return this.summary;
            }

            public final SpaceShareDisclosure getDisclosure() {
                return this.disclosure;
            }

            public final String getSummary() {
                return this.summary;
            }

            public final String getToken() {
                return this.token;
            }

            public int hashCode() {
                return AnonymousClass005.A0F(this.disclosure, AnonymousClass001.A0G(this.token)) + AnonymousClass006.A0G(this.summary);
            }

            public NeedsDisclosureConfirmation(String str, SpaceShareDisclosure spaceShareDisclosure, String str2) {
                AnonymousClass003.A0u(str, spaceShareDisclosure);
                this.token = str;
                this.disclosure = spaceShareDisclosure;
                this.summary = str2;
            }

            public final NeedsDisclosureConfirmation copy(String str, SpaceShareDisclosure spaceShareDisclosure, String str2) {
                AnonymousClass003.A0u(str, spaceShareDisclosure);
                return new NeedsDisclosureConfirmation(str, spaceShareDisclosure, str2);
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ NeedsDisclosureConfirmation(String str, SpaceShareDisclosure spaceShareDisclosure, String str2, int i, C06H c06h) {
                this(str, spaceShareDisclosure, AnonymousClass006.A0t(i, str2));
            }
        }

        public final class PolicyRefused extends SpaceShareResult {
            public static final int $stable = 0;
            public final String message;

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof PolicyRefused) && C7384Etj.areEqual(this.message, ((PolicyRefused) obj).message));
            }

            public static /* synthetic */ PolicyRefused copy$default(PolicyRefused policyRefused, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = policyRefused.message;
                }
                return new PolicyRefused(str);
            }

            public final String component1() {
                return this.message;
            }

            public final PolicyRefused copy(String str) {
                return new PolicyRefused(str);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return AnonymousClass006.A0G(this.message);
            }

            public PolicyRefused(String str) {
                this.message = str;
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success extends SpaceShareResult {
            public static final int $stable = 0;
            public final String shareType;
            public final String url;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Success) {
                        Success success = (Success) obj;
                        if (!C7384Etj.areEqual(this.url, success.url) || !C7384Etj.areEqual(this.shareType, success.shareType)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.url;
                }
                if ((i & 2) != 0) {
                    str2 = success.shareType;
                }
                return new Success(str, str2);
            }

            public final String component1() {
                return this.url;
            }

            public final String component2() {
                return this.shareType;
            }

            public final Success copy(String str, String str2) {
                return new Success(str, str2);
            }

            public final String getShareType() {
                return this.shareType;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return (AnonymousClass006.A0G(this.url) * 31) + AnonymousClass005.A0H(this.shareType);
            }

            public Success(String str, String str2) {
                this.url = str;
                this.shareType = str2;
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ Success(String str, String str2, int i, C06H c06h) {
                this(str, AnonymousClass006.A0s(i, str2));
            }
        }

        public /* synthetic */ SpaceShareResult(C06H c06h) {
        }

        public SpaceShareResult() {
        }
    }

    /* loaded from: classes.dex */
    public abstract class StatResult {
        public static final int $stable = 8;

        public final class Failed extends StatResult {
            public static final int $stable = 0;
            public final String message;
            public final Integer statusCode;

            public Failed(String str, Integer num) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
                this.statusCode = num;
            }

            public final Failed copy(String str, Integer num) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str, num);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Failed) {
                        Failed failed = (Failed) obj;
                        if (!C7384Etj.areEqual(this.message, failed.message) || !C7384Etj.areEqual(this.statusCode, failed.statusCode)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.message;
                }
                if ((i & 2) != 0) {
                    num = failed.statusCode;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str, num);
            }

            public final String component1() {
                return this.message;
            }

            public final Integer component2() {
                return this.statusCode;
            }

            public final String getMessage() {
                return this.message;
            }

            public final Integer getStatusCode() {
                return this.statusCode;
            }

            public int hashCode() {
                return AnonymousClass001.A0G(this.message) + AnonymousClass006.A0D(this.statusCode);
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ Failed(String str, Integer num, int i, C06H c06h) {
                this(str, (i & 2) != 0 ? null : num);
            }
        }

        /* loaded from: classes3.dex */
        public final class Success extends StatResult {
            public static final int $stable = 0;
            public final FileEntry entry;
            public final String path;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Success) {
                        Success success = (Success) obj;
                        if (!C7384Etj.areEqual(this.path, success.path) || !C7384Etj.areEqual(this.entry, success.entry)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, FileEntry fileEntry, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.path;
                }
                if ((i & 2) != 0) {
                    fileEntry = success.entry;
                }
                AnonymousClass003.A0u(str, fileEntry);
                return new Success(str, fileEntry);
            }

            public final String component1() {
                return this.path;
            }

            public final FileEntry component2() {
                return this.entry;
            }

            public final FileEntry getEntry() {
                return this.entry;
            }

            public final String getPath() {
                return this.path;
            }

            public int hashCode() {
                return AnonymousClass005.A0G(this.entry, AnonymousClass001.A0G(this.path));
            }

            public Success(String str, FileEntry fileEntry) {
                AnonymousClass003.A0u(str, fileEntry);
                this.path = str;
                this.entry = fileEntry;
            }

            public final Success copy(String str, FileEntry fileEntry) {
                AnonymousClass003.A0u(str, fileEntry);
                return new Success(str, fileEntry);
            }

            public String toString() {
                return super.toString();
            }
        }

        public /* synthetic */ StatResult(C06H c06h) {
        }

        public StatResult() {
        }
    }

    /* loaded from: classes.dex */
    public abstract class WriteResult {
        public static final int $stable = 8;

        /* loaded from: classes3.dex */
        public final class Failed extends WriteResult {
            public static final int $stable = 0;
            public final String code;
            public final String errorClass;
            public final Integer httpStatus;
            public final String message;

            public final Failed copy(String str, String str2, String str3, Integer num) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str, str2, str3, num);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Failed) {
                        Failed failed = (Failed) obj;
                        if (!C7384Etj.areEqual(this.message, failed.message) || !C7384Etj.areEqual(this.code, failed.code) || !C7384Etj.areEqual(this.errorClass, failed.errorClass) || !C7384Etj.areEqual(this.httpStatus, failed.httpStatus)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public /* synthetic */ Failed(String str, String str2, String str3, Integer num, int i, C06H c06h) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, String str2, String str3, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.message;
                }
                if ((i & 2) != 0) {
                    str2 = failed.code;
                }
                if ((i & 4) != 0) {
                    str3 = failed.errorClass;
                }
                if ((i & 8) != 0) {
                    num = failed.httpStatus;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str, str2, str3, num);
            }

            public final String component1() {
                return this.message;
            }

            public final String component2() {
                return this.code;
            }

            public final String component3() {
                return this.errorClass;
            }

            public final Integer component4() {
                return this.httpStatus;
            }

            public final String getCode() {
                return this.code;
            }

            public final String getErrorClass() {
                return this.errorClass;
            }

            public final Integer getHttpStatus() {
                return this.httpStatus;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return ((((AnonymousClass001.A0G(this.message) + AnonymousClass006.A0G(this.code)) * 31) + AnonymousClass006.A0G(this.errorClass)) * 31) + C3cH.A02(this.httpStatus);
            }

            public String toString() {
                return super.toString();
            }

            public Failed(String str, String str2, String str3, Integer num) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
                this.code = str2;
                this.errorClass = str3;
                this.httpStatus = num;
            }
        }

        /* loaded from: classes3.dex */
        public final class Success extends WriteResult {
            public static final int $stable = 0;
            public final int bytesWritten;
            public final String path;

            public Success(String str, int i) {
                C7384Etj.A0Y(str, 0);
                this.path = str;
                this.bytesWritten = i;
            }

            public final Success copy(String str, int i) {
                C7384Etj.A0Y(str, 0);
                return new Success(str, i);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Success) {
                        Success success = (Success) obj;
                        if (!C7384Etj.areEqual(this.path, success.path) || this.bytesWritten != success.bytesWritten) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = success.path;
                }
                if ((i2 & 2) != 0) {
                    i = success.bytesWritten;
                }
                C7384Etj.A0Y(str, 0);
                return new Success(str, i);
            }

            public final String component1() {
                return this.path;
            }

            public final int component2() {
                return this.bytesWritten;
            }

            public final int getBytesWritten() {
                return this.bytesWritten;
            }

            public final String getPath() {
                return this.path;
            }

            public int hashCode() {
                return AnonymousClass001.A0G(this.path) + this.bytesWritten;
            }

            public String toString() {
                return super.toString();
            }
        }

        public /* synthetic */ WriteResult(C06H c06h) {
        }

        public WriteResult() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceToInt(long j) {
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return (int) j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchMediaPrefixBytes(String str, int i, AbstractC3358CGz abstractC3358CGz, HtJ<? super byte[]> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120722(str, i, abstractC3358CGz, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchMediaToStream(String str, OutputStream outputStream, AbstractC3358CGz abstractC3358CGz, HtJ<? super String> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120742(outputStream, str, abstractC3358CGz, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchMultipartPart formField(String str, String str2) {
        return new HatchMultipartPart(str, null, "text/plain", C3cG.A1S(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String presetValue(HatchThumbnailDisplaySize hatchThumbnailDisplaySize) {
        int iOrdinal = hatchThumbnailDisplaySize.ordinal();
        if (iOrdinal == 0) {
            return "image_thumb";
        }
        if (iOrdinal == 1) {
            return "sm";
        }
        if (iOrdinal == 2) {
            return "lg";
        }
        throw C3cG.A0q();
    }

    public final String buildAuthenticatedImageUrl(String str, AbstractC3358CGz abstractC3358CGz, HatchThumbnailDisplaySize hatchThumbnailDisplaySize) {
        AnonymousClass003.A0u(str, abstractC3358CGz);
        String strExtractWorkspaceMediaPath = extractWorkspaceMediaPath(str);
        if (strExtractWorkspaceMediaPath == null) {
            return null;
        }
        String strBuildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway = buildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(strExtractWorkspaceMediaPath, abstractC3358CGz, hatchThumbnailDisplaySize);
        return strBuildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway == null ? buildFSRawFileUrl(strExtractWorkspaceMediaPath, abstractC3358CGz) : strBuildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway;
    }

    public final String buildAuthenticatedRawImageUrl(String str, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(str, abstractC3358CGz);
        String strExtractWorkspaceMediaPath = extractWorkspaceMediaPath(str);
        if (strExtractWorkspaceMediaPath == null) {
            return null;
        }
        return buildFSRawFileUrl(strExtractWorkspaceMediaPath, abstractC3358CGz);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[PHI: r1
  0x0036: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v2 java.lang.String) binds: [B:3:0x0009, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> buildAuthenticatedVideoThumbnailUrls(java.lang.String r3, X.AbstractC3358CGz r4, com.facebook.aura.gateway.HatchThumbnailDisplaySize r5) {
        /*
            r2 = this;
            X.AnonymousClass003.A0u(r3, r4)
            java.lang.String r1 = "sandbox://"
            boolean r0 = r3.startsWith(r1)
            if (r0 != 0) goto L36
            java.lang.String r0 = "workspace/"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L3a
            java.lang.String r1 = "~/"
            boolean r0 = r3.startsWith(r1)
            if (r0 != 0) goto L36
            java.lang.String r0 = "http://"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "https://"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "content://"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L3a
        L33:
            X.AGi r0 = X.C0881AGi.A00
            return r0
        L36:
            java.lang.String r3 = X.C7BY.A0K(r1, r3)
        L3a:
            java.lang.String r0 = r2.buildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(r3, r4, r5)
            java.util.List r0 = X.AbstractC0885AGm.A0z(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchFileOperations.buildAuthenticatedVideoThumbnailUrls(java.lang.String, X.CGz, com.facebook.aura.gateway.HatchThumbnailDisplaySize):java.util.List");
    }

    public final String buildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(String str, AbstractC3358CGz abstractC3358CGz, HatchThumbnailDisplaySize hatchThumbnailDisplaySize) {
        AnonymousClass003.A0u(str, abstractC3358CGz);
        return buildFSUrl(HatchUrlSegments.FS_THUMBNAIL_BASE, str, abstractC3358CGz, hatchThumbnailDisplaySize != null ? FGI.A0M("p=", INSTANCE.presetValue(hatchThumbnailDisplaySize)) : null);
    }

    public final Object deleteFile(String str, AbstractC3358CGz abstractC3358CGz, boolean z, HtJ<? super DeleteResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, z, abstractC3358CGz, null));
    }

    public final Object downloadFile(Context context, String str, AbstractC3358CGz abstractC3358CGz, String str2, HtJ<? super DownloadResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120672(context, str, str2, abstractC3358CGz, null));
    }

    public final Object downloadFileToCache(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, File file, long j, HtJ<? super DownloadResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120682(context, str, str2, abstractC3358CGz, file, j, null));
    }

    public final Object exportPdf(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super byte[]> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120692(str, abstractC3358CGz, null));
    }

    public final Object fetchArtifactUrl(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super FetchArtifactUrlResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120702(abstractC3358CGz, str, null));
    }

    public final Object fetchMediaBytes(String str, AbstractC3358CGz abstractC3358CGz, Long l, HtJ<? super byte[]> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120712(str, abstractC3358CGz, l, null));
    }

    public final Object fetchMediaToFile(String str, File file, AbstractC3358CGz abstractC3358CGz, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120732(file, str, abstractC3358CGz, null));
    }

    public final Object fetchSpaceShareUrl(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super SpaceShareResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120752(str, abstractC3358CGz, null));
    }

    public final Object fetchThumbnailBytes(String str, AbstractC3358CGz abstractC3358CGz, HatchThumbnailDisplaySize hatchThumbnailDisplaySize, HtJ<? super ThumbnailFetchOutcome> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120762(str, hatchThumbnailDisplaySize, abstractC3358CGz, null));
    }

    public final Object isImageContent(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120772(str, abstractC3358CGz, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r1.startsWith(com.facebook.aura.network.api.HatchUrlSegments.FS_THUMBNAIL_SEGMENT) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isOwnGatewayFsUrl(java.lang.String r6, X.AbstractC3358CGz r7) {
        /*
            r5 = this;
            boolean r5 = X.AnonymousClass004.A1b(r6, r7)
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> La
            r3.<init>(r6)     // Catch: java.lang.Throwable -> La
            goto Lf
        La:
            r0 = move-exception
            X.Hud r3 = X.C3cG.A0s(r0)
        Lf:
            boolean r0 = r3 instanceof X.C10571Hud
            r2 = 0
            if (r0 == 0) goto L15
            r3 = r2
        L15:
            java.net.URL r3 = (java.net.URL) r3
            r4 = 0
            if (r3 == 0) goto L46
            java.lang.String r1 = r3.getProtocol()
            java.lang.String r0 = "https"
            if (r1 == 0) goto L46
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L46
            java.lang.String r1 = r3.getPath()
            X.C7384Etj.A0U(r1)
            java.lang.String r0 = "/fs/raw/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L47
            java.lang.String r1 = r3.getPath()
            X.C7384Etj.A0U(r1)
            java.lang.String r0 = "/fs/thumbnail/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L47
        L46:
            return r5
        L47:
            com.facebook.aura.network.http.HatchHttpApi r1 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r0 = X.C60P.A1K(r7)
            java.lang.String r1 = r1.jarvisHttpBaseUrl(r0)
            if (r1 == 0) goto L7e
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r0.getHost()     // Catch: java.lang.Throwable -> L5d
            goto L62
        L5d:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L62:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 != 0) goto L67
            r2 = r1
        L67:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L7e
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 != 0) goto L7e
            java.lang.String r0 = r3.getHost()
            if (r0 == 0) goto L7e
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L7e
            r4 = 1
        L7e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchFileOperations.isOwnGatewayFsUrl(java.lang.String, X.CGz):boolean");
    }

    public final Object libraryFiles(String str, AbstractC3358CGz abstractC3358CGz, Integer num, Integer num2, HtJ<? super LibraryResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120782(str, num, num2, abstractC3358CGz, null));
    }

    public final Object listDirectory(String str, AbstractC3358CGz abstractC3358CGz, List<String> list, HtJ<? super ListResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120792(str, list, abstractC3358CGz, null));
    }

    public final Object readFile(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super String> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120832(str, abstractC3358CGz, null));
    }

    public final Object readFileFromVm(String str, String str2, String str3, HtJ<? super String> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120842(str, str2, str3, null));
    }

    public final Object removeArtifact(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super RemoveArtifactResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120852(abstractC3358CGz, str, null));
    }

    public final Object removeSpaceShare(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120862(str, abstractC3358CGz, null));
    }

    public final Object renameFile(String str, String str2, AbstractC3358CGz abstractC3358CGz, boolean z, HtJ<? super RenameResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120872(str, str2, z, abstractC3358CGz, null));
    }

    public final void retireAndDeleteStagingDir(File file, final String str, final String str2) {
        AnonymousClass005.A0x(file, str, str2);
        final File parentFile = file.getParentFile();
        if (parentFile != null) {
            try {
                if (!file.exists() || file.renameTo(C3cG.A0O(parentFile, AnonymousClass006.A0y(UUID.randomUUID(), str, C60O.A0w())))) {
                    C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.gateway.HatchFileOperations.retireAndDeleteStagingDir.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                File[] fileArrListFiles = parentFile.listFiles();
                                if (fileArrListFiles != null) {
                                    String str3 = str;
                                    ArrayList arrayListA0h = C3cG.A0h();
                                    for (File file2 : fileArrListFiles) {
                                        String name = file2.getName();
                                        C7384Etj.A0U(name);
                                        C7384Etj.A0Y(str3, 1);
                                        if (name.startsWith(str3)) {
                                            arrayListA0h.add(file2);
                                        }
                                    }
                                    Iterator it = arrayListA0h.iterator();
                                    while (it.hasNext()) {
                                        C60R.A1Q(it);
                                    }
                                }
                            } catch (Exception unused) {
                                CFK.A06(str2, "Could not delete staged files");
                            }
                        }
                    });
                } else {
                    CFK.A06(str2, "Could not move staged files aside for deletion");
                }
            } catch (Exception unused) {
                CFK.A06(str2, "Could not retire staged files");
            }
        }
    }

    public final Object searchFiles(AbstractC3358CGz abstractC3358CGz, String str, String str2, List<String> list, Integer num, Integer num2, HtJ<? super LibraryResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120912(str, str2, list, num, num2, abstractC3358CGz, null));
    }

    public final Object shareArtifact(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super ShareArtifactResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120922(str, abstractC3358CGz, null));
    }

    public final Object shareSpace(String str, AbstractC3358CGz abstractC3358CGz, boolean z, String str2, HtJ<? super SpaceShareResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120932(str, z, str2, abstractC3358CGz, null));
    }

    public final Object statFile(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super StatResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120952(str, abstractC3358CGz, null));
    }

    public final Object uploadFile(String str, File file, AbstractC3358CGz abstractC3358CGz, Map<String, String> map, HtJ<? super WriteResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120962(abstractC3358CGz, str, file, map, null));
    }

    public final Object uploadFileBytes(String str, byte[] bArr, AbstractC3358CGz abstractC3358CGz, Map<String, String> map, HtJ<? super WriteResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120972(abstractC3358CGz, str, bArr, map, null));
    }

    public final Object uploadFileWithoutOverwrite(String str, File file, AbstractC3358CGz abstractC3358CGz, String str2, long j, HtJ<? super ExclusiveWriteResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120982(j, str, str2, file, abstractC3358CGz, null));
    }

    public final Object writeFile(String str, String str2, AbstractC3358CGz abstractC3358CGz, boolean z, boolean z2, boolean z3, String str3, HtJ<? super WriteResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120992(str2, str, z, z2, z3, str3, abstractC3358CGz, null));
    }

    public final Object writeFileBytes(String str, byte[] bArr, AbstractC3358CGz abstractC3358CGz, boolean z, boolean z2, boolean z3, HtJ<? super WriteResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C121002(bArr, str, z, z2, z3, abstractC3358CGz, null));
    }

    public final Object readFile(String str, AbstractC3358CGz abstractC3358CGz, long j, String str2, HtJ<? super String> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass4(j, str, abstractC3358CGz, str2, null));
    }
}
