package com.facebook.aura.file.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.Ey9;

/* loaded from: classes4.dex */
public interface HatchPublishBottomSheetState {

    public final class Failed extends C06G implements HatchPublishBottomSheetState {
        public final String fileName;
        public final String projectDir;
        public final RetryAction retryAction;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failed) {
                    Failed failed = (Failed) obj;
                    if (!C7384Etj.areEqual(this.fileName, failed.fileName) || !C7384Etj.areEqual(this.projectDir, failed.projectDir) || this.retryAction != failed.retryAction) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, String str2, RetryAction retryAction, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.fileName;
            }
            if ((i & 2) != 0) {
                str2 = failed.projectDir;
            }
            if ((i & 4) != 0) {
                retryAction = failed.retryAction;
            }
            return failed.copy(str, str2, retryAction);
        }

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.projectDir;
        }

        public final RetryAction component3() {
            return this.retryAction;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getProjectDir() {
            return this.projectDir;
        }

        public final RetryAction getRetryAction() {
            return this.retryAction;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.retryAction, AnonymousClass005.A0I(this.projectDir, AnonymousClass001.A0G(this.fileName)));
        }

        public Failed(String str, String str2, RetryAction retryAction) {
            AnonymousClass005.A0x(str, str2, retryAction);
            this.fileName = str;
            this.projectDir = str2;
            this.retryAction = retryAction;
        }

        public final Failed copy(String str, String str2, RetryAction retryAction) {
            AnonymousClass005.A0x(str, str2, retryAction);
            return new Failed(str, str2, retryAction);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Failed(String str, String str2, RetryAction retryAction, int i, C06H c06h) {
            this(str, str2, (i & 4) != 0 ? RetryAction.DEPLOY : retryAction);
        }
    }

    public final class HasChanges extends C06G implements HatchPublishBottomSheetState {
        public final String fileName;
        public final boolean isPublishing;
        public final boolean isUnpublishing;
        public final String projectDir;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof HasChanges) {
                    HasChanges hasChanges = (HasChanges) obj;
                    if (!C7384Etj.areEqual(this.fileName, hasChanges.fileName) || !C7384Etj.areEqual(this.projectDir, hasChanges.projectDir) || !C7384Etj.areEqual(this.url, hasChanges.url) || this.isPublishing != hasChanges.isPublishing || this.isUnpublishing != hasChanges.isUnpublishing) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ HasChanges copy$default(HasChanges hasChanges, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hasChanges.fileName;
            }
            if ((i & 2) != 0) {
                str2 = hasChanges.projectDir;
            }
            if ((i & 4) != 0) {
                str3 = hasChanges.url;
            }
            if ((i & 8) != 0) {
                z = hasChanges.isPublishing;
            }
            if ((i & 16) != 0) {
                z2 = hasChanges.isUnpublishing;
            }
            return hasChanges.copy(str, str2, str3, z, z2);
        }

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.projectDir;
        }

        public final String component3() {
            return this.url;
        }

        public final boolean component4() {
            return this.isPublishing;
        }

        public final boolean component5() {
            return this.isUnpublishing;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getProjectDir() {
            return this.projectDir;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01((AnonymousClass005.A0I(this.projectDir, AnonymousClass001.A0G(this.fileName)) + AnonymousClass006.A0G(this.url)) * 31, this.isPublishing), this.isUnpublishing);
        }

        public final boolean isPublishing() {
            return this.isPublishing;
        }

        public final boolean isUnpublishing() {
            return this.isUnpublishing;
        }

        public /* synthetic */ HasChanges(String str, String str2, String str3, boolean z, boolean z2, int i, C06H c06h) {
            this(str, str2, AnonymousClass006.A0t(i, str3), C3cG.A1K(i & 8, z), C3cI.A1S(i, z2));
        }

        public final HasChanges copy(String str, String str2, String str3, boolean z, boolean z2) {
            AnonymousClass003.A0u(str, str2);
            return new HasChanges(str, str2, str3, z, z2);
        }

        public String toString() {
            return super.toString();
        }

        public HasChanges(String str, String str2, String str3, boolean z, boolean z2) {
            AnonymousClass003.A0u(str, str2);
            this.fileName = str;
            this.projectDir = str2;
            this.url = str3;
            this.isPublishing = z;
            this.isUnpublishing = z2;
        }
    }

    public final class Loading extends C06G implements HatchPublishBottomSheetState {
        public final String fileName;
        public final String projectDir;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Loading) {
                    Loading loading = (Loading) obj;
                    if (!C7384Etj.areEqual(this.fileName, loading.fileName) || !C7384Etj.areEqual(this.projectDir, loading.projectDir)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loading.fileName;
            }
            if ((i & 2) != 0) {
                str2 = loading.projectDir;
            }
            AnonymousClass003.A0u(str, str2);
            return new Loading(str, str2);
        }

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.projectDir;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getProjectDir() {
            return this.projectDir;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.projectDir, AnonymousClass001.A0G(this.fileName));
        }

        public Loading(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.fileName = str;
            this.projectDir = str2;
        }

        public final Loading copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Loading(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Ready extends C06G implements HatchPublishBottomSheetState {
        public final String fileName;
        public final boolean isPublishing;
        public final String projectDir;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Ready) {
                    Ready ready = (Ready) obj;
                    if (!C7384Etj.areEqual(this.fileName, ready.fileName) || !C7384Etj.areEqual(this.projectDir, ready.projectDir) || this.isPublishing != ready.isPublishing) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Ready copy$default(Ready ready, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ready.fileName;
            }
            if ((i & 2) != 0) {
                str2 = ready.projectDir;
            }
            if ((i & 4) != 0) {
                z = ready.isPublishing;
            }
            return ready.copy(str, str2, z);
        }

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.projectDir;
        }

        public final boolean component3() {
            return this.isPublishing;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getProjectDir() {
            return this.projectDir;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0I(this.projectDir, AnonymousClass001.A0G(this.fileName)), this.isPublishing);
        }

        public final boolean isPublishing() {
            return this.isPublishing;
        }

        public Ready(String str, String str2, boolean z) {
            AnonymousClass003.A0u(str, str2);
            this.fileName = str;
            this.projectDir = str2;
            this.isPublishing = z;
        }

        public final Ready copy(String str, String str2, boolean z) {
            AnonymousClass003.A0u(str, str2);
            return new Ready(str, str2, z);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Ready(String str, String str2, boolean z, int i, C06H c06h) {
            this(str, str2, AnonymousClass005.A1O(i, z));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public final class RetryAction {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ RetryAction[] $VALUES;
        public static final RetryAction DEPLOY;
        public static final RetryAction UNPUBLISH;

        static {
            RetryAction retryAction = new RetryAction("DEPLOY", 0);
            DEPLOY = retryAction;
            RetryAction retryAction2 = new RetryAction("UNPUBLISH", 1);
            UNPUBLISH = retryAction2;
            RetryAction[] retryActionArr = {retryAction, retryAction2};
            $VALUES = retryActionArr;
            $ENTRIES = C3cG.A0w(retryActionArr);
        }

        public static Ey9<RetryAction> getEntries() {
            return $ENTRIES;
        }

        public static RetryAction valueOf(String str) {
            return (RetryAction) Enum.valueOf(RetryAction.class, str);
        }

        public static RetryAction[] values() {
            return (RetryAction[]) $VALUES.clone();
        }

        public RetryAction(String str, int i) {
        }
    }

    public final class Success extends C06G implements HatchPublishBottomSheetState {
        public final String fileName;
        public final String projectDir;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Success) {
                    Success success = (Success) obj;
                    if (!C7384Etj.areEqual(this.fileName, success.fileName) || !C7384Etj.areEqual(this.projectDir, success.projectDir) || !C7384Etj.areEqual(this.url, success.url)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.fileName;
            }
            if ((i & 2) != 0) {
                str2 = success.projectDir;
            }
            if ((i & 4) != 0) {
                str3 = success.url;
            }
            return success.copy(str, str2, str3);
        }

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.projectDir;
        }

        public final String component3() {
            return this.url;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getProjectDir() {
            return this.projectDir;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.url, AnonymousClass005.A0I(this.projectDir, AnonymousClass001.A0G(this.fileName)));
        }

        public Success(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            this.fileName = str;
            this.projectDir = str2;
            this.url = str3;
        }

        public final Success copy(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            return new Success(str, str2, str3);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Unpublished extends C06G implements HatchPublishBottomSheetState {
        public final String fileName;
        public final String projectDir;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Unpublished) {
                    Unpublished unpublished = (Unpublished) obj;
                    if (!C7384Etj.areEqual(this.fileName, unpublished.fileName) || !C7384Etj.areEqual(this.projectDir, unpublished.projectDir)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Unpublished copy$default(Unpublished unpublished, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unpublished.fileName;
            }
            if ((i & 2) != 0) {
                str2 = unpublished.projectDir;
            }
            AnonymousClass003.A0u(str, str2);
            return new Unpublished(str, str2);
        }

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.projectDir;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getProjectDir() {
            return this.projectDir;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.projectDir, AnonymousClass001.A0G(this.fileName));
        }

        public Unpublished(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.fileName = str;
            this.projectDir = str2;
        }

        public final Unpublished copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Unpublished(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class UpToDate extends C06G implements HatchPublishBottomSheetState {
        public final String fileName;
        public final boolean isUnpublishing;
        public final String projectDir;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UpToDate) {
                    UpToDate upToDate = (UpToDate) obj;
                    if (!C7384Etj.areEqual(this.fileName, upToDate.fileName) || !C7384Etj.areEqual(this.projectDir, upToDate.projectDir) || !C7384Etj.areEqual(this.url, upToDate.url) || this.isUnpublishing != upToDate.isUnpublishing) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ UpToDate copy$default(UpToDate upToDate, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = upToDate.fileName;
            }
            if ((i & 2) != 0) {
                str2 = upToDate.projectDir;
            }
            if ((i & 4) != 0) {
                str3 = upToDate.url;
            }
            if ((i & 8) != 0) {
                z = upToDate.isUnpublishing;
            }
            AnonymousClass005.A0x(str, str2, str3);
            return new UpToDate(str, str2, str3, z);
        }

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.projectDir;
        }

        public final String component3() {
            return this.url;
        }

        public final boolean component4() {
            return this.isUnpublishing;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState
        public String getProjectDir() {
            return this.projectDir;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0I(this.url, AnonymousClass005.A0I(this.projectDir, AnonymousClass001.A0G(this.fileName))), this.isUnpublishing);
        }

        public final boolean isUnpublishing() {
            return this.isUnpublishing;
        }

        public UpToDate(String str, String str2, String str3, boolean z) {
            AnonymousClass005.A0x(str, str2, str3);
            this.fileName = str;
            this.projectDir = str2;
            this.url = str3;
            this.isUnpublishing = z;
        }

        public final UpToDate copy(String str, String str2, String str3, boolean z) {
            AnonymousClass005.A0x(str, str2, str3);
            return new UpToDate(str, str2, str3, z);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UpToDate(String str, String str2, String str3, boolean z, int i, C06H c06h) {
            this(str, str2, str3, AnonymousClass005.A1P(i, z));
        }
    }

    String getFileName();

    String getProjectDir();
}
