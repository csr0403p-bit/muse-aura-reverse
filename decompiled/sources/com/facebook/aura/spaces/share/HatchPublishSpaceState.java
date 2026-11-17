package com.facebook.aura.spaces.share;

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
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.gateway.HatchFileOperations;

/* loaded from: classes4.dex */
public interface HatchPublishSpaceState {

    public final class ConfirmDisclosure extends C06G implements HatchPublishSpaceState {
        public static final int $stable = HatchFileOperations.SpaceShareDisclosure.$stable;
        public final HatchFileOperations.SpaceShareDisclosure disclosure;
        public final boolean isPublishing;
        public final HatchPublishSpaceState origin;
        public final String summary;
        public final String title;
        public final String token;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ConfirmDisclosure) {
                    ConfirmDisclosure confirmDisclosure = (ConfirmDisclosure) obj;
                    if (!C7384Etj.areEqual(this.title, confirmDisclosure.title) || !C7384Etj.areEqual(this.disclosure, confirmDisclosure.disclosure) || !C7384Etj.areEqual(this.token, confirmDisclosure.token) || !C7384Etj.areEqual(this.origin, confirmDisclosure.origin) || this.isPublishing != confirmDisclosure.isPublishing || !C7384Etj.areEqual(this.summary, confirmDisclosure.summary)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ConfirmDisclosure copy$default(ConfirmDisclosure confirmDisclosure, String str, HatchFileOperations.SpaceShareDisclosure spaceShareDisclosure, String str2, HatchPublishSpaceState hatchPublishSpaceState, boolean z, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confirmDisclosure.title;
            }
            if ((i & 2) != 0) {
                spaceShareDisclosure = confirmDisclosure.disclosure;
            }
            if ((i & 4) != 0) {
                str2 = confirmDisclosure.token;
            }
            if ((i & 8) != 0) {
                hatchPublishSpaceState = confirmDisclosure.origin;
            }
            if ((i & 16) != 0) {
                z = confirmDisclosure.isPublishing;
            }
            if ((i & 32) != 0) {
                str3 = confirmDisclosure.summary;
            }
            return confirmDisclosure.copy(str, spaceShareDisclosure, str2, hatchPublishSpaceState, z, str3);
        }

        public final String component1() {
            return this.title;
        }

        public final HatchFileOperations.SpaceShareDisclosure component2() {
            return this.disclosure;
        }

        public final String component3() {
            return this.token;
        }

        public final HatchPublishSpaceState component4() {
            return this.origin;
        }

        public final boolean component5() {
            return this.isPublishing;
        }

        public final String component6() {
            return this.summary;
        }

        public final HatchFileOperations.SpaceShareDisclosure getDisclosure() {
            return this.disclosure;
        }

        public final HatchPublishSpaceState getOrigin() {
            return this.origin;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return C0KA.A01(AnonymousClass005.A0F(this.origin, AnonymousClass005.A0I(this.token, AnonymousClass005.A0F(this.disclosure, AnonymousClass001.A0G(this.title)))), this.isPublishing) + AnonymousClass006.A0G(this.summary);
        }

        public final boolean isPublishing() {
            return this.isPublishing;
        }

        public /* synthetic */ ConfirmDisclosure(String str, HatchFileOperations.SpaceShareDisclosure spaceShareDisclosure, String str2, HatchPublishSpaceState hatchPublishSpaceState, boolean z, String str3, int i, C06H c06h) {
            this(str, spaceShareDisclosure, str2, hatchPublishSpaceState, C3cI.A1S(i, z), (i & 32) != 0 ? null : str3);
        }

        public final ConfirmDisclosure copy(String str, HatchFileOperations.SpaceShareDisclosure spaceShareDisclosure, String str2, HatchPublishSpaceState hatchPublishSpaceState, boolean z, String str3) {
            AnonymousClass005.A14(str, spaceShareDisclosure, str2, hatchPublishSpaceState);
            return new ConfirmDisclosure(str, spaceShareDisclosure, str2, hatchPublishSpaceState, z, str3);
        }

        public String toString() {
            return super.toString();
        }

        public ConfirmDisclosure(String str, HatchFileOperations.SpaceShareDisclosure spaceShareDisclosure, String str2, HatchPublishSpaceState hatchPublishSpaceState, boolean z, String str3) {
            AnonymousClass005.A14(str, spaceShareDisclosure, str2, hatchPublishSpaceState);
            this.title = str;
            this.disclosure = spaceShareDisclosure;
            this.token = str2;
            this.origin = hatchPublishSpaceState;
            this.isPublishing = z;
            this.summary = str3;
        }
    }

    public final class ConfirmPublish extends C06G implements HatchPublishSpaceState {
        public static final int $stable = 0;
        public final String title;

        public ConfirmPublish(String str) {
            C7384Etj.A0Y(str, 0);
            this.title = str;
        }

