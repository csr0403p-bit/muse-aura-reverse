package com.facebook.acra.util;

import android.os.SystemClock;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class AcraRadioMonitorBridge {
    public static volatile AcraRadioListener mListener;

    public class OutputStreamDecorator extends OutputStream {
        public boolean closed;
        public final OutputStream mDecoratedStream;
        public final AcraRadioListener mListener;

        public OutputStreamDecorator(OutputStream outputStream, AcraRadioListener acraRadioListener) {
            this.mDecoratedStream = outputStream;
            this.mListener = acraRadioListener;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                if (!this.closed) {
                    this.mDecoratedStream.close();
                    this.closed = true;
                }
            } finally {
                this.mListener.onRadioActive(jElapsedRealtime, SystemClock.elapsedRealtime(), 0);
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.mDecoratedStream.flush();
            } finally {
                this.mListener.onRadioActive(jElapsedRealtime, SystemClock.elapsedRealtime(), 0);
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.mDecoratedStream.write(i);
            } finally {
                this.mListener.onRadioActive(jElapsedRealtime, SystemClock.elapsedRealtime(), 1);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.mDecoratedStream.write(bArr, i, i2);
            } finally {
                this.mListener.onRadioActive(jElapsedRealtime, SystemClock.elapsedRealtime(), i2);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.mDecoratedStream.write(bArr);
            } finally {
                this.mListener.onRadioActive(jElapsedRealtime, SystemClock.elapsedRealtime(), bArr.length);
            }
        }
    }

    public static OutputStream createOutputDecorator(OutputStream outputStream) {
        return mListener == null ? outputStream : new OutputStreamDecorator(outputStream, mListener);
    }

    public static void setRadioListener(AcraRadioListener acraRadioListener) {
        mListener = acraRadioListener;
    }
}
