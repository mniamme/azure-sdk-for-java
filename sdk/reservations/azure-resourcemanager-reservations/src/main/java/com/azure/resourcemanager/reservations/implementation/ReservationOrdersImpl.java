// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.reservations.fluent.ReservationOrdersClient;
import com.azure.resourcemanager.reservations.fluent.models.CalculatePriceResponseInner;
import com.azure.resourcemanager.reservations.fluent.models.ChangeDirectoryResponseInner;
import com.azure.resourcemanager.reservations.fluent.models.ReservationOrderResponseInner;
import com.azure.resourcemanager.reservations.models.CalculatePriceResponse;
import com.azure.resourcemanager.reservations.models.ChangeDirectoryRequest;
import com.azure.resourcemanager.reservations.models.ChangeDirectoryResponse;
import com.azure.resourcemanager.reservations.models.PurchaseRequest;
import com.azure.resourcemanager.reservations.models.ReservationOrderResponse;
import com.azure.resourcemanager.reservations.models.ReservationOrders;

public final class ReservationOrdersImpl implements ReservationOrders {
    private static final ClientLogger LOGGER = new ClientLogger(ReservationOrdersImpl.class);

    private final ReservationOrdersClient innerClient;

    private final com.azure.resourcemanager.reservations.ReservationsManager serviceManager;

    public ReservationOrdersImpl(
        ReservationOrdersClient innerClient,
        com.azure.resourcemanager.reservations.ReservationsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<CalculatePriceResponse> calculateWithResponse(PurchaseRequest body, Context context) {
        Response<CalculatePriceResponseInner> inner = this.serviceClient().calculateWithResponse(body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CalculatePriceResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CalculatePriceResponse calculate(PurchaseRequest body) {
        CalculatePriceResponseInner inner = this.serviceClient().calculate(body);
        if (inner != null) {
            return new CalculatePriceResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ReservationOrderResponse> list() {
        PagedIterable<ReservationOrderResponseInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ReservationOrderResponseImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationOrderResponse> list(Context context) {
        PagedIterable<ReservationOrderResponseInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ReservationOrderResponseImpl(inner1, this.manager()));
    }

    public ReservationOrderResponse purchase(String reservationOrderId, PurchaseRequest body) {
        ReservationOrderResponseInner inner = this.serviceClient().purchase(reservationOrderId, body);
        if (inner != null) {
            return new ReservationOrderResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReservationOrderResponse purchase(String reservationOrderId, PurchaseRequest body, Context context) {
        ReservationOrderResponseInner inner = this.serviceClient().purchase(reservationOrderId, body, context);
        if (inner != null) {
            return new ReservationOrderResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ReservationOrderResponse> getWithResponse(
        String reservationOrderId, String expand, Context context) {
        Response<ReservationOrderResponseInner> inner =
            this.serviceClient().getWithResponse(reservationOrderId, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ReservationOrderResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ReservationOrderResponse get(String reservationOrderId) {
        ReservationOrderResponseInner inner = this.serviceClient().get(reservationOrderId);
        if (inner != null) {
            return new ReservationOrderResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ChangeDirectoryResponse> changeDirectoryWithResponse(
        String reservationOrderId, ChangeDirectoryRequest body, Context context) {
        Response<ChangeDirectoryResponseInner> inner =
            this.serviceClient().changeDirectoryWithResponse(reservationOrderId, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ChangeDirectoryResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ChangeDirectoryResponse changeDirectory(String reservationOrderId, ChangeDirectoryRequest body) {
        ChangeDirectoryResponseInner inner = this.serviceClient().changeDirectory(reservationOrderId, body);
        if (inner != null) {
            return new ChangeDirectoryResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ReservationOrdersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.reservations.ReservationsManager manager() {
        return this.serviceManager;
    }
}