        public final ConfirmPublish copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ConfirmPublish(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ConfirmPublish) && C7384Etj.areEqual(this.title, ((ConfirmPublish) obj).title));
        }

        public static /* synthetic */ ConfirmPublish copy$default(ConfirmPublish confirmPublish, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confirmPublish.title;
            }
            C7384Etj.A0Y(str, 0);
            return new ConfirmPublish(str);
        }

        public final String component1() {
            return this.title;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ConfirmUnpublish extends C06G implements HatchPublishSpaceState {
        public static final int $stable = 0;
        public final boolean isUnpublishing;
        public final String title;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ConfirmUnpublish) {
                    ConfirmUnpublish confirmUnpublish = (ConfirmUnpublish) obj;
                    if (!C7384Etj.areEqual(this.url, confirmUnpublish.url) || !C7384Etj.areEqual(this.title, confirmUnpublish.title) || this.isUnpublishing != confirmUnpublish.isUnpublishing) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ConfirmUnpublish copy$default(ConfirmUnpublish confirmUnpublish, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confirmUnpublish.url;
            }
            if ((i & 2) != 0) {
                str2 = confirmUnpublish.title;
            }
            if ((i & 4) != 0) {
                z = confirmUnpublish.isUnpublishing;
            }
            return confirmUnpublish.copy(str, str2, z);
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.title;
        }

        public final boolean component3() {
            return this.isUnpublishing;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.url)), this.isUnpublishing);
        }

        public final boolean isUnpublishing() {
            return this.isUnpublishing;
        }

        public ConfirmUnpublish(String str, String str2, boolean z) {
            AnonymousClass003.A0u(str, str2);
            this.url = str;
            this.title = str2;
            this.isUnpublishing = z;
        }

        public final ConfirmUnpublish copy(String str, String str2, boolean z) {
            AnonymousClass003.A0u(str, str2);
            return new ConfirmUnpublish(str, str2, z);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ConfirmUnpublish(String str, String str2, boolean z, int i, C06H c06h) {
            this(str, str2, AnonymousClass005.A1O(i, z));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Deployment {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Deployment[] $VALUES;
        public static final Deployment PENDING;
        public static final Deployment READY;
        public static final Deployment UNCONFIRMED;

        static {
            Deployment deployment = new Deployment("READY", 0);
            READY = deployment;
            Deployment deployment2 = new Deployment(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 1);
            PENDING = deployment2;
            Deployment deployment3 = new Deployment("UNCONFIRMED", 2);
            UNCONFIRMED = deployment3;
            Deployment[] deploymentArr = {deployment, deployment2, deployment3};
            $VALUES = deploymentArr;
            $ENTRIES = C3cG.A0w(deploymentArr);
        }

        public static Ey9<Deployment> getEntries() {
            return $ENTRIES;
        }

        public static Deployment valueOf(String str) {
            return (Deployment) Enum.valueOf(Deployment.class, str);
        }

        public static Deployment[] values() {
            return (Deployment[]) $VALUES.clone();
        }

        public Deployment(String str, int i) {
        }
    }

    public final class Failed extends C06G implements HatchPublishSpaceState {
        public static final int $stable = 0;
        public final int fallbackMessageRes;
        public final boolean isRetrying;
        public final String message;
        public final RetryAction retryAction;

        public Failed(String str, int i, RetryAction retryAction, boolean z) {
            C7384Etj.A0Y(retryAction, 2);
            this.message = str;
            this.fallbackMessageRes = i;
            this.retryAction = retryAction;
            this.isRetrying = z;
        }

        public final Failed copy(String str, int i, RetryAction retryAction, boolean z) {
            C7384Etj.A0Y(retryAction, 2);
            return new Failed(str, i, retryAction, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failed) {
                    Failed failed = (Failed) obj;
                    if (!C7384Etj.areEqual(this.message, failed.message) || this.fallbackMessageRes != failed.fallbackMessageRes || this.retryAction != failed.retryAction || this.isRetrying != failed.isRetrying) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, RetryAction retryAction, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = failed.message;
            }
            if ((i2 & 2) != 0) {
                i = failed.fallbackMessageRes;
            }
            if ((i2 & 4) != 0) {
                retryAction = failed.retryAction;
            }
            if ((i2 & 8) != 0) {
                z = failed.isRetrying;
            }
            C7384Etj.A0Y(retryAction, 2);
            return new Failed(str, i, retryAction, z);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.fallbackMessageRes;
        }

        public final RetryAction component3() {
            return this.retryAction;
        }

        public final boolean component4() {
            return this.isRetrying;
        }

        public final int getFallbackMessageRes() {
            return this.fallbackMessageRes;
        }

        public final String getMessage() {
            return this.message;
        }

        public final RetryAction getRetryAction() {
            return this.retryAction;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0F(this.retryAction, ((AnonymousClass006.A0G(this.message) * 31) + this.fallbackMessageRes) * 31), this.isRetrying);
        }

        public final boolean isRetrying() {
            return this.isRetrying;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Failed(String str, int i, RetryAction retryAction, boolean z, int i2, C06H c06h) {
            this(str, i, retryAction, AnonymousClass005.A1P(i2, z));
        }
    }

    public final class Loading implements HatchPublishSpaceState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return 1924471176;
        }
    }

    public final class PolicyRefused extends C06G implements HatchPublishSpaceState {
        public static final int $stable = 0;
        public final String message;
        public final String title;

        public PolicyRefused(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.title = str;
            this.message = str2;
        }

        public final PolicyRefused copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new PolicyRefused(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PolicyRefused) {
                    PolicyRefused policyRefused = (PolicyRefused) obj;
                    if (!C7384Etj.areEqual(this.title, policyRefused.title) || !C7384Etj.areEqual(this.message, policyRefused.message)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PolicyRefused copy$default(PolicyRefused policyRefused, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = policyRefused.title;
            }
            if ((i & 2) != 0) {
                str2 = policyRefused.message;
            }
            C7384Etj.A0Y(str, 0);
            return new PolicyRefused(str, str2);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.message;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.message);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Published extends C06G implements HatchPublishSpaceState {
        public static final int $stable = 0;
        public final Deployment deployment;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Published) {
                    Published published = (Published) obj;
                    if (!C7384Etj.areEqual(this.url, published.url) || this.deployment != published.deployment) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Published copy$default(Published published, String str, Deployment deployment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = published.url;
            }
            if ((i & 2) != 0) {
                deployment = published.deployment;
            }
            AnonymousClass003.A0u(str, deployment);
            return new Published(str, deployment);
        }

        public final String component1() {
            return this.url;
        }

        public final Deployment component2() {
            return this.deployment;
        }

        public final Deployment getDeployment() {
            return this.deployment;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.deployment, AnonymousClass001.A0G(this.url));
        }

        public Published(String str, Deployment deployment) {
            AnonymousClass003.A0u(str, deployment);
            this.url = str;
            this.deployment = deployment;
        }

        public final Published copy(String str, Deployment deployment) {
            AnonymousClass003.A0u(str, deployment);
            return new Published(str, deployment);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Published(String str, Deployment deployment, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? Deployment.READY : deployment);
        }
    }

    public final class Publishing extends C06G implements HatchPublishSpaceState {
        public static final int $stable = 0;
        public final String title;

        public Publishing(String str) {
            C7384Etj.A0Y(str, 0);
            this.title = str;
        }

        public final Publishing copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Publishing(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Publishing) && C7384Etj.areEqual(this.title, ((Publishing) obj).title));
        }

        public static /* synthetic */ Publishing copy$default(Publishing publishing, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = publishing.title;
            }
            C7384Etj.A0Y(str, 0);
            return new Publishing(str);
        }

        public final String component1() {
            return this.title;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class RetryAction {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ RetryAction[] $VALUES;
        public static final RetryAction PUBLISH;
        public static final RetryAction RECOVER;
        public static final RetryAction UNPUBLISH;

        static {
            RetryAction retryAction = new RetryAction("PUBLISH", 0);
            PUBLISH = retryAction;
            RetryAction retryAction2 = new RetryAction("UNPUBLISH", 1);
            UNPUBLISH = retryAction2;
            RetryAction retryAction3 = new RetryAction("RECOVER", 2);
            RECOVER = retryAction3;
            RetryAction[] retryActionArr = {retryAction, retryAction2, retryAction3};
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

    public final class Unpublished implements HatchPublishSpaceState {
        public static final int $stable = 0;
        public static final Unpublished INSTANCE = new Unpublished();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unpublished);
        }

        public String toString() {
            return "Unpublished";
        }

        public int hashCode() {
            return -531553855;
        }
    }

    public final class UpToDate extends C06G implements HatchPublishSpaceState {
        public static final int $stable = 0;
        public final Deployment deployment;
        public final String title;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UpToDate) {
                    UpToDate upToDate = (UpToDate) obj;
                    if (!C7384Etj.areEqual(this.url, upToDate.url) || !C7384Etj.areEqual(this.title, upToDate.title) || this.deployment != upToDate.deployment) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ UpToDate copy$default(UpToDate upToDate, String str, String str2, Deployment deployment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = upToDate.url;
            }
            if ((i & 2) != 0) {
                str2 = upToDate.title;
            }
            if ((i & 4) != 0) {
                deployment = upToDate.deployment;
            }
            return upToDate.copy(str, str2, deployment);
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.title;
        }

        public final Deployment component3() {
            return this.deployment;
        }

        public final Deployment getDeployment() {
            return this.deployment;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.deployment, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.url)));
        }

        public UpToDate(String str, String str2, Deployment deployment) {
            AnonymousClass005.A0x(str, str2, deployment);
            this.url = str;
            this.title = str2;
            this.deployment = deployment;
        }

        public final UpToDate copy(String str, String str2, Deployment deployment) {
            AnonymousClass005.A0x(str, str2, deployment);
            return new UpToDate(str, str2, deployment);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UpToDate(String str, String str2, Deployment deployment, int i, C06H c06h) {
            this(str, str2, (i & 4) != 0 ? Deployment.READY : deployment);
        }
    }
}
