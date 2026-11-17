package com.facebook.aura.file.view;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;

/* loaded from: classes3.dex */
public interface PublishState {

    public final class Failed extends C06G implements PublishState {
        public static final int $stable = 0;
        public final RetryAction retryAction;

        public final Failed copy(RetryAction retryAction) {
            C7384Etj.A0Y(retryAction, 0);
            return new Failed(retryAction);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Failed) && this.retryAction == ((Failed) obj).retryAction);
        }

        public /* synthetic */ Failed(RetryAction retryAction, int i, C06H c06h) {
            this((i & 1) != 0 ? RetryAction.DEPLOY : retryAction);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, RetryAction retryAction, int i, Object obj) {
            if ((i & 1) != 0) {
                retryAction = failed.retryAction;
            }
            C7384Etj.A0Y(retryAction, 0);
            return new Failed(retryAction);
        }

        public final RetryAction component1() {
            return this.retryAction;
        }

        public final RetryAction getRetryAction() {
            return this.retryAction;
        }

        public int hashCode() {
            return this.retryAction.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public Failed(RetryAction retryAction) {
            C7384Etj.A0Y(retryAction, 0);
            this.retryAction = retryAction;
        }

        public Failed() {
            this(RetryAction.DEPLOY);
        }
    }

    public final class HasChanges extends C06G implements PublishState {
        public static final int $stable = 0;
        public final boolean isUnpublishing;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof HasChanges) && this.isUnpublishing == ((HasChanges) obj).isUnpublishing);
        }

        public static /* synthetic */ HasChanges copy$default(HasChanges hasChanges, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = hasChanges.isUnpublishing;
            }
            return new HasChanges(z);
        }

        public final boolean component1() {
            return this.isUnpublishing;
        }

        public final HasChanges copy(boolean z) {
            return new HasChanges(z);
        }

        public int hashCode() {
            return this.isUnpublishing ? 1231 : 1237;
        }

        public final boolean isUnpublishing() {
            return this.isUnpublishing;
        }

        public /* synthetic */ HasChanges(boolean z, int i, C06H c06h) {
            this(AnonymousClass001.A1P(i, z));
        }

        public String toString() {
            return super.toString();
        }

        public HasChanges(boolean z) {
            this.isUnpublishing = z;
        }

        public HasChanges() {
            this(false);
        }
    }

    public final class Hidden implements PublishState {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Hidden);
        }

        public String toString() {
            return "Hidden";
        }

        public int hashCode() {
            return -814072913;
        }
    }

    public final class Loading implements PublishState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -42400809;
        }
    }

    public final class Ready implements PublishState {
        public static final int $stable = 0;
        public static final Ready INSTANCE = new Ready();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ready);
        }

        public String toString() {
            return "Ready";
        }

        public int hashCode() {
            return -986978562;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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

    public final class Success extends C06G implements PublishState {
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

    public final class Unpublished implements PublishState {
        public static final int $stable = 0;
        public static final Unpublished INSTANCE = new Unpublished();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unpublished);
        }

        public String toString() {
            return "Unpublished";
        }

        public int hashCode() {
            return 929647760;
        }
    }

    public final class UpToDate extends C06G implements PublishState {
        public static final int $stable = 0;
        public final boolean isUnpublishing;
        public final String url;

        public UpToDate(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
            this.isUnpublishing = z;
        }

        public final UpToDate copy(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            return new UpToDate(str, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UpToDate) {
                    UpToDate upToDate = (UpToDate) obj;
                    if (!C7384Etj.areEqual(this.url, upToDate.url) || this.isUnpublishing != upToDate.isUnpublishing) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ UpToDate copy$default(UpToDate upToDate, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = upToDate.url;
            }
            if ((i & 2) != 0) {
                z = upToDate.isUnpublishing;
            }
            C7384Etj.A0Y(str, 0);
            return new UpToDate(str, z);
        }

        public final String component1() {
            return this.url;
        }

        public final boolean component2() {
            return this.isUnpublishing;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass001.A0G(this.url), this.isUnpublishing);
        }

        public final boolean isUnpublishing() {
            return this.isUnpublishing;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UpToDate(String str, boolean z, int i, C06H c06h) {
            this(str, AnonymousClass001.A1Q(i, z));
        }
    }
}
