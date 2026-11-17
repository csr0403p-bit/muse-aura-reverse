package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class FailureDetail {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class AmbiguousMatch extends FailureDetail {
        public static final int $stable = 0;
        public static final AmbiguousMatch INSTANCE = new AmbiguousMatch();
    }

    public final class AttachmentChanged extends FailureDetail {
        public static final int $stable = 0;
        public static final AttachmentChanged INSTANCE = new AttachmentChanged();
    }

    public final class AuthorityChanged extends FailureDetail {
        public static final int $stable = 0;
        public static final AuthorityChanged INSTANCE = new AuthorityChanged();
    }

    public final class CapacityExceeded extends FailureDetail {
        public static final int $stable = 0;
        public static final CapacityExceeded INSTANCE = new CapacityExceeded();
    }

    public final class CheckoutUnavailable extends FailureDetail {
        public static final int $stable = 0;
        public static final CheckoutUnavailable INSTANCE = new CheckoutUnavailable();
    }

    public final class ContinuationUnavailable extends FailureDetail {
        public static final int $stable = 0;
        public static final ContinuationUnavailable INSTANCE = new ContinuationUnavailable();
    }

    public final class ControlUnavailable extends FailureDetail {
        public static final int $stable = 0;
        public static final ControlUnavailable INSTANCE = new ControlUnavailable();
    }

    public final class CoreClosed extends FailureDetail {
        public static final int $stable = 0;
        public static final CoreClosed INSTANCE = new CoreClosed();
    }

    public final class CredentialTargetChanged extends FailureDetail {
        public static final int $stable = 0;
        public static final CredentialTargetChanged INSTANCE = new CredentialTargetChanged();
    }

    public final class DocumentChanged extends FailureDetail {
        public static final int $stable = 0;
        public static final DocumentChanged INSTANCE = new DocumentChanged();
    }

    public final class DownloadInterrupted extends FailureDetail {
        public static final int $stable = 0;
        public static final DownloadInterrupted INSTANCE = new DownloadInterrupted();
    }

    public final class DownloadNotStarted extends FailureDetail {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final DownloadNotStartedReason reason;

        public DownloadNotStarted(DownloadNotStartedReason downloadNotStartedReason) {
            C7384Etj.A0Y(downloadNotStartedReason, 0);
            this.reason = downloadNotStartedReason;
        }

        public final DownloadNotStarted copy(DownloadNotStartedReason downloadNotStartedReason) {
            C7384Etj.A0Y(downloadNotStartedReason, 0);
            return new DownloadNotStarted(downloadNotStartedReason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof DownloadNotStarted) && this.reason == ((DownloadNotStarted) obj).reason);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ DownloadNotStarted copy$default(DownloadNotStarted downloadNotStarted, DownloadNotStartedReason downloadNotStartedReason, int i, Object obj) {
            if ((i & 1) != 0) {
                downloadNotStartedReason = downloadNotStarted.reason;
            }
            C7384Etj.A0Y(downloadNotStartedReason, 0);
            return new DownloadNotStarted(downloadNotStartedReason);
        }

        public final DownloadNotStartedReason component1() {
            return this.reason;
        }

        public final DownloadNotStartedReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("DownloadNotStarted(reason=", this.reason);
        }
    }

    public final class DownloadUnreadable extends FailureDetail {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final DownloadUnreadableReason reason;

        public DownloadUnreadable(DownloadUnreadableReason downloadUnreadableReason) {
            C7384Etj.A0Y(downloadUnreadableReason, 0);
            this.reason = downloadUnreadableReason;
        }

        public final DownloadUnreadable copy(DownloadUnreadableReason downloadUnreadableReason) {
            C7384Etj.A0Y(downloadUnreadableReason, 0);
            return new DownloadUnreadable(downloadUnreadableReason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof DownloadUnreadable) && this.reason == ((DownloadUnreadable) obj).reason);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ DownloadUnreadable copy$default(DownloadUnreadable downloadUnreadable, DownloadUnreadableReason downloadUnreadableReason, int i, Object obj) {
            if ((i & 1) != 0) {
                downloadUnreadableReason = downloadUnreadable.reason;
            }
            C7384Etj.A0Y(downloadUnreadableReason, 0);
            return new DownloadUnreadable(downloadUnreadableReason);
        }

        public final DownloadUnreadableReason component1() {
            return this.reason;
        }

        public final DownloadUnreadableReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("DownloadUnreadable(reason=", this.reason);
        }
    }

    public final class DuplicateOperation extends FailureDetail {
        public static final int $stable = 0;
        public static final DuplicateOperation INSTANCE = new DuplicateOperation();
    }

    public final class Expired extends FailureDetail {
        public static final int $stable = 0;
        public static final Expired INSTANCE = new Expired();
    }

    public final class FileAccessUnavailable extends FailureDetail {
        public static final int $stable = 0;
        public static final FileAccessUnavailable INSTANCE = new FileAccessUnavailable();
    }

    public final class FileChanged extends FailureDetail {
        public static final int $stable = 0;
        public static final FileChanged INSTANCE = new FileChanged();
    }

    public final class FileUnavailable extends FailureDetail {
        public static final int $stable = 0;
        public static final FileUnavailable INSTANCE = new FileUnavailable();
    }

    public final class HostCapabilityMissing extends FailureDetail {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final HostCapability capability;

        public HostCapabilityMissing(HostCapability hostCapability) {
            C7384Etj.A0Y(hostCapability, 0);
            this.capability = hostCapability;
        }

        public final HostCapabilityMissing copy(HostCapability hostCapability) {
            C7384Etj.A0Y(hostCapability, 0);
            return new HostCapabilityMissing(hostCapability);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof HostCapabilityMissing) && this.capability == ((HostCapabilityMissing) obj).capability);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ HostCapabilityMissing copy$default(HostCapabilityMissing hostCapabilityMissing, HostCapability hostCapability, int i, Object obj) {
            if ((i & 1) != 0) {
                hostCapability = hostCapabilityMissing.capability;
            }
            C7384Etj.A0Y(hostCapability, 0);
            return new HostCapabilityMissing(hostCapability);
        }

        public final HostCapability component1() {
            return this.capability;
        }

        public final HostCapability getCapability() {
            return this.capability;
        }

        public int hashCode() {
            return this.capability.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("HostCapabilityMissing(capability=", this.capability);
        }
    }

    public final class InputNotStarted extends FailureDetail {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final InputRefusalReason reason;
        public final InputRefusalResolution resolution;
        public final InputVisibilityReason visibility;

        public InputNotStarted(InputRefusalReason inputRefusalReason, InputRefusalResolution inputRefusalResolution, InputVisibilityReason inputVisibilityReason) {
            C7384Etj.A0Y(inputRefusalResolution, 1);
            this.reason = inputRefusalReason;
            this.resolution = inputRefusalResolution;
            this.visibility = inputVisibilityReason;
        }

        public final InputNotStarted copy(InputRefusalReason inputRefusalReason, InputRefusalResolution inputRefusalResolution, InputVisibilityReason inputVisibilityReason) {
            C7384Etj.A0Y(inputRefusalResolution, 1);
            return new InputNotStarted(inputRefusalReason, inputRefusalResolution, inputVisibilityReason);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof InputNotStarted) {
                    InputNotStarted inputNotStarted = (InputNotStarted) obj;
                    if (this.reason != inputNotStarted.reason || this.resolution != inputNotStarted.resolution || this.visibility != inputNotStarted.visibility) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ InputNotStarted copy$default(InputNotStarted inputNotStarted, InputRefusalReason inputRefusalReason, InputRefusalResolution inputRefusalResolution, InputVisibilityReason inputVisibilityReason, int i, Object obj) {
            if ((i & 1) != 0) {
                inputRefusalReason = inputNotStarted.reason;
            }
            if ((i & 2) != 0) {
                inputRefusalResolution = inputNotStarted.resolution;
            }
            if ((i & 4) != 0) {
                inputVisibilityReason = inputNotStarted.visibility;
            }
            return inputNotStarted.copy(inputRefusalReason, inputRefusalResolution, inputVisibilityReason);
        }

        public final InputRefusalReason component1() {
            return this.reason;
        }

        public final InputRefusalResolution component2() {
            return this.resolution;
        }

        public final InputVisibilityReason component3() {
            return this.visibility;
        }

        public final InputRefusalReason getReason() {
            return this.reason;
        }

        public final InputRefusalResolution getResolution() {
            return this.resolution;
        }

        public final InputVisibilityReason getVisibility() {
            return this.visibility;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.resolution, AnonymousClass006.A0D(this.reason) * 31) + C3cH.A02(this.visibility);
        }

        public String toString() {
            InputRefusalReason inputRefusalReason = this.reason;
            InputRefusalResolution inputRefusalResolution = this.resolution;
            InputVisibilityReason inputVisibilityReason = this.visibility;
            StringBuilder sbA0f = C3cG.A0f(inputRefusalReason, "InputNotStarted(reason=");
            sbA0f.append(", resolution=");
            sbA0f.append(inputRefusalResolution);
            return C3cJ.A0L(inputVisibilityReason, ", visibility=", sbA0f);
        }
    }

    public final class InvalidArgument extends FailureDetail {
        public static final int $stable = 0;
        public static final InvalidArgument INSTANCE = new InvalidArgument();
    }

    public final class InvalidReport extends FailureDetail {
        public static final int $stable = 0;
        public static final InvalidReport INSTANCE = new InvalidReport();
    }

    public final class InvalidScope extends FailureDetail {
        public static final int $stable = 0;
        public static final InvalidScope INSTANCE = new InvalidScope();
    }

    public final class NativeRefusal extends FailureDetail {
        public static final int $stable = 0;
        public static final NativeRefusal INSTANCE = new NativeRefusal();
    }

    public final class NativeSelectHidden extends FailureDetail {
        public static final int $stable = 0;
        public static final NativeSelectHidden INSTANCE = new NativeSelectHidden();
    }

    public final class NoMatch extends FailureDetail {
        public static final int $stable = 0;
        public static final NoMatch INSTANCE = new NoMatch();
    }

    public final class OptionAmbiguous extends FailureDetail {
        public static final int $stable = 0;
        public static final OptionAmbiguous INSTANCE = new OptionAmbiguous();
    }

    public final class OptionDisabled extends FailureDetail {
        public static final int $stable = 0;
        public static final OptionDisabled INSTANCE = new OptionDisabled();
    }

    public final class OptionNotFound extends FailureDetail {
        public static final int $stable = 0;
        public static final OptionNotFound INSTANCE = new OptionNotFound();
    }

    public final class OriginChanged extends FailureDetail {
        public static final int $stable = 0;
        public static final OriginChanged INSTANCE = new OriginChanged();
    }

    public final class PasteIntoPasswordField extends FailureDetail {
        public static final int $stable = 0;
        public static final PasteIntoPasswordField INSTANCE = new PasteIntoPasswordField();
    }

    public final class PointerNotHeld extends FailureDetail {
        public static final int $stable = 0;
        public static final PointerNotHeld INSTANCE = new PointerNotHeld();
    }

    public final class PolicyDenied extends FailureDetail {
        public static final int $stable = 0;
        public static final PolicyDenied INSTANCE = new PolicyDenied();
    }

    public final class ProofUnavailable extends FailureDetail {
        public static final int $stable = 0;
        public static final ProofUnavailable INSTANCE = new ProofUnavailable();
    }

    public final class ProtectedWorkPending extends FailureDetail {
        public static final int $stable = 0;
        public static final ProtectedWorkPending INSTANCE = new ProtectedWorkPending();
    }

    /* loaded from: classes5.dex */
    public final class PublishMismatch extends FailureDetail {
        public static final int $stable = 0;
        public static final PublishMismatch INSTANCE = new PublishMismatch();
    }

    public final class RemovedPage extends FailureDetail {
        public static final int $stable = 0;
        public static final RemovedPage INSTANCE = new RemovedPage();
    }

    public final class RendererUnresponsive extends FailureDetail {
        public static final int $stable = 0;
        public static final RendererUnresponsive INSTANCE = new RendererUnresponsive();
    }

    public final class RequiredOutputUnavailable extends FailureDetail {
        public static final int $stable = 0;
        public static final RequiredOutputUnavailable INSTANCE = new RequiredOutputUnavailable();
    }

    public final class RouteUnavailable extends FailureDetail {
        public static final int $stable = 0;
        public static final RouteUnavailable INSTANCE = new RouteUnavailable();
    }

    public final class SelectDisabled extends FailureDetail {
        public static final int $stable = 0;
        public static final SelectDisabled INSTANCE = new SelectDisabled();
    }

    public final class TargetNotNativeSelect extends FailureDetail {
        public static final int $stable = 0;
        public static final TargetNotNativeSelect INSTANCE = new TargetNotNativeSelect();
    }

    public final class UnknownPageReference extends FailureDetail {
        public static final int $stable = 0;
        public static final UnknownPageReference INSTANCE = new UnknownPageReference();
    }

    public final class UnsupportedCommand extends FailureDetail {
        public static final int $stable = 0;
        public static final UnsupportedCommand INSTANCE = new UnsupportedCommand();
    }

    public final class UploadPickerUnsupported extends FailureDetail {
        public static final int $stable = 0;
        public static final UploadPickerUnsupported INSTANCE = new UploadPickerUnsupported();
    }

    public final class WrongTask extends FailureDetail {
        public static final int $stable = 0;
        public static final WrongTask INSTANCE = new WrongTask();
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public FailureDetail() {
    }

    public /* synthetic */ FailureDetail(C06H c06h) {
    }
}
