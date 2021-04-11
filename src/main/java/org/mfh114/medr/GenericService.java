package org.mfh114.medr;

/***
 * This generic service type. Service class must implements request model to
 * process the data and return the response to the caller.
 * 
 * @author fhaider
 *
 * @param <Req> RequestModel type
 * @param <Res> ResponseMOdel type
 */
public interface GenericService<Req extends RequestModel, Res extends ResponseModel> {

	
}
