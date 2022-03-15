/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llqueue;

/**
 *
 * @author ncrta
 */
public interface IQueue {
int size();
boolean isEmpty();
Object first();
void add(Object item) throws QueueFullException;
Object remove();
}