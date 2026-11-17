package X;

import android.net.Uri;

/* loaded from: classes5.dex */
public abstract class EUt {
    public final InterfaceC7028EeZ<C6988Edo> consumer;
    public final InterfaceC7029Eea context;
    public long lastIntermediateResultTimeMs;
    public int onNewResultStatusFlags;
    public EUs responseBytesRange;

    public final InterfaceC7028EeZ<C6988Edo> getConsumer() {
        return this.consumer;
    }

    public final InterfaceC7029Eea getContext() {
        return this.context;
    }

    public final String getId() {
        return ((C7185Ehv) this.context).A09;
    }

    public final long getLastIntermediateResultTimeMs() {
        return this.lastIntermediateResultTimeMs;
    }

    public final InterfaceC7027EeY getListener() {
        return ((C7185Ehv) this.context).A05;
    }

    public final int getOnNewResultStatusFlags() {
        return this.onNewResultStatusFlags;
    }

    public final EUs getResponseBytesRange() {
        return this.responseBytesRange;
    }

    public Uri getUri() {
        Uri uri = ((C7185Ehv) this.context).A07.A04;
        C7384Etj.A0U(uri);
        return uri;
    }

    public EUt(InterfaceC7028EeZ<C6988Edo> interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        AnonymousClass003.A0u(interfaceC7028EeZ, interfaceC7029Eea);
        this.consumer = interfaceC7028EeZ;
        this.context = interfaceC7029Eea;
    }

    public String getQuery() {
        return getUri().getQuery();
    }

    public final void setLastIntermediateResultTimeMs(long j) {
        this.lastIntermediateResultTimeMs = j;
    }

    public final void setOnNewResultStatusFlags(int i) {
        this.onNewResultStatusFlags = i;
    }

    public final void setResponseBytesRange(EUs eUs) {
        this.responseBytesRange = eUs;
    }
}
