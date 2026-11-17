package com.facebook.aura.network.transport;

import X.C7384Etj;

/* loaded from: classes5.dex */
public interface HatchWsMessage {

    public final class Binary implements HatchWsMessage {
        public final byte[] bytes;

        public Binary(byte[] bArr) {
            C7384Etj.A0Y(bArr, 0);
            this.bytes = bArr;
        }

        public final byte[] getBytes() {
            return this.bytes;
        }
    }

    public final class Text implements HatchWsMessage {
        public final String text;

        public Text(String str) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
        }

        public final String getText() {
            return this.text;
        }
    }
}
