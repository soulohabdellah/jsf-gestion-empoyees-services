/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

/**
 *
 * @author LACHGAR
 */
public interface IDAO<T> {

    boolean create(T o);

    boolean update(T o);

    boolean delete(T o);

    T getById(int id);

    List<T> getAll();

}