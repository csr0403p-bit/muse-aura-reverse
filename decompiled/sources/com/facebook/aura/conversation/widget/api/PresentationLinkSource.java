package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface PresentationLinkSource {

    public final class Inbound extends C06G implements PresentationLinkSource {
        public static final int $stable = 8;
        public final InboundLinkOrigin origin;

        public Inbound(InboundLinkOrigin inboundLinkOrigin) {
            C7384Etj.A0Y(inboundLinkOrigin, 0);
            this.origin = inboundLinkOrigin;
        }

        public final Inbound copy(InboundLinkOrigin inboundLinkOrigin) {
            C7384Etj.A0Y(inboundLinkOrigin, 0);
            return new Inbound(inboundLinkOrigin);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Inbound) && C7384Etj.areEqual(this.origin, ((Inbound) obj).origin));
        }

        public static /* synthetic */ Inbound copy$default(Inbound inbound, InboundLinkOrigin inboundLinkOrigin, int i, Object obj) {
            if ((i & 1) != 0) {
                inboundLinkOrigin = inbound.origin;
            }
            C7384Etj.A0Y(inboundLinkOrigin, 0);
            return new Inbound(inboundLinkOrigin);
        }

        public final InboundLinkOrigin component1() {
            return this.origin;
        }

        public final InboundLinkOrigin getOrigin() {
            return this.origin;
        }

        public int hashCode() {
            return this.origin.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class TranscriptButton extends C06G implements PresentationLinkSource {
        public static final int $stable = 0;
        public final String presentationId;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof TranscriptButton) && C7384Etj.areEqual(this.presentationId, ((TranscriptButton) obj).presentationId));
        }

        public static /* synthetic */ TranscriptButton copy$default(TranscriptButton transcriptButton, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transcriptButton.presentationId;
            }
            return new TranscriptButton(str);
        }

        public final String component1() {
            return this.presentationId;
        }

        public final TranscriptButton copy(String str) {
            return new TranscriptButton(str);
        }

        public final String getPresentationId() {
            return this.presentationId;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.presentationId);
        }

        public TranscriptButton(String str) {
            this.presentationId = str;
        }

        public String toString() {
            return super.toString();
        }
    }
}
